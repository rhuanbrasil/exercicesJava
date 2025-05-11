package sumExercise;
import java.util.Scanner;


//Exercicio que soma A e B e informa se é maior que C

public class application {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Digite o valor A: ");
    int a = sc.nextInt();
    System.out.print("Digite o valor B: ");
    int b = sc.nextInt();
    System.out.print("Digite o valor C: ");
    int c = sc.nextInt();
    if (a + b > c){
        System.out.println("A soma entre A e B é maior que C");
    }else {
        System.out.println("A soma entre A e B é menor que o valor de C");
    }


    }
}