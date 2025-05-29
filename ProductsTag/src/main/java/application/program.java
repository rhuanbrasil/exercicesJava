package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

import java.sql.SQLOutput;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class program {
    public static void main(String[] args) throws ParseException {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);



        List<Product> products = new ArrayList<Product>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy", Locale.US);

        System.out.println("Enter the number of products you want to add: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Product #" + (i + 1));
            System.out.println("Common, used or imported (c/u/i)?");
            String r = sc.next().toLowerCase().strip().charAt(0) + "";

            if (r.equals("c")) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                products.add(new Product(name, price));
            } else if (r.equals("u")) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                String date = sc.next();
                Date manufactureDate = sdf.parse(date);
                products.add(new UsedProduct(name, price, manufactureDate));
            } else if (r.equals("i")) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Price: ");
                double price = sc.nextDouble();
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                products.add(new ImportedProduct(name, price, customsFee));
            }
        }
        System.out.println("PRICE TAGS:");
        for ( Product product : products ) {
            System.out.println(product.priceTag());
        }
    }
}
