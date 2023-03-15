package Lesson5;

public class StringMethods {

    public static String longestWord(String text){
        String word=null;
        int wordLength = 0;
//        Проверить текст на "содержание" - isEmpty
        if(text.isEmpty() && text == null){
            return "text is empty";
        } else {
//        Удалить символы препинания, пунктуации, цифры
//        Для каждого слова удалить лишние пробелы
            String clearedText = text.replaceAll("[^A-Za-z\\s]", " ").replaceAll("\\s+", " ");
//        разбить текст на отдельные слова в массиве
            String[] textArray = clearedText.trim().split(" ");
//        вывести длину слова и найти самое длиное слово
            for (int i = 0; i < textArray.length; i++) {

                if (textArray[i].length() > wordLength) {
                    wordLength = textArray[i].length();
                    word = textArray[i];
                }
            }
            return word;
        }
    }

//   == Метод тест палиндром ==
    public static boolean isPalindrome(String testPalindrome){
        if(testPalindrome.length()<2){
            return false;
        } else {
//    убрать пробелы справа и слева
            String clearedText = testPalindrome.toLowerCase().trim();
//    посчитать число символов и "четность" длины слова для сравнения по-символьно от концов к середине
            int testLength = clearedText.length()/2;
//            разделить на две половины и сравнить левый и инвертированный правый массивы элементов
                StringBuilder leftPart = new StringBuilder(clearedText.substring(0,testLength));
                StringBuilder rightPart = new StringBuilder();
                if(clearedText.length()%2 == 0){
                    rightPart = rightPart.append(clearedText.substring(testLength));
                } else {
                    rightPart = rightPart.append(clearedText.substring(testLength+1));
                }
            return leftPart.toString().equals(rightPart.reverse().toString());
        }
    }

//    == Метод цензор ==
    public static String censor(String txt){
//
    String censoredTxt = txt.replaceAll("\\b(?U)(?i)бяка\\b", "[вырезано цензурой]");
        return censoredTxt;
    }

//    == Метод вхождения строк друг в друга ==
    public static int counterEnters(String testText, String innerText){
        int counter=0;
        int index = 0;
        int ind = 0;
        while(ind>=0){
            ind = testText.indexOf(innerText, index);
            index=ind+innerText.length();
            if(ind<0) {break;}
            ++counter;
        }
        return counter;
    }

    public static String reverseWords(String txtToReverse) {
        StringBuilder reversedWords = new StringBuilder();
        String [] splitedTxt = txtToReverse.split(" ");
        for (String w: splitedTxt) {
            StringBuilder rev = new StringBuilder(w);

            reversedWords.append(rev.reverse() +" ");
        }
        return reversedWords.toString().trim();
    }
}

