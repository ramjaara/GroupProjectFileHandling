package com.company;

import java.io.*;
import java.util.Scanner;

public class Main {

    //Delimiter is &

    private static final File TestFile = new File("TestFile");

    public static void main(String[] args) {

        CreateTestFile();
        ReadFile();
    }

    public static void CreateTestFile() {
        try {
            if (TestFile.createNewFile()) {
                System.out.println("File created: " + TestFile.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred in CreateTestFile().");
            e.printStackTrace();
        }
    }

    public static void WriteToFile() {
        try {
            FileWriter myWriter = new FileWriter(TestFile.getName(), true);
            myWriter.write("Test" + "\n");
            myWriter.close();
            System.out.println("Testing");
        } catch (IOException e) {
            System.out.println("An error occurred in WriteToFile().");
            e.printStackTrace();
        }
    }

    public static void ReadFile() {
        try {
            Scanner myReader = new Scanner(TestFile);
            while (myReader.hasNextLine()) {
                String Testdata = myReader.nextLine();
                System.out.println(Testdata);

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred ReadeFile().");
            e.printStackTrace();
        }
    }
    public static void DeleteFile() {
        try {
            if (TestFile.delete()) {
                System.out.println("Deleted the file: " + TestFile.getName());
            } else {
                System.out.println("Failed to delete the file.");
            }

        } catch (Exception e) {
            System.out.println("An error occurred in DeleteFile().");
            e.printStackTrace();
        }
    }

    public static void ReadSpecificLine() {
        try {
            Scanner myReader = new Scanner(TestFile);
            while (myReader.hasNextLine()) {
                String Testdata = myReader.nextLine();
                if(Testdata.equals("Test4")){
                    System.out.println(Testdata);
                }

            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred ReadeSpecificLine().");
            e.printStackTrace();
        }
    }
    public static void DeleteASpecificLine(){
        try {
            
        } catch (Exception e) {
            System.out.println("An error occurred DeleteASpecificLine().");
            e.printStackTrace();
        }
    }

}
