package com.cmax.exercise13;

/**

 * In the checking account example, we addressed the race condition though synchronization,
 * first by declaring the withdraw() method as synchronized and second by using a synchronizer.
 * An alternative method is to use a synchronize statement like this:

 //some code
 synchronize(object) {
 // code that uses object but only allows one thread to access it at a time
 }

 This creates an intrinsic lock on object. Rewrite the checking account example to use an
 intrinsic lock on the account object created Main.main().

 *
 *
 */


class CheckingAccount {
    private int balance;

    CheckingAccount(int initialBalance) {
        balance = initialBalance;
    }

    public int withdraw(int amount) {
        if (amount <= balance) {
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            balance -= amount;
        }
        return balance;
    }
}
public class Main {
    public static void main(String [] args) {
        CheckingAccount account = new CheckingAccount(100);

        Runnable r = new Runnable() {
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                for (int i=0; i < 10; i++) {
                    System.out.println(name + " tries to withdraw $10, balance:"
                            + account.withdraw(10));
                }
            }
        };

        Thread husband = new Thread(r);
        husband.setName("Husband");
        Thread wife = new Thread(r);
        wife.setName("Wife");

        synchronized (account) {
            husband.start();
            wife.start();
        }
    }

}
