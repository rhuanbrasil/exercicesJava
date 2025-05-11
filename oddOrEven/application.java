package oddOrEven;
import java.util.InputMismatchException;
import  java.util.Scanner;
//Ler um número e identificar se é par ou impar e se é positivo ou negativo
public class application {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um numero: ");
        try{
            int n=sc.nextInt();
        System.out.println(util.tester(n, n));
        }catch (InputMismatchException e) {
            System.err.println("Por favor digite um numero inteiro");
        }
    }
}
