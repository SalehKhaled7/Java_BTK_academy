public class Main {

    public static void main(String[] args) {
    int number = 2;
	int[] numbers = {55,5,8,54,11,32,25,14,16,21,25};

	//alg1
	boolean find=false;
        for(int n:numbers){
            if(number==n){
                find =true;
                break;
            }
        }
        if(find){
            System.out.println(number+" exist in the list");
        }else {
            System.out.println(number+" dose not exist in the list");
        }

    //alg2
	for(int n:numbers){
	    if(number==n){
            System.out.println(number+" exist in the list");
            return;
        }
    }
        System.out.println(number+" dose not exist in the list");
    }
}
