package zti.zti_cicd_demo.services;

import jakarta.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Alternative;

@ApplicationScoped
public class PaymentService {

    public void processPayment(int orderNumber) {
        System.out.println("Przetwarzanie płatności za zamówienie #" + orderNumber);
    }
}
