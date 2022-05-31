package com.key.account;

public class Account {
    private int balance;
    public int getBalance() {
        return balance;
    }

    public int credit(int amountToCredit) {
        //one way of doing it just the line below
        //return (balance += amountToCredit);

        // second way of doing above code below
        balance += amountToCredit;
        return balance;
    }

    public int debit(int amountToDebit) throws AccountBalanceException {
        if (0 > (balance - amountToDebit)) {
            throw new AccountBalanceException("Amount to debit creates a negative balance!! Transaction Cancelled");
        }


        balance -= amountToDebit;
        return balance;
    }
}
