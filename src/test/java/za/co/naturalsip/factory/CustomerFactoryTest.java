package za.co.naturalsip.factory;
/*CustomerFactoryTest.java
  Author: Unathi Keke( 221410848)
  Date:16 May 2025
 */
import org.junit.jupiter.api.Test;
import za.co.naturalsip.domain.Customer;

import static org.junit.jupiter.api.Assertions.*;

public class CustomerFactoryTest {

    @Test
    public void testCreateCustomer() {
        Customer customer = CustomerFactory.createCustomer(1L, "Unathi Keke", "221410848@mycput.ac.za");
        assertNotNull(customer);
        assertEquals(1L, customer.getId());
        assertEquals("Unathi Keke", customer.getName());
        assertEquals("221410848@mycput.ac.za", customer.getEmail());
    }
}

