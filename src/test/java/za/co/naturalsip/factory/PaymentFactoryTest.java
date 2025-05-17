package za.co.naturalsip.factory;
/*PaymentFactoryTest.java
  Author: Unathi Keke( 221410848)
  Date:16 May 2025
 */
import org.junit.jupiter.api.Test;
import za.co.naturalsip.domain.Payment;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PaymentFactoryTest {

    @Test
    public void testCreatePayment() {
        Payment payment = PaymentFactory.createPayment(100L, Payment.Method.CREDIT_CARD, 59.99);
        assertEquals(100L, payment.getId());
        assertEquals(Payment.Method.CREDIT_CARD, payment.getMethod());
        assertEquals(59.99, payment.getTotal());
    }
}

