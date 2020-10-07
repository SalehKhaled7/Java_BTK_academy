public class Main {

    public static void main(String[] args) {

        int i = 0;  //***
        while (i < 10) {
            System.out.print(" "+i);
            i++;         // *** or u will enter infinite loop
            //i+=2;
        }
        System.out.println("\nend while loop ..");
        i=0;
        do{              // this code will work once if the condition is not valid
            System.out.print(" "+i);
            i++;
        }while (i<10);  // the condition
        System.out.println("\nend do-while loop ..");
    }
}
