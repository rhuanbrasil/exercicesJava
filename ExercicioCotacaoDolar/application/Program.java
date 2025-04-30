package application;
import util.CurrencyConverter;

import java.util.Scanner;
public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("What is the dollar price? ");
        double value = sc.nextDouble();
        System.out.println("What is the amount? ");
        double amount = sc.nextDouble();
        System.out.println("Amount to be paid in reais: " + String.format("%.2f", CurrencyConverter.convert(value, amount)));

    }
}
