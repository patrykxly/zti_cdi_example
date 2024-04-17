package zti.zti_cicd_demo;

import java.io.IOException;
import jakarta.inject.Inject;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import zti.zti_cicd_demo.model.Order;
import zti.zti_cicd_demo.services.OrderService;

@WebServlet("/order")
public class OrderServlet extends HttpServlet {

    @Inject
    private OrderService orderService;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String customerEmail = request.getParameter("email");
        String productName = request.getParameter("productName");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        Order order = new Order(customerEmail, productName, quantity);

        orderService.processOrder(order);

        response.getWriter().println("Zamówienie zostało złożone. Potwierdzenie zostało wysłane na adres: " + customerEmail);
    }
}
