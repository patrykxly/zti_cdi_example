package zti.zti_cicd_demo;

import jakarta.inject.Inject;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import zti.zti_cicd_demo.services.UserService;
import java.io.IOException;

@WebServlet(urlPatterns = "/register")
public class UserServlet extends HttpServlet {

    @Inject
    private UserService userService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String email = request.getParameter("email");
        userService.registerUser(email);
        response.getWriter().println("Uzytkownik zostal zarejestrowany. Email: " + email);
    }
}
