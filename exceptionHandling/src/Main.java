public class Main {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3};

        try {
            System.out.println(numbers[4]);
        } catch (Exception e) {
            System.out.println("out of bound");
        } finally { // we can use it to close data base/file connections
            System.out.println(" i always work !");
        }
    }
}
