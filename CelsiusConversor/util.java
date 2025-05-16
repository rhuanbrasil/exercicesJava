package CelsiusConversor;

public class util {
    double Fahrenheit;
    double Celsius;
    public util(double Fahrenheit) {
        this.Fahrenheit = Fahrenheit;
    }
    public void Conversor() {
        Celsius = (5 * ( Fahrenheit-32) / 9);
    }
    public double getCelsius() {
        return Celsius;
    }
    public double getFahrenheit() {
        return Fahrenheit;
    }
}
