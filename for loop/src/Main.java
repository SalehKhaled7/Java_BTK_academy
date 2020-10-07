public class Main {

    public static void main(String[] args) {
        //int i;
        for (int i = 1; i <= 10; i += 1) { //( i=1 ; i<10 ; i++ )
            System.out.print(" " + i);
        }

        System.out.printf("\n");
        for (int i = 1; i <= 10; i += 2) { // jump by 2
            System.out.print(" " + i);
        }

        System.out.printf("\n even numbers: ");
        for (int i = 1; i <= 40; i ++) { // even numbers between 1 and  40
            if(i%2==0){
                System.out.print(" " + i);
            }

        }

        System.out.printf("\n odd numbers: ");
        for (int i = 1; i <= 40; i ++) {// odd numbers between 1 and  40
            if(i%2!=0){
                System.out.print(" " + i);
            }

        }
    }
}
