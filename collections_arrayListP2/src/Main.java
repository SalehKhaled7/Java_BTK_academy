import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {

        ArrayList<String> countries = new ArrayList<String>(); // this array lis only contain strings
        countries.add("karabuk");
        countries.add("istanbul");
        countries.add("bolo");
        for(String s:countries){
            System.out.println(s);
        }
        System.out.println();

        countries.remove("bolo");
        for(String country:countries){
            System.out.println(country);
        }
        System.out.println();

        countries.add("cew1");
        countries.add("aew2");
        countries.add("new3");

        Collections.sort(countries); // sort by alphabetic order
        for(String country:countries){
            System.out.println(country);
        }
        System.out.println();


    }
}
