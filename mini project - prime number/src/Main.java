import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int number = -2;

        // alg-1
        boolean isPrime = true;
        if(number ==1){
            System.out.println(number+" not prime");
            return;
        }

        if(number<2){
            System.out.println(number+" is invalid number");
            return;
        }
        for (int j = 2; j < number; j++) {
            if (number % j == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println(number + " is prime");
        } else if (!isPrime){
            System.out.println(number + " is not prime");
        }

    }

}

