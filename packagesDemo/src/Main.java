import math.LogCalculator;
import math.SimpleCalculator; // out package
import  math.*; // import every thing from math package

import java.util.Scanner;//build-in packages

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter a string: ");
        String str = scanner.nextLine();

        System.out.println("the out put is : "+str);

        SimpleCalculator simpleCalculator = new SimpleCalculator();
        System.out.println(simpleCalculator.add(1,2));

        LogCalculator logCalculator = new LogCalculator();
        System.out.println(logCalculator.log_2(5));

    }
}
