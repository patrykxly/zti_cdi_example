package zti.zti_cicd_demo.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

@ApplicationScoped
public class UserService {

    @Inject
    private NotificationService notificationService;

    @Inject
    private PaymentService paymentService;

    public void registerUser(String email) {
        notificationService.sendNotification(email, "Witaj! Zarejestrowano nowego użytkownika.");
        paymentService.processPayment(1);
    }
}