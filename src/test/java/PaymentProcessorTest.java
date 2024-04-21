import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import zti.zti_cicd_demo.services.PaymentProcessor;
import zti.zti_cicd_demo.services.PaymentService;

import static org.mockito.Mockito.*;

public class PaymentProcessorTest {

    @Mock
    private PaymentService mockPaymentService;

    @InjectMocks
    private PaymentProcessor paymentProcessor;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testProcessPaymentWithAlternativeService() {
        // Mockowanie zachowania metody processPayment() w AlternativePaymentService
        doNothing().when(mockPaymentService).processPayment(1);

        // Wywołanie metody processPayment() w PaymentProcessor
        paymentProcessor.processPayment();

        // Sprawdzenie, czy metoda processPayment() została wywołana
        verify(mockPaymentService, times(1)).processPayment(1);
    }
}
