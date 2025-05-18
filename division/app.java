package division;

import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number for A:");
        int a = sc.nextInt();
        System.out.println("Enter a Number for B:");
        int b = sc.nextInt();
        int quotient = a/b;
        int remainder = a%b;
        System.out.println("The quotient is " + quotient);
        System.out.println("The remainder is " + remainder);
    }
}
