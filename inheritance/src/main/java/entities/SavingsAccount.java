package entities;

public class SavingsAccount extends Account {
    private double interestRate;


    public SavingsAccount(Integer number, String holder, Double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public void updateBalance() {
        balance += balance * interestRate;
    }
    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    @Override
    public void withdraw(Integer amount) {
        balance -= amount;
    }

}
