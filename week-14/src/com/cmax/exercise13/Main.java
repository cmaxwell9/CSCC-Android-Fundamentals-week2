package com.cmax.exercise13;

/**
 * Created by Clint on 5/2/2016.
 */


/**
 * Created by aneuman1 on 4/21/2016.
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
