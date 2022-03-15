package banking;

import org.junit.Test;

import static org.junit.Assert.*;

public class AccountDetailsTest {

    @Test
    public void shouldAddDepositToBalance() {
       // int depositAmount = 1000;
        AccountDetails ac = new AccountDetails();
        ac.deposit(1000);
        int balance=ac.getBalance() ;
        assertEquals(balance,ac.getBalance());

    }


}