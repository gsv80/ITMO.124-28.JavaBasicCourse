package Lesson5;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

//      === test strings ===
        String text = "   Lorem    ipsum dolor sit amet, consectetur adipiscing elit. Curabitur fringilla, orci quis consectetur tempor, nisi ipsum iaculis est, ac consectetur sem orci at ipsum. Pellentesque scelerisque blandit ipsum, id convallis tellus vestibulum vitae. Phasellus id malesuada urna, pretium placerat dui. Cras aliquam nisi felis, quis dapibus purus tincidunt vel. Sed condimentum aliquam vehicula. Phasellus rutrum nisi neque, quis tempus nulla venenatis eget. Suspendisse ultricies, justo vitae pulvinar eleifend, metus augue consectetur urna, non viverra ex nisl in odio. Integer ac magna eu orci gravida molestie non et quam. Maecenas luctus, massa at fermentum cursus, urna diam maximus nisl, in ullamcorper velit nulla sit amet lorem. Mauris nec lorem scelerisque nisl lobortis pellentesque pharetra quis massa. Cras molestie nibh vel dui efficitur vulputate. ";
        String palindrome=" anA   ana";
        String toCensor = "бяка БяКа Бякака ";
        String outerTxt = "Hello pepele pele";
        String innerTxt = "pe";
        String txtToReverse = "This is a test string";
//      === Methods operation test ===
//        System.out.println("####_01 'longestWord' method: "+ StringMethods.longestWord("Самое ддиное слово в тексте: "+text));
//        System.out.println("####_02 'isPalindrome' method: "+ StringMethods.isPalindrome(palindrome));
//        System.out.println("####_03 'censor' method: " + StringMethods.censor(toCensor));
//        System.out.println("####_04 'counterEnters' method: " + StringMethods.counterEnters(outerTxt, innerTxt));
        System.out.println("####_05 'reverseWords' in a text: " + StringMethods.reverseWords(txtToReverse));
    }
}
