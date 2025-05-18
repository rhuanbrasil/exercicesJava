package randomNum;

import java.util.Random;

public class app {
    public static void main(String[] args) {
        Random rand = new Random();
        int i = rand.nextInt(100);
        System.out.println(i);
    }
}
