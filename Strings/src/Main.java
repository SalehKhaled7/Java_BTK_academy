public class Main {

    public static void main(String[] args) {

        // Java is case sensitive language
        String message = "I love java programing    ";
        System.out.println(message);
        System.out.println(" chars number: "+message.length()); // find string length
        System.out.println("chars at position 5: "+message.charAt(5)); // find the char at the position
        System.out.println(message.concat("...")); // add to the string
        System.out.println(message.startsWith("I"));  // is the string start with ""
        System.out.println(message.endsWith(".")); // is the string end with ""

        char[] word1 = new char[4];
        message.getChars(2,6,word1,0); // extract a part from the string and put it in new string "word"
        System.out.println(word1);

        System.out.println(message.indexOf('a')); // return index of first 'a' search from the left
        System.out.println(message.indexOf("java")); // return index of first "string" search from the left
        System.out.println(message.lastIndexOf('a'));// search from the right

        System.out.println(message.replace(' ', '-')); // replace one char with another
        String newMsg = message.replace(' ', '-');
        System.out.println(newMsg);
        System.out.println(message.substring(0, 11)); // part of the string

        for (String word2 : message.split(" ")) {
            System.out.println(word2);
        }

        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.trim()); //remove spaces in the start and the end
    }
}
