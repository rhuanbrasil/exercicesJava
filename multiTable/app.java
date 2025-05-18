package multiTable;

public class app {
    public static void main(String[] args){
        int j = 1;
        for (int i = 1; j <= 10; i++) {
            System.out.println(j + " x " + i + " = " + (j*i));
            if(i == 10){
                i = 0;
                j++;
            }

        }
    }
}
