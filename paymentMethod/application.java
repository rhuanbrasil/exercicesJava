package paymentMethod;
import java.util.*;

public class application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();


        list.add("\n1. PIX (15% discount)");
        list.add("\n2. credit card 1x (10% discount)");
        list.add("\n3. credit card 2x (No IR)");
        list.add("\n4. credit card 3x or more (10% IR)");


        System.out.print("Please enter the product price: U$");
        double value = sc.nextDouble();
        System.out.print("Please, select the payment method: ");
        System.out.println(String.join(" ", list));
        int response = sc.nextInt();
        util util = new util(value);
        double finalValue = util.valueSout(response);
        System.out.println("The value to be paid is: " +String.format("%.2f", finalValue));


    }

}
