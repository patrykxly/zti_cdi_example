package zti.zti_cicd_demo.services;

import javax.enterprise.inject.Alternative;

@Alternative
public class AlternativePaymentService extends PaymentService {

    @Override
    public void processPayment(int orderNumber) {
        // Implementacja alternatywnego procesu płatności
        System.out.println("Alternatywne przetwarzenie płatności za zamówienie #" + orderNumber);
    }
}
