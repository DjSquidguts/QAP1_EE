package com.key.account;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AccountTest {



    @Test
    public void testCredit() {
        Account accountUnderTest= new Account();

        Assertions.assertEquals(0, accountUnderTest.getBalance());

        Assertions.assertEquals(1000, accountUnderTest.credit(1000));

        Assertions.assertEquals(1000, accountUnderTest.getBalance());
    }

    @Test
    public void testDebit() {
        Account accountUnderTest= new Account();

        Assertions.assertEquals(0, accountUnderTest.getBalance());

        Assertions.assertEquals(1000, accountUnderTest.credit(1000));

        Assertions.assertEquals(1000, accountUnderTest.getBalance());

        try {
            Assertions.assertEquals(900, accountUnderTest.debit(100));
        } catch (AccountBalanceException e) {
            System.out.println(e.getMessage());
        }

        Assertions.assertEquals(900, accountUnderTest.getBalance());

        try {
            accountUnderTest.debit(1000);
        } catch (AccountBalanceException e) {
            System.out.println(e.getMessage());
        }
        Assertions.assertEquals(900, accountUnderTest.getBalance());
    }
    @Test
    public void testAccountNotNegative() {
        Account accountUnderTest= new Account();

        Assertions.assertEquals(0, accountUnderTest.getBalance());

        Assertions.assertEquals(1000, accountUnderTest.credit(1000));

        Assertions.assertEquals(1000, accountUnderTest.getBalance());

        Assertions.assertNotEquals(-1, accountUnderTest.getBalance());
    }
}
