package za.co.naturalsip.factory;
/*ProductFactoryTest.java
  Author: Asemahle Magwa( 222089059)
  Date:16 May 2025
 */

import org.junit.jupiter.api.Test;
import za.co.naturalsip.domain.Category;

import static org.junit.jupiter.api.Assertions.*;

public class CategoryFactoryTest {

    @Test
    public void testCreateCategory() {
        Category category = CategoryFactory.createCategory(1L, "Immunity");
        assertEquals(1L, category.getId());
        assertEquals("Immunity", category.getName());
    }
}