package bankExercise;

public class util {
    private String name;
    private int ID;
    private double balance;

    public util(String name, int ID) {
        this.name = name;
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }
    public double getBalance() {
        return balance;
    }
    public void withdraw(double amount) {
        balance -= amount+5;
    }
    public void deposit(double amount) {
        balance += amount;
    }
    public String toString() {
        return " Account: " + ID + ", Holder: " + name +  ", Balance: $ " + String.format("%.2f", balance);
    }

}
