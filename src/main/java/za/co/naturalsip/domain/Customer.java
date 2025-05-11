package za.co.naturalsip.domain;

/*Customer.java
  Customer POJO Class
  Author: Unathi Keke( 221410848)
  Date:10 May 2025
 */
public class Customer {
    private final Long id;
    private final String name;
    private final String email;

    private Customer(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.email = builder.email;
    }
    public static class Builder {
        private Long id;
        private String name;
        private String email;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }
        public Builder name(String name) {
            this.name = name;
            return this;
        }
        public Builder email(String email) {
            this.email = email;
            return this;
        }
        public Customer build() {
            return new Customer(this);
        }
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}
