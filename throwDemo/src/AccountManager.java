public class AccountManager {

   private double balance =0;

   public void deposit(double amount){

       balance = getBalance()+amount;
   }

   public void withDraw(double amount) throws BalanceInsufficientException {

       if (getBalance()>amount){
           balance = getBalance() - amount;
       }else {
           //System.out.println("withdraw failed , balance not enough !"); //normal message
           //throw new Exception("withdraw failed , balance not enough !");// java exception
           throw new BalanceInsufficientException("withdraw failed , balance not enough !"); // our own exception
       }
   }


    public double getBalance() {
        return balance;
    }
}
