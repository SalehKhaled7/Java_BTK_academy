import javax.crypto.spec.PSource;
import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String path = "C:\\Users\\tothe\\IdeaProjects\\Java_BTK_academy\\files\\students.txt";

        createFile(path);
        System.out.println();
        getFileInfo(path);
        System.out.println();
        readFile(path);
        System.out.println();
        doesExist(path, "saleh");
        System.out.println();
        writeFile(path);
        readFile(path);

    }

    // create new file in specified path
    public static void createFile(String path) {

        File file = new File(path);
        try {
            if (file.createNewFile()) {
                System.out.println("new file created !");
            } else {
                System.out.println("the file already exist !");
            }//
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // file functions
    public static void getFileInfo(String path) {
        File file = new File(path);
        if (file.exists()) {
            System.out.println("file info :");
            System.out.println("file name: " + file.getName());   // get file name
            System.out.println("file path: " + file.getAbsolutePath());   // get file path
            System.out.println("is the file writable ? " + file.canWrite());   // check if we have write permission
            System.out.println("is the file readable ? " + file.canRead());  //check if we have read permission
            System.out.println("file size(byte) ? " + file.length());  // get file size in byte
        }
    }

    //read data from file
    public static void readFile(String path) {
        File file = new File(path);
        try {
            Scanner reader = new Scanner(file);
            int i = 1;
            System.out.println("read data from " + file.getName());
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                System.out.println("line " + i + ": " + line);
                i++;
            }
            reader.close(); // close the scanner
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    //read data from file
    public static void doesExist(String path, String str) {
        File file = new File(path);
        boolean done = false;
        try {
            Scanner reader = new Scanner(file);
            int i = 1;
            System.out.println("check if name exist in a file  ");
            while (reader.hasNextLine()) {
                String line = reader.nextLine();
                if (line.contains(str)) {
                    System.out.println("\"" + str + "\"" + " is found in " + file.getName() + " in line :" + i);
                    done = true;
                    break;
                }
                i++;

            }
            if (!done) {
                System.out.println("name nor found");
            }
            reader.close(); // close the scanner
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile(String path) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" enter a name");
        String str = scanner.nextLine();
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path, true)); //append true to be able to add text to the file
            writer.newLine();
            writer.write(str);
            System.out.println(str + " is added to the file");
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
