package salaryQuantity;
import java.util.*;

public class Application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your salary: ");
        double salary = sc.nextDouble();
        double calc = salary/1293.20;
        System.out.printf("Your salary is: %.1f times the minimum salary",calc);
    }
}
