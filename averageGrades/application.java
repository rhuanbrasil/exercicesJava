package averageGrades;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Double> list = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            System.out.print("Enter the first grade: ");
            list.add(sc.nextDouble());
        }
        util util = new util(list.get(0), list.get(1), list.get(2));
        System.out.println("The student average grade is: " + String.format("%.2f", util.average()));
    }
}
