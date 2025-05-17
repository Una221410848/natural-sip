package za.co.naturalsip.factory;
/*CustomerFactory.java
  Author: Unathi Keke( 221410848)
  Date:16 May 2025
 */
import za.co.naturalsip.domain.Customer;

public class CustomerFactory {
    public static Customer createCustomer(Long id, String name, String email) {
        return new Customer.Builder()
                .id(id)
                .name(name)
                .email(email)
                .build();
    }
}
