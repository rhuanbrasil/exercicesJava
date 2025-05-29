package entities;

import java.util.*;

public class OrderItem {
    private Integer quantity;
    private Double price;
    Product product;


    public Integer getQuantity() {
        return quantity;
    }

    public OrderItem(Integer quantity,Double price, Product product) {
        this.quantity = quantity;
        this.price = price;
        this.product = product;
    }

    public OrderItem(Integer quantity, Double price) {
        this.quantity = quantity;
        this.price = price;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public OrderItem() {
    }


    public double subTotal(){
        return price * quantity;
    }
}
