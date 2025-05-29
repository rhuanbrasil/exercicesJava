package entities;

public class Company extends Person{
    private Integer employeesNumber;

    public Company() {
        super();
    }

    public Company(String name, Double anualSalary, Integer employeesNumber) {
        super(name, anualSalary);
        this.employeesNumber = employeesNumber;
    }

    public Double taxCalculation(){
        if(employeesNumber > 10){
            return getAnualSalary() * 0.14;
        } else{
            return  getAnualSalary() * 0.16;
        }
    };

}
