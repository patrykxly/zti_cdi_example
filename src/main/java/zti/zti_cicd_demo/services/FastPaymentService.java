package zti.zti_cicd_demo.services;

import jakarta.enterprise.context.ApplicationScoped;
import zti.zti_cicd_demo.qualificators.FastPayment;

@FastPayment
@ApplicationScoped
public class FastPaymentService implements PaymentService {

    public void processPayment(int orderNumber) {
        System.out.println("Szybkie przetwarzanie płatności za zamówienie #" + orderNumber);
    }
}
