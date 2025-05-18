package za.co.naturalsip.factory;
/*CategoryFactory.java
  Author: Asemahle Magwa( 222089059)
  Date:18 May 2025

 */

import za.co.naturalsip.domain.Category;

public class CategoryFactory {

    public static Category createCategory(Long id, String name) {
        return new Category.Builder()
                .id(id)
                .name(name)
                .build();
    }
}
