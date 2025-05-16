package CelsiusConversor;

import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Insert a temperature in Fahrenheit");
        double fahrenheit = sc.nextDouble();

        util util = new util(fahrenheit);

        util.Conversor();
        System.out.println(String.format("%.2f ", util.getCelsius()) + " Celsius");

        System.out.println(String.format("%.2f ", util.getFahrenheit()) + " Fahrenheit");

        sc.close();

    }
}
