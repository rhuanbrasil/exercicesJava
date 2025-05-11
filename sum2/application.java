package sum2;
import java.util.*;

public class application {
    public static void main(String[] args) {
    Locale.setDefault(Locale.US);
    Scanner sc=new Scanner(System.in);


        System.out.println("Enter the first number");
        int A=sc.nextInt();
        System.out.println("Enter the second number");
        int B=sc.nextInt();

        if(A==B){
            System.out.println("the sum of the previous numbers is " + (A+B));
        } else{
            int c = A * B;
            System.out.println("The product of the previous numbers is: " + c);
        }

    }
}
