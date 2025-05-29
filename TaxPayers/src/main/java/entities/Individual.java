package entities;

public class Individual extends Person {
    Double healthCosts;

    public Individual() {
        super();
    }

    public Individual(String name, Double anualSalary, Double healthCosts) {
        super(name, anualSalary);
        this.healthCosts = healthCosts;
    }

    @Override
    public Double taxCalculation(){
        double salary = getAnualSalary();
        if(getAnualSalary() < 20000){
            salary *= 0.15;
        } else{
            salary *= 0.25;
        }
        if(healthCosts != 0){
            salary = salary - (healthCosts * 0.5);
        }
        return salary;

    };
}
