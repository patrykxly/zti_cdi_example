package zti.zti_cicd_demo.services;

import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class NotificationService {

    public void sendNotification(String recipient, String message) {
        System.out.println("Wysyłanie powiadomienia do: " + recipient);
        System.out.println("Treść: " + message);
    }
}