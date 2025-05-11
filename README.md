The table below describes the UML diagram beneath it for an e-commerce platform selling health shots.

| Class       | Description                                         |
| ----------- | --------------------------------------------------- |
| `Customer`  | Represents a user who places orders.                |
| `Order`     | A customer's purchase containing multiple items.    |
| `OrderItem` | Represents a specific product in an order.          |
| `Product`   | Represents a health shot (Gut, Brain, Detox, etc.). |
| `Category`  | Groups products into types like Gut, Brain, etc.    |
| `Address`   | Shipping address for a customer.                    |
| `Payment`   | Payment record for an order.                        |

UML Diagram for Natural-Sip e-commerce platform.

+----------------+         1        *         +----------------+
|   Customer     |----------------------------|     Order      |
+----------------+                            +----------------+
| - id: Long     |                            | - id: Long     |
| - name: String |                            | - date: Date   |
| - email: String|                            | - status: Enum |
+----------------+                            +----------------+
        |                                            |
        |                                            | 1
        |                                            |
        |                                            v
+----------------+                          +----------------+
|   Address      |<-------------------------|    Payment     |
+----------------+                          +----------------+
| - street       |                          | - id: Long     |
| - city         |                          | - method: Enum |
+----------------+                          | - total: double|
                                            +----------------+

        |                                            |
        | 1                                          | 1
        |                                            |
        v                                            v
+----------------+           *        1         +----------------+
|  OrderItem     |----------------------------->|    Product     |
+----------------+                              +----------------+
| - quantity     |                              | - id: Long     |
| - price        |                              | - name: String |
+----------------+                              | - price: double|
                                                +----------------+
                                                       |
                                                       | 1
                                                       |
                                                       v
                                                +----------------+
                                                |   Category     |
                                                +----------------+
                                                | - id: Long     |
                                                | - name: String |
                                                +----------------+
