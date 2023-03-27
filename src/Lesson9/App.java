package Lesson9;

import java.util.Map;
import java.util.Scanner;

public class App {
    Scanner scn = new Scanner(System.in);

    public int showScore(Map<User, Integer> map) {
        System.out.println("Введите имя пользователя: ");
        String userName = (String) scn.next();
        String key;
        int result = -1;

//        System.out.println(map.containsKey(userName));
        for (Map.Entry<User, Integer> entry : map.entrySet()
        ) {
            key = entry.getKey().getName();
            if(key.equals(userName)) {
                System.out.println("### Пользователь :"+ entry.getKey() + "," + " число очков: " +entry.getValue());
                result = entry.getValue();
            }
        }
        System.out.println(result>0 ? "" : "Пользователь не найден");
        return result;


    }
}
