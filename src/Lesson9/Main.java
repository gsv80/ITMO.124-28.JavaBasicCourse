package Lesson9;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Methods createList = new Methods();

//        List<Integer> list = createList.inputList();
//        System.out.println("Коллекция Array List для тестирования: "+list);

//        test method #2 return uniques
//        System.out.println("####_Тест задания №2 - вывод коллекции без дубликатов");
//        System.out.println("####_Коллекция без дубликатов: " + createList.getUnique(list));

//        Prepare for method #3 test
//        List<Integer> linkedList = createList.inputLinkedList();
//        System.out.println("Коллекция Linked List для тестирования: "+ linkedList);

//        test method #3
//        System.out.println("Время обращения к 10000 элементов ArrayList, мсек: "+ createList.speedTest(list,10000)); // <- 1
//        System.out.println("Время обращения к 10000 элементов LinkedList, мсек: "+ createList.speedTest(linkedList,10000)); // <- 4548

//        Prepare for method #4 test

        Map<User, Integer> map = new HashMap<>();
        User u1 = new User("Andrew");
        User u2 = new User("Michel");
        User u3 = new User("Ann");
        User u4 = new User("Andrew");

        map.put(u1, 12);
        map.put(u2, 10);
        map.put(u3, 10);
        map.put(u4, 15);

//        Test task #4

//        System.out.println(map);

        App round = new App();
        round.showScore(map);


    }




}
