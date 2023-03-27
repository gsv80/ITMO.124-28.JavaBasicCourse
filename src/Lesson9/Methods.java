package Lesson9;

import java.time.Duration;
import java.time.Instant;
import java.util.*;

public class Methods {
    Scanner scn = new Scanner(System.in);
    public List<Integer> inputList(){
        List<Integer> list = new ArrayList<>();
        System.out.println("Enter length of List");
        int length = scn.nextInt();
        System.out.println("Enter min value in List");
        int min = scn.nextInt();
        System.out.println("Enter max value in List");
        int max = scn.nextInt();

        for (int i = 0; i < length; i++) {
            Random random = new Random();
            int el = random.nextInt(max)+min;
            list.add(el);
        }
        return list;
    }
    public List<Integer> inputLinkedList(){
        List<Integer> list = new LinkedList<>();
        System.out.println("Enter length of List");
        int length = scn.nextInt();
        System.out.println("Enter min value in List");
        int min = scn.nextInt();
        System.out.println("Enter max value in List");
        int max = scn.nextInt();

        for (int i = 0; i < length; i++) {
            Random random = new Random();
            int el = random.nextInt(max)+min;
            list.add(el);
        }
        return list;
    }
// Task #3 - compare ArrayList VS LinkedList with '.get()'
    public long speedTest(List<Integer> testList, int size){

        Instant start = Instant.now();
        for (int i = 0; i < size; i++) {
            Random rnd = new Random();
            testList.get(rnd.nextInt(1000000));
        }
        Instant finish = Instant.now();
        long elapsedTime= Duration.between(start, finish).toMillis();

        return elapsedTime;
    }

//    Task #2 - Get uniques
    public Set<Integer> getUnique(List<Integer> list){

        Set<Integer> uniques = new HashSet<>(list);
        return uniques;
    }




}
