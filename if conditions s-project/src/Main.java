public class Main {

    public static void main(String[] args) {
        int a, b, c, greatest;
        a = 25;
        b = 100;
        c = 120;
        greatest = a;
        if (greatest < b) {
            greatest = b;
        }
        if (greatest < c) {
            greatest = c;
        }
        System.out.printf("the greatest number is: "+greatest);

    }
}
