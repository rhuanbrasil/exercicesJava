package oddOrEven;

import java.util.InputMismatchException;

public class util {
    public static String tester(int n1,int n2) {
            if (n1 % 2 == 0 && n2 > 0) {
                return "O numero " + n1 + " é par e positivo";
            } else if (n1 % 2 == 0 && n2 < 0) {
                return "O numero " + n1 + " é par e negativo";
            } else if (n1 % 2 == -1 && n2 < 0) {
                return "O numero " + n1 + " é impar e negativo";
            } else if (n1 % 2 == 1 && n2 > 0) {
                return "O numero " + n1 + " é impar e positivo";
            } else {
                return "Error";
            }

        }
    }

