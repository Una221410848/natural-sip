package za.co.naturalsip.factory;

/*OrderFactory.java
  Author: Junior Mageza(222864273)
  Date:18 May 2025
 */

import za.co.naturalsip.domain.Order;

import java.time.LocalDate;



public class OrderFactory {

    public static Order createOrder(Long orderID, LocalDate date, String status) {
        if (orderID == null || date == null || status == null || status.isEmpty()) {
            throw new IllegalArgumentException("Order fields cannot be null or empty");
        }

        return new Order.Builder()
                .setOrderID(orderID)
                .setDate(date)
                .setStatus(status)
                .build();
    }
}