package application;

import entities.Employee;
import entities.OutsourcedEmployee;

import java.util.*;
public class program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.println("Enter the number of employees: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.println("Employee #" + (i + 1) + " data: ");
            System.out.println("Outsourced?(Y/N): ");
            String s = sc.next().strip().toLowerCase();
            sc.nextLine();
            if (s.equals("n")) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();
                Employee newEmployee = new Employee(name, hours, valuePerHour);
                employees.add(newEmployee);

                employees.get(i).payment();
            } else if (s.equals("y")) {
                System.out.print("Name: ");
                String name = sc.nextLine();
                System.out.print("Hours: ");
                Integer hours = sc.nextInt();
                System.out.print("Value per hour: ");
                Double valuePerHour = sc.nextDouble();
                System.out.print("Additional charge: ");
                Double additionalCharge = sc.nextDouble();
                Employee newEmployee = new OutsourcedEmployee(name, hours, valuePerHour, additionalCharge);
                employees.add(newEmployee);

                employees.get(i).payment();
            }
        }
        System.out.println("Payments:");
        for (Employee emp : employees) {
            System.out.println(emp.getName() + " - $ " + String.format("%.2f", emp.payment()));
        }
    }
}
