public class Main {

    public static void main(String[] args) {

        int number1 = sum1(5, 20);
        int number2 = sum2(1, 2, 3, 6, 5, 4);

        System.out.println("sum of two numbers using normal int method is :"+number1);
        System.out.println("sum of multiple numbers using variable args is: "+number2);


    }


    public static int sum1(int a, int b) {
        return a + b;
    }

    public static int sum2(int... numbers) { // it converts the numbers to an int array
        int total = 0;
        for (int number : numbers) {
            total += number;
        }
        return total;
    }
}
