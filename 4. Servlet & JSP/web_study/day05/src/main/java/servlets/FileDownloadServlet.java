package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.*;

@WebServlet("/file/download")
public class FileDownloadServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        OutputStream out = resp.getOutputStream();
        File file = new File("D:/uploads/abc.txt");
        try(FileInputStream fis = new FileInputStream(file);
            BufferedInputStream bis = new BufferedInputStream(fis)) {

            String fileName = "한글파일명.txt";

            fileName = new String(fileName.getBytes("UTF-8"),"IS08859_1");

            resp.setHeader("Content-Disposition", "attachment; filename=" + fileName);
            resp.setHeader("Content-Type", "application/octet-stream");
            resp.setIntHeader("Expires", 0); // 파일 용량이 큰 경우 만료 X
            resp.setHeader("Cache-Control", "must-revalidate");
            resp.setHeader("Pragma", "public");
            resp.setHeader("Content-Length", String.valueOf(file.length()));

            while (bis.available() > 0){
                out.write(bis.read());
            }
            out.flush();
        }
    }
}

