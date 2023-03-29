package summary.safe.ssrf.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;

@RestController("/")
public class Exec2Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }
    @RequestMapping("/exec2Servlet")
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String exec = request.getParameter("exec");
        ServletOutputStream outputStream = response.getOutputStream();
        ProcessBuilder processBuilder = new ProcessBuilder(exec);
        Process res = processBuilder.start();
        InputStream inputStream = res.getInputStream();
        int len ;
        byte[] bytes =new byte[1024];
        while ((len = inputStream.read(bytes))!=-1){
            outputStream.write(bytes,0,len);
        }
    }
}
