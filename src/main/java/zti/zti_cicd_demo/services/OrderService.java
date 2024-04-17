package zti.zti_cicd_demo.services;

import jakarta.enterprise.context.ApplicationScoped;
import zti.zti_cicd_demo.model.Database;
import zti.zti_cicd_demo.model.Order;
import jakarta.inject.Inject;

@ApplicationScoped
public class OrderService {

    @Inject
    private PaymentService paymentService;

    @Inject
    private NotificationService notificationService;

    public void processOrder(Order order) {
        paymentService.processPayment(0);
        Database database = new Database();
        database.saveOrder(order);
        notificationService.sendNotification(order.getCustomerEmail(), "Twoje zamówienie o numerze " + order.getOrderId() + " zostało złożone.");
    }
}
