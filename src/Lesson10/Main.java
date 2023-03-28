package Lesson10;

import java.io.File;

public class Main {

    String testText = "Hello%to123^** ";
    public static void main(String[] args) {
        File file = new File("files/text.txt");
//        Test task#1
//        System.out.println("### Task#1  - read file and add lines to List");
//        Methods.linesToList(file);

//        Test task#2 add String to file "files/task2.txt" - file content to be rewritten with new string
//        Methods.addStringToFile("files/task2.txt", "I'm testing to write a string to file");
//        Methods.addStringToFile("files/task2.txt", "Right now string #2 - I'm testing to write a string to file");

//        Test task#3
//        File file1 = new File("files/file1.txt");
//        File file2 = new File("files/file2.txt");
//        File merged = new File(("files/merged.txt"));
//        Methods.mergedFile(file1, file2, merged);

//        Test task#4
        File file4 = new File("files/text4.txt");
        Methods.replaceText(file4);

    }
}
