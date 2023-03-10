package Lesson4;

import java.util.*;

public class PartOne {
//  task 1

    public static void printEven(int range){

        for (int i = 0; i <= range; i++) {
            if(i%2 != 0){
                System.out.println(i);
            }
        }
    }
//  task 2
    public static void multipleThreeFive(int range){

        List<Integer> listThree = new ArrayList<>();
        List<Integer> listFive = new ArrayList<>();
        List<Integer> listMultBoth = new ArrayList<>();

        for (int i = 1; i <= range ; i++) {
            if(i%3 == 0 ){
                listThree.add(i);
                if(i%5 == 0){
                    listMultBoth.add(i);
                }
            } else if (i%5 == 0) {
                listFive.add(i);
            }
        }
        System.out.println("Числа кратные трем: " + listThree);
        System.out.println("Числа кратные пяти :" + listFive);
        System.out.println("Числа кратные трем и пяти: " + listMultBoth);
    }
//  task 3
    public static boolean checkSum(){
        boolean res = false;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scn.nextInt();
        System.out.println("Введите втоорое число");
        int num2 = scn.nextInt();
        System.out.println("Введите третье число");
        int numSum = scn.nextInt();
        System.out.print("Результат: ");
        res = (num1+num2 == numSum)? true : false;
        return res;
    }
// task 4
    public static boolean threeNumOrdered(){
        boolean res;
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scn.nextInt();
        System.out.println("Введите второе число");
        int num2 = scn.nextInt();
        System.out.println("Введите третье число");
        int num3= scn.nextInt();
        System.out.print("Результат: ");
        res = (num1<num2 && num2<num3)? true : false;
        return res;

    }
//    task 5
    public static boolean firstLastElThree(){
        boolean res;
        int[] ar = {2,4,5,6,7,4,8,3};
        System.out.println(Arrays.toString(ar));
        res = (ar[0] == 3 || ar[ar.length-1] == 3)? true : false;
        return res;
    }

//    task 6
    public static boolean isIncludesNum(){
        boolean isInc = false;
        int[] ar = new int[] {0,51,2,21,5,5};
        int checkNum1 = 1;
        int checkNum2 = 3;

        for(int i=0; i< ar.length; i++){
            if(ar[i] == checkNum1 || ar[i] == checkNum2 ){
                isInc = true;
                return isInc;
            }
        }
        return isInc;
    }
}
