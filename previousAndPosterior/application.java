package previousAndPosterior;
import  java.util.*;
public class application {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Locale.setDefault(Locale.US);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        System.out.println("Previous number: " + (n-1) + " Posterior number: " + (n+1));


    }
}