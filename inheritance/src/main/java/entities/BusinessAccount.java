package entities;

public class BusinessAccount extends Account{
    private double loanLimit;

    public BusinessAccount(Integer number, String holder, Double balance, double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }
    public void loan(int amount) {
        if (amount <= loanLimit) {
            deposit(amount);
        }
    }
    @Override
    public void withdraw(Integer amount) {
        super.withdraw(amount);
        balance -= 2;
    }
}


