import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList cities = new ArrayList<>(); // we didn't specify a type for the arrayList so it store the values as objects
        cities.add("istanbul");
        cities.add(2);
        for (Object o : cities) { //for each object in arraylist
            System.out.println(o);
        }
        System.out.println();

        ArrayList<String> names = new ArrayList<String>(); // arrayList type is String
        names.add("Strings");
        names.add("saleh");

        MyList<String> cities2 = new MyList<String>();// it passes the String to MyList class as a type so all methods will use same type and that's how arrayList works
        cities2.add("istanbul");
        cities2.add("ankara");

        MyList<Customer> customerList = new MyList<Customer>();// use another class as type
        customerList.add(new Customer());
        customerList.add(new Customer());

    }
}
