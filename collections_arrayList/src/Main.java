import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int[] numbers1 = {1, 2, 3}; //normal array
        //number[3]=4 ; iis not gunna work

        ArrayList numbers = new ArrayList(); // collection array list:add ,remove ,set ,get ,clear
        numbers.add(1);//add
        numbers.add("hello");
        numbers.add(10);

        for (Object o : numbers) {
            System.out.print(o + " ");
        }
        System.out.println();
        System.out.println(numbers.get(2));//get

        numbers.set(2, "nero");//set
        for (Object o : numbers) {
            System.out.print(o + " ");
        }
        System.out.println();

        numbers.remove(0);//remove
        for (Object o : numbers) {
            System.out.print(o + " ");
        }
        System.out.println();

        numbers.clear();//clear
        for (Object o : numbers) {
            System.out.println(o);
        }
        System.out.println();
    }
}
