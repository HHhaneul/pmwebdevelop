package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;
import org.apache.commons.fileupload2.core.*;
import org.apache.commons.fileupload2.jakarta.JakartaServletDiskFileUpload;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.List;

@WebServlet("/file/upload")
public class FileUploadServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JakartaServletDiskFileUpload upload = new JakartaServletDiskFileUpload();
//        parseRequest(...): 요청 데이터 중 multipart를 양식과 파일 데이터 분리

        List<DiskFileItem> items = upload.parseRequest(req);
        for (FileItem item : items){
            String name = item.getFieldName();
            if (item.isFormField()){ // 일반 양식 데이터
                String  value = item.getString(Charset.forName("UTF-8"));
                System.out.printf("일반양식: %s, %s%n", name, value);
            }else { // 파일 데이터
                System.out.printf("파일: %s%n", name);
                String fileName = item.getName();
                String contentType = item.getContentType();
                Path path = Path.of("D:/uploads" + fileName);
                item.write(path);
                System.out.printf("fileName: %s, contentType: %s%n", fileName, contentType);
            }
        }
    }
}
