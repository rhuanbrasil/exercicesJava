package isUnderage;

import java.util.Locale;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = sc.nextLine();
        System.out.println("Please enter your age:");
        int age = sc.nextInt();
        verification util = new verification(age);
        System.out.println("The person: " + name + " " + util.isUnder18());
    }
}
