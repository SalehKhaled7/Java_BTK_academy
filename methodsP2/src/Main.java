public class Main {

    public static void main(String[] args) {
        print("ali"); //void

        int sum = add(1,3); //int
        System.out.println(sum);

        String str = text();     // string
        System.out.println(str);


    }

    public static String text() { // String method returns a string
        return "hi from String method";
    }

    public static int add(int a,int b){ // int method returns int value
        return a+b ;
    }
    public static void print(String s){ // void methods don't return anything they just do some tasks
        System.out.println(s);
    }

}
