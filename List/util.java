package Lista;

public class util {
    private int id;
    private String name;
    private double salary;
    private double bonus;

    public util(double bonus) {
        this.bonus = bonus;
    }

    public util(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    public void increaseSalary() {
        this.salary *= (this.bonus/100) + 1;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public String ToString() {
        return id + ", " + name + ", " + String.format("%.2f", salary);
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getSalary() {
        return salary;
    }
}



