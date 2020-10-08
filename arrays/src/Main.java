public class Main {

    public static void main(String[] args) {
//        String student1 = "ali";
//        String student2 = "can";
//        String student3 = "mike";
//        String student4 = "zen";
//
//        System.out.println(student1);
//        System.out.println(student2);
//        System.out.println(student3);
//        System.out.println(student4);

        String[] stdnts = new String[5];
        stdnts[0]="ali";

        System.out.println("--------------");
        String[] students = {"ali", "can", "mike", "zen","lina"}; // generally have same type of date type
        for (int i = 0; i < students.length; i++) {
            System.out.print(" "+students[i]);
        }
        System.out.println("\n--------------");
        for(String student :students){          //special for loop
            System.out.print(" "+student);
        }


    }
}