public class Main {

    public static void main(String[] args) {
        char grade = 'D';
        switch (grade) {
            case 'a':// many cases for same output
            case 'A':
                System.out.println("perfect : pass");
                break;
            case 'B':
                System.out.println("good : pass");
                break;
            case 'C':
            case 'D'://more than one case can be used
                System.out.println("meh : pass");
                break;
            case 'F':
                System.out.println("bad : failed");
                break;
            default: // other cases
                System.out.println("Wrong input !");
        }

    }
}
