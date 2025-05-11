package exercices;
import java.util.Scanner;
import java.util.Locale;

public class test {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Enter the amount of loops: ");
        int n = sc.nextInt();


        util[] vect = new util[9];
        for (int i = 0; i < n; i++) {
            sc.nextLine();
            System.out.println("Rent #" + (i+1));
            System.out.print("Name: ");
            String Name= (sc.nextLine());
            System.out.print("Email: ");
            String email = (sc.nextLine());
            System.out.print("Room: ");
            int room = (sc.nextInt());
            vect[room] = new util(Name, email);
        }
        System.out.println("Busy rooms");
        for (int i = 0; i <= 9; i++) {
            if (vect[i] != null) {
                System.out.printf("%d: %s%n", i, vect[i]);;

            }
        }
    }
}