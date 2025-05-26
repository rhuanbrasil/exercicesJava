package application;

import entities.*;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.*;

public class program {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Enter client data");
        System.out.print("Name: ");
        String nameClient = sc.nextLine();
        System.out.print("Email:");
        String emailClient = sc.next();
        System.out.print("Birthdate (DD/MM/YYYY):");
        Date date = sdf.parse(sc.next());
        String birthdate = sdf.format(date);
        System.out.println("Enter order data:");
        System.out.print("Status: ");
        String orderStatus = sc.next();
        Client client = new Client(nameClient, emailClient, birthdate);

        System.out.println("How many items to this order?");
        int n = sc.nextInt();
        sc.nextLine();

        Date today = new Date();
        Order order = new Order(today, OrderStatus.valueOf(orderStatus), client);
        order.setClient(new Client(nameClient, emailClient, birthdate));

        for (int i = 0; i < n; i++) {

            System.out.print("Product name: ");
            String productName = sc.next();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
            Product product = new Product(productName, productPrice);
            OrderItem item = new OrderItem(quantity, productPrice, product);

            order.getItems().add(item);
           ;










        }
        System.out.println("ORDER SUMMARY");
        System.out.println(order);




    }
}