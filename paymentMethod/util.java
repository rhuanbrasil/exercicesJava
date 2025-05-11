package paymentMethod;

public class util {
    double value;

    public util(double value) {
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public double valueSout(int Case) {
       return switch (Case) {
            case 1 -> value *= 0.85;
            case 2 -> value *= 0.90;
            case 3 -> value *= 1;
            case 4 -> value *= 1.10;
            default -> value *= 1.00;


       };
    }
}
