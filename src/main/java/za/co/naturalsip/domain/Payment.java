package za.co.naturalsip.domain;
/*Customer.java
  Customer POJO Class
  Author: Unathi Keke( 221410848)
  Date:10 May 2025
 */

public class Payment {
    public enum Method {
        CREDIT_CARD, PAYPAL, BANK_TRANSFER
    }

    private final Long id;
    private final Method method;
    private final double total;

    private Payment(Builder builder) {
        this.id = builder.id;
        this.method = builder.method;
        this.total = builder.total;
    }

    public static class Builder {
        private Long id;
        private Method method;
        private double total;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder method(Method method) {
            this.method = method;
            return this;
        }

        public Builder total(double total) {
            this.total = total;
            return this;
        }

        public Payment build() {
            return new Payment(this);
        }
    }

    public Long getId() {
        return id;
    }
    public Method getMethod() {
        return method;
    }
    public double getTotal() {
        return total;
    }
}

