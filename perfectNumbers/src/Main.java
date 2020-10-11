public class Main {
    public static void main(String[] args) {
        //perfect number ex:6 = 1+2+3
        int number = 8;
        int sum = 0;
        // for (int number = 1; number < 100; number++) {
        //    int sum = 0;
        if(number==1){
            System.out.println(number+" is not a perfect number");
            return;
        }
        if(number<0){
            System.out.println("invalid number");
            return;
        }
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        if (sum == number) {
            System.out.println(number + " is  a perfect number");
        } else {
             System.out.println(number + " is not a perfect number");
        }
        int dd=0;
        for(int j=1;j<220;j++){
            dd+=j;
        }
        System.out.println(dd);
   // }
}

}
