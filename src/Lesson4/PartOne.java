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

        int countThree = 0;
        int countFive = 0;
        int countBoth = 0;
        int[] arrThree = new int [range];
        int[] arrFive =  new int [range];
        int[] arrBoth =  new int [range];

        for (int i = 1; i <= range; i++) {
            if (i % 3 == 0) {
                arrThree[countThree]= i;
                countThree++;
                if (i % 5 == 0) {
                    arrBoth[countBoth] = i;
                    countBoth++;
                }
            } else if (i % 5 == 0) {
                arrFive[countFive]= i;
                countFive++;
            }
        }
        int[] arrThreeMod = new int[countThree];
        for(int i=0; i<countThree; i++){
            arrThreeMod[i] = arrThree[i];
        }
        int[] arrFiveMod = new int[countFive];
        for(int i=0; i<countFive; i++){
            arrFiveMod[i] = arrFive[i];
        }
        int[] arrBothMod = new int[countBoth];
        for(int i=0; i<countBoth; i++){
            arrBothMod[i] = arrBoth[i];
        }
        System.out.println("Числа кратные трем: " + Arrays.toString(arrThreeMod));
        System.out.println("Числа кратные пяти :" + Arrays.toString(arrFiveMod));
        System.out.println("Числа кратные трем и пяти: " + Arrays.toString(arrBothMod));
    }
//  task 3
    public static boolean checkSum(){

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scn.nextInt();
        System.out.println("Введите втоорое число");
        int num2 = scn.nextInt();
        System.out.println("Введите третье число");
        int numSum = scn.nextInt();
        System.out.print("Результат: ");

        return (num1+num2 == numSum)? true : false;
    }
// task 4
    public static boolean threeNumOrdered(){

        Scanner scn = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = scn.nextInt();
        System.out.println("Введите второе число");
        int num2 = scn.nextInt();
        System.out.println("Введите третье число");
        int num3= scn.nextInt();
        System.out.print("Результат: ");

        return (num1<num2 && num2<num3)? true : false;

    }
//    task 5
    public static boolean firstLastElThree(int[] arrPart1){

        System.out.println(Arrays.toString(arrPart1));
        return (arrPart1[0] == 3 || arrPart1[arrPart1.length-1] == 3)? true : false;
    }

//    task 6
    public static boolean isIncludesNum(int[] ar){

        int checkNum1 = 1;
        int checkNum2 = 3;

        for(int i=0; i< ar.length; i++){
            if(ar[i] == checkNum1 || ar[i] == checkNum2 ){
                return true;
            }
        }
        return false;
    }
}
