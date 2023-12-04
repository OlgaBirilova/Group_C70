package Homework22.homework;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public class AgeServlet { extends HttpServlet {

    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        try {
            int age = Integer.parseInt(request.getParameter("age"));
            if (age >= 18) {
                out.println("<h3>You are an adult</h3>");
            } else {
                out.println("<h3>You are not an adult yet</h3>");
            }
        } catch (NumberFormatException e) {
            out.println("<h3>Invalid age</h3>");
        }
        out.println("</body></html>");
    }

}