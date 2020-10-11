public class Main {

    public static void main(String[] args) {
        char letter = 'A';
        char l = Character.toLowerCase(letter); // convert character  to lowercase
        switch (l) {
            case 'a':
            case 'e':
            case 'i':
            case 'u':
            case 'o':
                System.out.println(letter + " is vowel");
                break;
            default:
                System.out.println(letter + " is consonant");
        }
    }
}
