package za.co.naturalsip.factory;
/*OrderItemFactory.java
  Author: Sibusiso Makaula (217101887)
  Date:17 May 2025
 */
import za.co.naturalsip.domain.OrderItem;

public class OrderItemFactory {
    public static OrderItem createOrderItem(int quantity, double price) {
        return new OrderItem.Builder()
                .setQuantity(quantity)
                .setPrice(price)
                .build();

    }

}
