package Lesson6;

import java.util.Scanner;

public class ParentInputNumber{
    public int number;

    public void setNumber() {
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите число");
        this.number = scn.nextInt();
    }
}
