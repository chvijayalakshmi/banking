package banking;

import java.util.Scanner;

public class AccountDetails {

    private int balance;
    private int recentTransaction;
    private String customerName;
    private String customerId;

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getRecentTransaction() {
        return recentTransaction;
    }

    public void setRecentTransaction(int recentTransaction) {
        this.recentTransaction = recentTransaction;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void deposit(int amount) {
        if(amount!=0){
            balance = balance +amount;
            recentTransaction = +amount;
        }
    }
    public void withdraw(int amount) {
       /* if(Balance==0 && Balance<0)
        {
            System.out.println("************** Your account is having null balance *********");
            System.out.println("Please deposit some amount before if you want to withdraw");
        }*/
         if(amount> balance)
        {
            System.out.println("Please make sure your account balance before withdraw");
        }
        else if(amount!=0 && amount < balance) {
            balance = balance - amount;
            recentTransaction = -amount;
        }

    }
    public void getPreviousTransaction()
    {
        if(recentTransaction>0) {
            System.out.println("yor deposited amount is : "+recentTransaction);
            System.out.println("/n");
        }
        else if(recentTransaction<0) {
            System.out.println("withdrawn:" +Math.abs(recentTransaction));
        }
        else {
            System.out.println("No transaction is done:");

        }
    }
    public void menu()
    {
        Scanner sca = new Scanner(System.in);
        System.out.println("Enter your name");
        String c= sca.next();
        System.out.println("Welcome " +c );
        //System.out.println("Your ID is "+CustomerId);
        System.out.println("-------------------------------------------------");
        System.out.println("1.Check the balance");
        System.out.println("2.Deposit");
        System.out.println("3.Withdraw");
        System.out.println("4.Previous Transation" );
        System.out.println("5.Exit");
        int option = 0;
        do{
            System.out.println("=========================================================");
            System.out.println("Please select one option:");
            option=sca.nextInt();
System.out.println("\n");
            switch (option)
            {
                case 1:
                    System.out.println("------------------------------------");
                    System.out.println("Your Balance is: "+ balance);
                    break;
                case 2:
                    System.out.println("------------------------------------");
                    System.out.println("Enter an amount to diposit:");
                    int amount = sca.nextInt();
                    deposit(amount);
                    System.out.println("\n");
                    break;
                case 3:

    System.out.println("------------------------------------");
    System.out.println("Enter an amount to Withdraw:");
    int amount1 = sca.nextInt();
    withdraw(amount1);
    System.out.println("\n");
    break;

                case 4:
                 System.out.println("--------------------------------------------");
                 getPreviousTransaction();
                    break;
                case 5:
                    System.out.println("*******************************************************");

            }
        }while (option!=5);

System.out.println("Thank you");

    }

}

