package trueofFalse;

import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Is it true or false? ");
        String A1 = sc.next().toLowerCase().trim();
        System.out.println("Is it true or false? ");
        String A2 = sc.next().toLowerCase().trim();
        if (A1.equals("true") && A2.equals("true")) {
            System.out.println("it is true!");
        }else{
            System.out.println("it is false!");
        }
    }
}
