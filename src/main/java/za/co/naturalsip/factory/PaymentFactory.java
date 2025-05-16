package za.co.naturalsip.factory;
/*PaymentFactory.java
  Author: Unathi Keke( 221410848)
  Date:16 May 2025
 */
import za.co.naturalsip.domain.Payment;

public class PaymentFactory {

    public static Payment createPayment(Long id, Payment.Method method, double total) {
        return new Payment.Builder()
                .id(id)
                .method(method)
                .total(total)
                .build();
    }
}
