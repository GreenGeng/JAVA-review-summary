package summary.security.ssrf.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;

@WebServlet("/ssrfServlet")
public class SSRFServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String url = request.getParameter("url");   //接收url的传参
        //这里的url没有做过滤处理就可以访问该服务器里面的其他资源
        // 应该用白名单过滤
        String htmlContent;
        PrintWriter writer = response.getWriter();  //获取响应的打印流对象
        URL u = new URL(url);   //实例化url的对象
        try {
            URLConnection urlConnection = u.openConnection();//打开一个URL连接，并运行客户端访问资源。
            HttpURLConnection httpUrl = (HttpURLConnection) urlConnection;  //强转为HttpURLConnection
            BufferedReader base = new BufferedReader(new InputStreamReader(httpUrl.getInputStream(), "UTF-8"));  //获取url中的资源
            StringBuffer html = new StringBuffer();
            while ((htmlContent = base.readLine()) != null) {
                html.append(htmlContent);  //htmlContent添加到html里面
            }
            base.close();
            writer.println(html);//响应中输出读取的资源
            writer.flush();
        } catch (Exception e) {
            e.printStackTrace();
            writer.println("请求失败");
            writer.flush();
        }
    }
}