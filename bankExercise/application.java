package bankExercise;
import java.util.Scanner;

public class application {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter account number: ");
    int id = sc.nextInt();
    System.out.println("Enter account holder name: ");
    String name = sc.next();
    util util = new util(name, id);
    sc.nextLine();
    System.out.print("Is there a initial deposit?(yes/no) : ");
    String yesOrNo = sc.next().strip().toLowerCase();
    if (yesOrNo.equals("yes")) {
        System.out.print("Enter a initial deposite value: ");
        util.deposit(sc.nextDouble());
    }else {
        System.out.println(util);
    }
    System.out.print("Enter a deposite value: ");
    util.deposit(sc.nextDouble());
    System.out.println("Updated account data:");
    System.out.println(util);
    System.out.print("Enter a withdraw value: ");
    util.withdraw(sc.nextDouble());
    System.out.println("Updated account data:");
    System.out.println(util);





    }
}