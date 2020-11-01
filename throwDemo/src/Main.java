public class Main {

    public static void main(String[] args) throws Exception {

        AccountManager manager = new AccountManager();

        System.out.println("ur balance is :" + manager.getBalance());
        manager.deposit(500);
        System.out.println("ur balance is :" + manager.getBalance());
        try {
            manager.withDraw(200);
        }catch (BalanceInsufficientException e){
            System.out.println(e.message);
        }

        System.out.println("ur balance is :" + manager.getBalance());
        try {
            manager.withDraw(350);
        }catch (BalanceInsufficientException e){
            System.out.println(e.message);
        }
        System.out.println("ur balance is :" + manager.getBalance());
    }
}
