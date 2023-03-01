package Lesson1;

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
//        Methods test: uncomment a method below to test

        TaskOne();
//        TaskTwo();
//        TaskThree();
//        System.out.println(TaskFour());
//        TaskFive();
//        TaskSix();
            }
            public static void  TaskOne(){
                System.out.println( "Я");
                System.out.println( "хорошо");
                System.out.println( "знаю");
                System.out.println( "Java");
            }
            public static void TaskTwo(){
                double a = (46+10)*(10/3d);
                int b = (29)*4*(-15);
                System.out.println(a);
                System.out.println(b);
            }
            public static void TaskThree(){
                int number=10500;
                double result;
                result = (number/10.0)/10;
                System.out.println(result);
            }
            public static double TaskFour(){
                double result;
                return result = 3.6*4.1*5.9;
            }
            public static void TaskFive(){
                Scanner scanner = new Scanner(System.in);
                int num1 = scanner.nextInt();
                int num2 = scanner.nextInt();
                int num3 = scanner.nextInt();
                System.out.println(num1);
                System.out.println(num2);
                System.out.println(num3);
            }
            public static void TaskSix() {
                Scanner scanner = new Scanner(System.in);
                int b = scanner.nextInt();
                String result = b%2 != 0 ? "Нечетное": (b%2==0 && b>100) ? "Выходит за пределы диапазона" : "Четное";
                System.out.println(result);
            }
}


