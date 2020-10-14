public class Main {

    public static void main(String[] args) {
	// write your code here
        CreditUI creditUI = new CreditUI();
        creditUI.creditCalculate(new AgricultureCreditManager());//or new NewCreditManager,new TeacherCreditManager
    }
}
