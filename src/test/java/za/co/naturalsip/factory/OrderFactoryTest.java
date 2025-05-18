package za.co.naturalsip.factory;

/*OrderFactory.java
  Author: Junior Mageza(222864273)
  Date:18 May 2025
 */

import org.junit.jupiter.api.Test;
import za.co.naturalsip.domain.Order;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;


class OrderFactoryTest {

    @Test
    void createOrder_success() {
        Order order = OrderFactory.createOrder(1001L, LocalDate.of(2025, 5, 18), "Processing");

        assertNotNull(order);
        assertEquals(1001L, order.getOrderID());
        assertEquals(LocalDate.of(2025, 5, 18), order.getDate());
        assertEquals("Processing", order.getStatus());

        System.out.println("Created Order: " + order);
    }

    @Test
    void createOrder_nullFields_shouldThrowException() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            OrderFactory.createOrder(null, LocalDate.now(), "Pending");
        });
        assertEquals("Order fields cannot be null or empty", exception.getMessage());

        Exception exception2 = assertThrows(IllegalArgumentException.class, () -> {
            OrderFactory.createOrder(1002L, null, "Pending");
        });
        assertEquals("Order fields cannot be null or empty", exception2.getMessage());

        Exception exception3 = assertThrows(IllegalArgumentException.class, () -> {
            OrderFactory.createOrder(1003L, LocalDate.now(), null);
        });
        assertEquals("Order fields cannot be null or empty", exception3.getMessage());

        Exception exception4 = assertThrows(IllegalArgumentException.class, () -> {
            OrderFactory.createOrder(1004L, LocalDate.now(), "");
        });
        assertEquals("Order fields cannot be null or empty", exception4.getMessage());
    }
}