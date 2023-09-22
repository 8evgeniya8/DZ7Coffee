package coffee.order;

import java.util.ArrayDeque;
import java.util.Deque;

public class CoffeeOrderBoard {
    private Deque<Order> orderQueue;
    private int nextOrderNumber;

    public CoffeeOrderBoard() {
        this.orderQueue = new ArrayDeque<>();
        this.nextOrderNumber = 1;
    }

    public void add(String customerName) {
        if (nextOrderNumber == Integer.MAX_VALUE) {
            nextOrderNumber = 1;
        }
        if (customerName == null) {
            throw new IllegalArgumentException("Name cannot be null");
        }
        Order order = Order.builder()
                .orderNumber(nextOrderNumber)
                .customerName(customerName)
                .build();
        orderQueue.addLast(order);
        nextOrderNumber++;
    }

    public void deliver() {
        if (!orderQueue.isEmpty()) {
            Order orderToDeliver = orderQueue.removeLast();
            System.out.println("Delivering order #" +
                    orderToDeliver.getOrderNumber() +
                    " for " + orderToDeliver.getCustomerName());
        } else {
            System.out.println("No orders in the queue.");
        }
    }

    public void draw() {
        System.out.println("Current order queue:");
        for (Order order : orderQueue) {
            System.out.println("Order #" +
                    order.getOrderNumber() + " for " +
                    order.getCustomerName());
        }
    }
}
