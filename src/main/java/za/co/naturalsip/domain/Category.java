package za.co.naturalsip.domain;
/*Product.java
  Product POJO Class
  Author: Asemahle Magwa( 222089059)
  Date:18 May 2025
 */

public class Category {
    private final Long id;
    private final String name;

    private Category(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
    }

    public static class Builder {
        private Long id;
        private String name;

        public Builder id(Long id) { this.id = id; return this; }
        public Builder name(String name) { this.name = name; return this; }

        public Category build() {
            return new Category(this);
        }
    }

    public Long getId() { return id; }
    public String getName() { return name; }
}
