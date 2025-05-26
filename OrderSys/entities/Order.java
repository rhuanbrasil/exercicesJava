package entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;
    List<OrderItem> items = new ArrayList<OrderItem>();
    private Client client;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/MM/yyyy");

    public Order() {
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }
    public void removeItem(OrderItem item) {
        items.remove(item);
    }
    public Double TotalPrice(List <OrderItem> items) {
        double sum = 0;
        for (OrderItem item : items) {
             sum += item.subTotal();
        }
        return sum;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public List<OrderItem> getItems() {
        return items;
    }

    public void setItems(List<OrderItem> items) {
        this.items = items;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (OrderItem item : items) {
            sb.append("\n");
            sb.append(item.getProduct().getName());
            sb.append(", ");
            sb.append(item.getPrice().toString());
            sb.append(", Quantity: ");
            sb.append(item.getQuantity());
            sb.append(", Subtotal: ");
            sb.append(item.subTotal());
        }
        sdf2.format(moment);
        try {
            Date formatted = sdf2.parse(client.getBirthdate());
            return "Order Moment: " + sdf.format(getMoment())
                    + "\nOrder Status: " + getStatus()
                    + "\nClient: " + client.getName() +  " (" + sdf2.format(formatted) + ") - " + client.getEmail()
                    + "\nOrder Items: " + sb
                    + "\nTotal price: " + TotalPrice(items);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

}
