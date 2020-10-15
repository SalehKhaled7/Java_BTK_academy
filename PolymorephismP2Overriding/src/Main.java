public class Main {

    public static void main(String[] args) {
        BaseCreditManager[] creditManagers = {new CreditManagerType1(), new CreditManagerType2() , new StudentCreditManager()};
        for (BaseCreditManager creditManager : creditManagers) {
            System.out.println(creditManager.calculate(1000));
        }
    }
}