public class Main {

    public static void main(String[] args) {
        //number checker with methods "functions"
        int[] numbers = {55, 5, 22, 54, 11, 32, 25, 14, 16, 21, 25};
        numberChecker(3, numbers);
        numberChecker(21, numbers);
        numberChecker(22, numbers);
        numberChecker(221, numbers);

    }

    public static void numberChecker(int n, int[] nArray) {
        int number = n;
        int[] numbers = nArray;

        //alg1
        boolean find = false;
        for (int num : numbers) {
            if (number == num) {
                find = true;
                break;
            }
        }
        if (find) {
            msg(number + " exist in the list");
        } else {
            msg(number + " dose not exist in the list");
        }
    }

    public static void msg(String s) {
        System.out.println(s);
    }
}
