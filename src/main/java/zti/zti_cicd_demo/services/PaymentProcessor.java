package zti.zti_cicd_demo.services;

import javax.inject.Inject;

public class PaymentProcessor {

    @Inject
    private PaymentService paymentService;

    public void processPayment() {
        paymentService.processPayment(1);
    }
}

