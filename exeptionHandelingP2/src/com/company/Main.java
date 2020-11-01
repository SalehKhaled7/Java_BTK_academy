package com.company;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader("C:\\Users\\tothe\\IdeaProjects\\Java_BTK_academy\\exeptionHandelingP2\\src\\numbers.txt"));
        }catch (FileNotFoundException e){
            System.out.println(e);
        }finally {
            try{
            bufferedReader.close();}
            catch (IOException e){
                System.out.println(e);
            }
        }
    }
}
