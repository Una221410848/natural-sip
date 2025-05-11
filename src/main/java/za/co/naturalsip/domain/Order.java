package za.co.naturalsip.domain;

/*Order.java
  Order POJO Class
  Author: Junior Mageza( 222864273)
  Date:11 May 2025
 */

import java.io.ObjectInputFilter;
import java.util.Date;

public class Order {
    private long orderID;
    private Date date;
    private Status status;

    public Order() {
    }

    public Order (Builder builder){
        this.orderID = builder.orderID;
        this.date = builder.date;
        this.status = builder.status;
    }

    public long getOrderID() {
        return orderID;
    }

    public Date getDate() {
        return date;
    }

    public Status getStatus() {
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

    public static class Builder{
        private long orderID;
        private Date date;
        private Status status;

        public Builder setOrderID(long id){
            this.orderID = orderID;
            return this;
        }
        public Builder setDate(Date date){
            this.date = date;
            return this;
        }
        public Builder setStatus(Status status){
            this.orderID = orderID;
            return this;
        }
        public Builder copy (Order order){
            this.orderID = order.orderID;
            this.date = order.date;
            this.status = order.status;
            return this;
        }
        public Order build(){
            return new Order (this);
        }

    }
}

