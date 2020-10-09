public class Main {

    public static void main(String[] args) {
        double[] myList = {1.2, 5.2, 3.2, 1.5};
        double total = 0;
        double max = 0;
        for (double number : myList) {
            System.out.println(number);
            total+=number;      //  total = total + number
            if(number>max){
                max = number;
            }
        }
        System.out.println("the total = "+total);
        System.out.println("the max number is : "+max);
    }
}
