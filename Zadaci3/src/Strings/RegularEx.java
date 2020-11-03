package Strings;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularEx {

    static String sentence = " Java now has regular expressions";

    public static void split(String regex){
        System.out.println(Arrays.toString((sentence.split(regex))));
    }

    public static void replace(String regex){
        System.out.println((sentence.replaceAll(regex,"_")));
        //  System.out.println(knight);
    }

    public static void main(String[] args) {
        String[] pattern = {"^Java","\\Breg.*","s?","s*","s+","s{4}","s{1}","s{0,3}"};
        for(int i = 0;i<pattern.length;i++){
            Pattern r= Pattern.compile(pattern[i]);
            Matcher m = r.matcher(sentence);

            if(m.find()){
                System.out.println("Pronaden dio" + m.toString());
            }
        }

    }
}
