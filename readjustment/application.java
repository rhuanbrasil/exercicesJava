package readjustment;

import java.util.*;

public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num: ");
        int num = sc.nextInt();
        double calc = num * 0.95;
        System.out.println("Num with 5% readjustment: " + calc);
    }
}
