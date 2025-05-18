package za.co.naturalsip.factory;

/*ProductFactory.java
  Author: Asemahle Magwa( 222089059)
  Date:18 May 2025

 */

import za.co.naturalsip.domain.Product;

public class ProductFactory {

    public static Product createProduct(int productID, String productName,double price, String description){
        return new Product.Builder()
                .setProductID(productID)
                .setProductName(productName)
                .setDescription(description)
                .setPrice(price)
                .build();
    }
}