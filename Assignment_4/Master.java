public class Master {
    public static void main(String[] args) {
        AccountOverdrawDemo acc = new AccountOverdrawDemo();
        Thread one = new Thread(acc);
        Thread two = new Thread(acc);
        one.setName("Atharv");
        two.setName("Aditya");
        two.setPriority(10);
        one.start();
        two.start();
    }
}