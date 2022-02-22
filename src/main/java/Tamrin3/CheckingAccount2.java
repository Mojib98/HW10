package Tamrin3;

public class CheckingAccount2 {
    private int balance;
    public CheckingAccount2(int initialBalance) {
        balance = initialBalance;
    }
    public boolean withdraw(int amount) {
        if (amount < balance) {
            try {
                Thread.sleep((int) (Math.random() * 200));
            } catch (InterruptedException ie) {
            }
            balance -= amount;
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        final CheckingAccount2 ca = new CheckingAccount2(100);
        Runnable r = new Runnable() {
            Object lock;
            @Override
            public void run() {
                String name = Thread.currentThread().getName();
                for (int i = 0; i < 10; i++)
                    System.out.println(name + " withdraws $10: " +
                            ca.withdraw(10)+" "+ca.balance+" "+i);
            }
        };
        Object h = new Object();
        Object w = new Object();
        Thread thdHusband = new Thread(r);
        thdHusband.setName("Husband");
        Thread thdWife = new Thread(r);
        thdWife.setName("Wife");
        thdHusband.start();
        thdWife.start();
    }
}