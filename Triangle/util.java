package Triangle;

public class util {
    private double l1, l2, l3;
    public util(double l1, double l2, double l3) {
        this.l1 = l1;
        this.l2 = l2;
        this.l3 = l3;
    }
    public String verifier(){
        if (l1 == l2 && l1 == l3) {
            return "Equilateral";
        } else if (l1 == l2 || l3 == l2) {
            return "Isosceles";
        } else {
            return "Scalene";
        }
    }
}
