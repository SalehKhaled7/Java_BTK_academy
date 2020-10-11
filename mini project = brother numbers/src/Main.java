public class Main {

    public static void main(String[] args) {

//	for(int number1 = 1;number1<1000;number1++){
//	    for (int number2 = 1;number1<1000;number2++){

        int number1 = 222;
        int number2 = 284;

        int total1 = 0;
        int total2 = 0;

        for (int k = 1; k < number1; k++) {
            if (number1 % k == 0) {
                total1 += k;
            }
        }
        for (int l = 1; l < number2; l++) {
            if (number2 % l == 0) {
                total2 += l;
            }
        }
        if (total1 == number2 && total2 == number1) {
            System.out.println(number1 + " - " + number2+" are brother numbers");
        }else {
            System.out.println(number1 + " - " + number2+" are not brother numbers");
        }

        //   }
        //}
    }
}
