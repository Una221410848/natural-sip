package za.co.naturalsip.factory;
/*ProductFactoryTest.java
  Author: Asemahle Magwa( 222089059)
  Date:16 May 2025
 */

import org.junit.jupiter.api.Test;
import za.co.naturalsip.domain.Category;
import za.co.naturalsip.domain.Product;

import static org.junit.jupiter.api.Assertions.*;

public class ProductFactoryTest {

    @Test
    public void testCreateProduct() {
        Category category = CategoryFactory.createCategory(2L, "Detox");
        Product product = ProductFactory.createProduct(10, "Detox Shot", 5.99, "This juice helps keep you gut healthy");

        assertEquals(10L, product.getProductID());
        assertEquals("Detox Shot", product.getProductName());
        assertEquals(5.99, product.getPrice());
        assertEquals("Detox", product.getDescription());
        assertEquals("Detox", category.getName());
    }
}