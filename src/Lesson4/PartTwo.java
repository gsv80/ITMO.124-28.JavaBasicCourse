package Lesson4;

import java.util.Arrays;
import java.util.Scanner;

public class PartTwo {


// task 1.
    public static void isSorted(int[] ar){

        Boolean isSort =true ;

        for( int i = 1; i<ar.length; i++){

            if(ar[i-1]>ar[i]){
                System.out.println("Please try again");
                isSort = false;
                break;
            }
        }
        if (isSort){System.out.println("Ok");}
    }
//    task 2.
    public static void inputArray(){
        Scanner scn = new Scanner(System.in);
        System.out.println("Введите длину массива");
        int length = scn.nextInt();
        int[] ar = new int[length];
        System.out.println("Введите элементы массива");
        for(int i=0; i<length; i++){
            ar[i]  = scn.nextInt();
        }
        System.out.println("Результат: "+ Arrays.toString(ar));
    }
//    task 3.
    public static void swapLastFirst(int[] ar){
        System.out.println("Начальный массив:");
        System.out.println(Arrays.toString(ar));
        int temp = ar[0];
        ar[0] = ar[ar.length-1];
        ar[ar.length-1] =  temp;
        System.out.println("Массив после изменения:");
        System.out.println(Arrays.toString(ar));
    }

//    task 4.
    public static Integer findUniq(int[] ar) {
        System.out.println("Массив для поиска: " + Arrays.toString(ar));
        Integer un = null;
        for (int i = 0; i < ar.length; i++) {
            boolean isUn = true;

            for (int j = 0; j < ar.length; j++) {
                if (ar[i] == ar[j] && i != j) {
                    isUn = false;
                    break;
                }
            }
            if (isUn) {
                un = ar[i];
                break;
            }
        }
        return un;
    }
}
