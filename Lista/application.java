package Lista;
import java.util.*;

public class application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int id = 0;
        String name = "";
        double salary = 0;


        List<util> persons = new ArrayList<util>();

        System.out.print("Enter an array length: ");
        int length = sc.nextInt();
        for (int i = 0; i < length; i++) {
            System.out.println("Employee #" + (i + 1));
            System.out.print("Id: ");
            id = sc.nextInt();
            sc.nextLine();
            System.out.print("Name: ");
            name = sc.nextLine();
            System.out.print("Salary: ");
            salary = sc.nextDouble();
            persons.add(new util(id, name, salary));
        }
        System.out.print("Enter the employee id that will have a salary increase: ");
        int idcheck = sc.nextInt();
        for (int i = 0; i < persons.size(); i++) {
            if (idcheck == persons.get(i).getId()) {
                System.out.print("Enter the percentage: ");
                int percentage = sc.nextInt();
                persons.get(i).setBonus(percentage);
                persons.get(i).increaseSalary();
            } else if (i == persons.size() - 1){
                System.out.println("Invalid ID");
            }
        }
        System.out.println("List of employees: ");
        for (int i = 0; i < persons.size(); i++) {
            System.out.println(persons.get(i).ToString());
        }

    }
}



