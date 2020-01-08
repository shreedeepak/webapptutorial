package webapp;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name ="/Login")
public class Login extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        out.println("doPost-version<br>");
        out.println("login-name" + request.getParameter("loginname") + " password:"+request.getParameter("password"));
       /* String loginname = request.getParameter("loginname");
        String password = request.getParameter("password");
        if (loginname.equals("java") && password.equals("1234")) {
            response.sendRedirect("member.jsp");
        } else {
           response.sendRedirect("error.jsp");
        }*/


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
       // System.out.println(request.getContextPath());
        PrintWriter out = response.getWriter();
        out.println("login-name" + request.getParameter("loginname") + "password:" + request.getParameter("password"));

    }
}
