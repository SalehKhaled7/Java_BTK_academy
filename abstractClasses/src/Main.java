public class Main {

    public static void main(String[] args) {

        WomanGameCalculator womanGameCalculator = new WomanGameCalculator();
        womanGameCalculator.calculate();

        //you cant make new object from abstract class
        GameCalculator gameCalculators = new WomanGameCalculator();
        gameCalculators.calculate();
    }
}
