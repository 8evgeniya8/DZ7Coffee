package coffee.order;

public class Order {
    private int orderNumber;
    private String customerName;

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    private Order(Builder builder) {
        this.orderNumber = builder.orderNumber;
        this.customerName = builder.customerName;
    }

    public static class Builder {
        private int orderNumber;
        private String customerName;

        public Builder orderNumber(int orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        public Builder customerName(String customerName) {
            this.customerName = customerName;
            return this;
        }

        public Order build() {
            return new Order(this);
        }
    }

    public static Builder builder() {
        return new Builder();
    }
}
