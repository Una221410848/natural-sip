package za.co.naturalsip.domain;

public class Category {
    private  int productID;
    private  String categoryName;


    public Category() {
    }

    public Category(Category.Builder builder) {
        this.productID = builder.productID;
        this.categoryName = builder.categoryName;

    }

    public int getProductid() {

        return productID;
    }

    public String getCategoryName() {

        return categoryName;
    }

    @Override
    public String toString() {
        return "Category{" +
                "productID=" + productID +
                ", categoryName='" + categoryName + '\'' +
                '}';
    }

    public static class Builder{
        private int productID;
        private String categoryName;

        public Category.Builder setProductID(int id){
            this.productID = productID;
            return this;
        }
        public Category.Builder setProductName(String name){
            this.categoryName = categoryName;
            return this;
        }


        public Category.Builder copy(Category category){
            this.productID = category.productID;
            this.categoryName = category.categoryName;
            return this;

        }
        public Category build(){
            return new Category(this);
        }

    }




}

