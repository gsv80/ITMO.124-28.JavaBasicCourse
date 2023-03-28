package Lesson10;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Methods {

//    task #1  -
    public static List<String> linesToList(File file){
        List<String> list = new ArrayList<>();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String line;
            while((line = reader.readLine()) != null){
                list.add(line);
            }
        } catch (IOException exc){
            System.err.println("Something went wrong .." + exc.getMessage());
        }
        for (String l: list) {
            System.out.println(l);
        }
        return list;
    }

//    task #2 -
    public static void addStringToFile(String path, String str)  {

        BufferedWriter writer = null;
        try{
            writer = new BufferedWriter(new FileWriter(path));
            writer.write(str+"\n");
        } catch (IOException exc){
            System.err.println("Something went wrong .." + exc.getMessage());
        } finally {
            try{
                if (writer != null){
                    writer.close();
                }
            } catch (IOException exc){
                System.err.println("Something went wrong .." + exc.getMessage());
            }
        }
    }
//    task #3 -
    public static void mergedFile(File fileFirst, File fileSecond, File merged) {
        try (BufferedReader readerOne = new BufferedReader(new FileReader(fileFirst));
        BufferedReader readerTwo = new BufferedReader(new FileReader(fileSecond));
        BufferedWriter writer = new BufferedWriter(new FileWriter(merged, true))) {
            String line;
            while ((line = readerOne.readLine()) != null) {
                writer.write(line+"\n");
            }
            while ((line = readerTwo.readLine()) != null){
                writer.write(line + "\n");
            }
        } catch (IOException exc){
            System.err.println("Something went wrong .." + exc.getMessage());
        }
    }

//    task #4
    public static void replaceText(File file){
        StringBuilder bufferedText = new StringBuilder();
        try(BufferedReader reader = new BufferedReader(new FileReader(file))){
            String input;
            while((input = reader.readLine()) != null){
                bufferedText.append(input+"\n");
            }
        } catch(IOException exc ){
            System.err.println("Something went wrong .." + exc.getMessage());
        }
        System.out.println(bufferedText);
        String modifiedText= bufferedText.toString()
                .replaceAll("[^a-zA-Z0-9.]", "\\$");
        System.out.println(modifiedText);
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
                writer.write(modifiedText);
        } catch(IOException exc){
            System.err.println("Something went wrong .." + exc.getMessage());
        }
    }

}


