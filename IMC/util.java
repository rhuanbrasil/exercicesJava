package IMC;

public class util {
    private double height;
    private double weight;

    public util(double height, double weight) {
        this.height = height;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double imcCalculator(){
        return weight / Math.pow(height, 2);
    }
    private static int imcCases(double imc) {
        if (imc < 18.5) return 1;
        if (imc > 18.6 && imc < 24.9) return 2;
        if (imc > 25 && imc < 29.9) return 3;
        if (imc > 30 && imc < 34.9) return 4;
        if (imc > 35 && imc < 39.9) return 5;
        if (imc >= 40) return 6;
        else return 0;
    }
    public static String imcSout(double imc) {
        int category = imcCases(imc);

        return switch (category){
            case 1 -> "underweight";
            case 2 -> "ideal weight";
            case 3 -> "lightly overweight";
            case 4 -> "class I obesity";
            case 5 -> "class II obesity (severe)";
            case 6 -> "class III obesity (morbid)";
            default -> "Invalid imc";
        };
    }
}
