package za.co.naturalsip.domain;

/*Product.java
  Product POJO Class
  Author: Asemahle Magwa( 222089059)
  Date:10 May 2025
 */

public class Product {

    private  int productID;
    private  String productName;
    private  double price;
    private String description;

    public Product() {
    }

    public Product(Builder builder) {
        this.productID = builder.productID;
        this.productName = builder.productName;
        this.price = builder.price;
        this.description =builder.description;
    }

    public int getProductID() {

        return productID;
    }

    public String getProductName() {

        return productName;
    }

    public double getPrice() {

        return price;
    }

    public String getDescription() {

        return description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productID='" + productID + '\'' +
                ", productName='" + productName + '\'' +
                ", price=" + price +
                ", description='" + description + '\'' +
                '}';
    }

    public static class Builder{
        private int productID;
        private String productName;
        private double price;
        private String description;

        public Builder setProductID(int id){
            this.productID = id;
            return this;
        }
        public Builder setProductName(String name){
            this.productName = name;
            return this;
        }
        public Builder setPrice(double price){
            this.price = price;
            return this;
        }
        public Builder setDescription(String description){
            this.description = description;
            return this;
        }

        public Builder copy(Product product){
            this.productID = product.productID;
            this.productName = product.productName;
            this.price = product.price;
            this.description =product.description;
            return this;

        }
        public Product build(){
            return new Product(this);
        }

    }




}