package switchingValues;

import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value A");
        int a = sc.nextInt();
        System.out.println("Enter the value B");
        int b = sc.nextInt();

        int temp = a;
        a = b;
        b = temp;

        System.out.println("Value A is: " + a);
        System.out.println("Value B is: " + b);

    }
}
