public class Main {

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();

        int number1 =6;
        int number2 =0;
        char operator = '/';

        switch (operator) {
            case '+':
                System.out.println(number1+""+operator+""+number2+" ="+calc.add(number1, number2));
                break;
            case '-':
                System.out.println(number1+""+operator+""+number2+" ="+calc.subtraction(number1, number2));
                break;
            case '*':
                System.out.println(number1+""+operator+""+number2+" ="+calc.multiplication(number1, number2));
                break;
            case '/':
                if (number2 == 0) {
                    System.out.println("wrong input cant divide by zero \"0\"");
                    break;
                } else {
                    System.out.println(number1+""+operator+""+number2+" ="+calc.division(number1, number2));
                    break;
                }
        }

    }
}
