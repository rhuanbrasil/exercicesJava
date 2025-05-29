package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingsAccount;

public class Program {
    public static void main (String[] args) {
        Account acc = new Account(1001, "Rhuan", 100.0);
        Account acc2 = new SavingsAccount(1002, "rhuan", 100.0, 1.3);

        acc2.withdraw(50);
        acc.withdraw(50);

        System.out.println(acc.getBalance());
        System.out.println(acc2.getBalance());

    }
}
