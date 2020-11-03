package Strings;

import java.util.*;
import java.util.regex.*;

public class Exercise11 {
    private static final String phrase = "Arline ate eight apples and one orange while Anita hadn't any";
    public static boolean finding(String regex){
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(phrase);
        return m.find();
    }
    public static void main(String[] args){
        String regex = "(?i)((^[aeiou])|(\\s+[aeiou]))\\w+?[aeiou]\\b";
        System.out.println(Exercise11.finding(regex));
    }
}



