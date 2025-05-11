package IMC;

import java.util.Locale;
import java.util.Scanner;

import static IMC.util.imcSout;

public class application {
    public  static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Insert your height!");
        double height = sc.nextDouble();
        System.out.println("Insert your weight!");
        double weight = sc.nextDouble();
        util util = new util(height, weight);
        double imc = util.imcCalculator();
        System.out.println("Your imc is " + String.format("%.2f", imc) + " " + imcSout(imc));

    }
}
