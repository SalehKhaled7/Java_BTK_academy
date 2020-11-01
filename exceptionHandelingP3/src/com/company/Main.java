package com.company;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        int sum = 0;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\tothe\\IdeaProjects\\Java_BTK_academy\\exceptionHandelingP3\\src\\com\\company\\numbers.txt"));

            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                sum += Integer.parseInt(line);
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println(e);
            }
            System.out.println("numbers sum is = " + sum);
        }
    }
}
