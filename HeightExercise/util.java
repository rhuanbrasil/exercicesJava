package HeightExercise;

public class util {
    private String name1 = "Francisco", name2 = "Sara";
    private Double height1 = 1.50, height2 = 1.10;
    private int years;
    public int YearsToBeatTheHeight() {
        while (height1 > height2) {
            height1 += 0.02;
            height2 += 0.03;
            years++;
        }
        return years;
    }

    public String getName1() {
        return name1;
    }

    public String getName2() {
        return name2;
    }
}
