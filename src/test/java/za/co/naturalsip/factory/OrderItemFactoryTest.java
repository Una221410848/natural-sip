package za.co.naturalsip.factory;
/*OrderItemFactoryTest.java
  Author: Sibusiso Makaula (217101887)
  Date:17 May 2025
 */
import org.junit.Test;
import za.co.naturalsip.domain.OrderItem;

import static org.junit.Assert.assertEquals;

public class OrderItemFactoryTest {
    @Test
    public void testCreateOrderItem(){
            OrderItem item = OrderItemFactory.createOrderItem( 2, 12.98);
            assertEquals(2, item.getQuantity());
            assertEquals(12.98, item.getPrice());

        }
    }

