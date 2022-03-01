public class AccountOverdrawSafeDemo implements Runnable {
    final private Account acct = new Account();

    @Override
    public void run() {
        for (int x = 0; x < 5; x++) {
            makeWithdrawal(60);
            if (acct.getBalance() < 0) {
                System.out.println("account is overdrawn!");
            }
        }
    }

    private synchronized void makeWithdrawal(int amt) {
        if (acct.getBalance() >= amt) {
            System.out.println(Thread.currentThread().getName() + " is going to withdraw "+amt+", current balance : "+acct.getBalance());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.out.println("An error occurred!!");
            }
            acct.withdraw(amt);
            System.out.println(Thread.currentThread().getName() + " completes the withdrawal, remaining balance : "+acct.getBalance());
        } else {
            System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw, current balance : " + acct.getBalance());
        }
    }
}