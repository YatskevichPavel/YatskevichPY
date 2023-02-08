package test;

import java.util.Arrays;
import java.util.regex.Matcher;



import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String hello = "Hello java!";
        String hello2 = "NewText was ";

//        boolean result = hello.matches("[a-zA-Z]{5}\\s[a-zA-Z]{4}!");
//        boolean result2 = hello2.matches("[a-zA-Z]{7}\\s[a-zA-Z]{3}\\s");
//        System.out.println(result);
//        System.out.println(result2);


        String[] strings = hello.split("\\s");
        System.out.println(Arrays.toString(strings));

        // Регулярные выражения Pattern Matcher
        Pattern pattern = Pattern.compile("[a-zA-Z]{5}\\s[a-zA-Z]{4}!");

        Matcher matcher = pattern.matcher(hello);

        System.out.println(matcher.matches());

        // Поиск:
//        while (matcher.find())
//            System.out.println(matcher.start() + " " + matcher.end());
////        System.out.println(hello.substring(matcher.start(), matcher.end()));
//
//        System.out.println(matcher.group(1));
//        System.out.println(matcher.group(2));
    }
}

