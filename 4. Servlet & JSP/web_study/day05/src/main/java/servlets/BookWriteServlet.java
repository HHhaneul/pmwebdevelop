package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@WebServlet("/book/write")
public class BookWriteServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String[] addCss = {"style1", "style2"};
        List<String> addScript = Arrays.asList("script1", "script2");

        req.setAttribute("addCss", addCss);
        req.setAttribute("addScript", addScript);

        RequestDispatcher rd = req.getRequestDispatcher("/WEB-INF/view/book/write.jsp");
        rd.forward(req, resp);
    }

}
