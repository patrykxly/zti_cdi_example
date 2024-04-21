package zti.zti_cicd_demo.services;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Default;

@Default
@ApplicationScoped
public class DefaultPaymentService implements PaymentService {

    public void processPayment(int orderNumber) {
        System.out.println("Przetwarzanie płatności za zamówienie #" + orderNumber);
    }
}
