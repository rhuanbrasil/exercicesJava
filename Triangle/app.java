package Triangle;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class app {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Double> arr = new ArrayList<Double>();
        for (int i = 0; i < 3;) {
            System.out.println("Enter the " + (i+1) + "th side of the triangle");
            double side = sc.nextDouble();
            if (side <= 0) {
                System.out.println("please insert a valid number(Greater than 0)");
                continue;
            }
            arr.add(side);
            i++;

        }
        util util = new util(arr.get(0), arr.get(1), arr.get(2));
        System.out.println(util.verifier());

    }
}
