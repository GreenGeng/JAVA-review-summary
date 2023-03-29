package summary.safe.ssrf.web;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

@WebServlet("/readfileServlet")
public class DownloadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String filename = "1.txt";
        String url = request.getParameter("url");
        response.setHeader("content-disposition", "attachment;fileName=" + filename);
        int len;
        OutputStream outputStream = response.getOutputStream();
        URL file = new URL(url);
        byte[] bytes = new byte[1024];
        InputStream inputStream = file.openStream();
        while ((len = inputStream.read(bytes)) > 0) {
            outputStream.write(bytes, 0, len);
        }
    }
}
