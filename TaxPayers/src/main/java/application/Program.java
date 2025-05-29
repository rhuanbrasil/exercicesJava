package application;

import entities.Company;
import entities.Individual;
import entities.Person;

import java.util.*;
public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();
        double sum = 0;

        List<Person> persons = new ArrayList<>();

        sc.nextLine();
        for (int i = 0; i < n; i++) {
            System.out.println("Tax payer #" + (i + 1) + " data:");
            System.out.println("Individual or company (i/c)?");
            String r = sc.next().strip().toLowerCase().charAt(0) + "";
            if (r.equals("i")) {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();

                Person person = new Individual(name, anualIncome, healthExpenditures);
                persons.add(person);
            }else {
                System.out.print("Name: ");
                String name = sc.next();
                System.out.print("Anual income: ");
                double anualIncome = sc.nextDouble();
                System.out.print("Number of employees: ");
                Integer employeesNumber = sc.nextInt();

                Person person = new Company(name, anualIncome, employeesNumber);
                persons.add(person);
            }
        }
        System.out.println("TAXES PAID:");
        for (Person person : persons) {

            System.out.println(person.getName() + ": $" + String.format("%.2f", person.taxCalculation()) );
            sum += person.taxCalculation();
        }
        System.out.print("Total taxes: " + String.format("%.2f", sum));
    }
}
