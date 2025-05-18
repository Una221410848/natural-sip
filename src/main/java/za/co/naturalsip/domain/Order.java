package za.co.naturalsip.domain;

/*Order.java
  Order POJO Class
  Author: Junior Mageza( 222864273)
  Date:18 May 2025
 */


import java.time.LocalDate;
import java.time.chrono.Chronology;


public class Order {
    private Long orderID;
    private LocalDate date;
    private String status;

    public Order() {
    }

    public Order(Builder builder) {
        this.orderID = builder.orderID;
        this.date = builder.date;
        this.status = builder.status;
    }

    public Long getOrderID() {
        return orderID;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderID=" + orderID +
                ", date=" + date +
                ", status=" + status +
                '}';
    }

    public static class Builder {
        private Long orderID;
        private LocalDate date;
        private String status;

        public Builder setOrderID(Long orderID) {
            this.orderID = orderID;
            return this;
        }

        public Builder setDate(LocalDate date) {
            this.date = date;
            return this;
        }

        public Builder setStatus(String status) {
            this.status = status;
            return this;
        }

        public Builder copy(Order order) {
            this.orderID = order.orderID;
            this.date = order.date;
            this.status = order.status;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }
}