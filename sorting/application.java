package sorting;

import java.util.*;

public class application {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>(3);
        for (int i = 0; i < 3; i++) {
            System.out.println("enter the first number: ");
            list.add(sc.nextInt());
        }
        list.sort(Collections.reverseOrder());
        System.out.println(list);

    }
}
