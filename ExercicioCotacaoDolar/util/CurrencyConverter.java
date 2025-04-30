package util;

public class CurrencyConverter {

    public static double iof = 1.06;
    public static double convert(double value, double amount) {
        return (amount * value) * iof ;
    }

}
