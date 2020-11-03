package Strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SentenceChecker {

    static String knight = "Then, when you have found the shrubbery, you must " +     "cut down the mightiest tree in the forest... " +     "with... a herring!";

    public static void split(String regex){
        System.out.println(Arrays.toString((knight.split(regex))));
    }

    public static void replace(String regex){
        System.out.println((knight.replaceAll(regex,"_")));
      //  System.out.println(knight);
    }

    public static void main(String[] args) {
        String sentence = "Obi wan never told you what happened to your father.";

        String pattern = "^[A-Z].*\\.";
        String patternSplit ="^[the]";
        //split("the");
        replace("(?i:[aeiou]+)\\B");

        Pattern r= Pattern.compile(pattern);
        Matcher m = r.matcher(sentence);

        Pattern ex10= Pattern.compile(pattern);
        Matcher mex10 = r.matcher(sentence);
        if(m.find()){
            System.out.println("Pronadena recenica s ispravnim gramatičkim pravopisom"+sentence);
        }
        Matcher m2 = r.matcher(knight);
        if(m.find()){
            System.out.println("Pronadena recenica s ispravnim gramatičkim pravopisom"+sentence);
        }
    }
}
