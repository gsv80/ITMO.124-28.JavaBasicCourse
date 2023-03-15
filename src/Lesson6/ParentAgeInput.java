package Lesson6;

import java.util.Scanner;

public class ParentAgeInput {
    public int age;
    Scanner scn = new Scanner(System.in);
    public void ageInput(){

        System.out.println("Please input an age");
        age = scn.nextInt();
    }

}
