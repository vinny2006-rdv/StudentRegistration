
package student;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/register")
public class RegisterServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request,
            HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("sname");
        String roll = request.getParameter("roll");
        String email = request.getParameter("email");

        out.println("<html><body>");
        out.println("<h2>Registration Successful!</h2>");
        out.println("<h3>Student Details</h3>");

        out.println("Student Name: " + name + "<br><br>");
        out.println("Roll Number: " + roll + "<br><br>");
        out.println("Email: " + email + "<br><br>");

        out.println("</body></html>");
    }
}
