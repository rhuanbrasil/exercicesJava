package entities;

public abstract class Person {
    private String name;
    private Double AnualSalary;

    public abstract Double taxCalculation();

   public Person(){}

    public Person(String name, Double anualSalary) {
       this.name = name;
       this.AnualSalary = anualSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getAnualSalary() {
        return AnualSalary;
    }

    public void setAnualSalary(Double anualSalary) {
        AnualSalary = anualSalary;
    }
}
