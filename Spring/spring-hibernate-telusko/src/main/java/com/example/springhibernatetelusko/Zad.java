package com.example.springhibernatetelusko;

import java.util.ArrayList;
import java.util.List;

public class Zad {
    public static void main(String[] args) {
        int num = 123456;
        int max = 0;

        for ( int k = 10000; k<998001;k++){

            String number2 = String.valueOf(k);
            List<String> list = new ArrayList<>();
            for(int i = 0;i< number2.length(); i++) {

                int j = Character.digit(number2.charAt(i),10);
                list.add(""+j);

            }
            if(number2.length()==5){
                if((list.get(0)).equals(list.get(4))&& (list.get(1)).equals(list.get(3)))
                {

                    max = k;
                    System.out.println(max);
                }
            }
            if(number2.length()==6){
                if((list.get(0)).equals(list.get(5))&& (list.get(1)).equals(list.get(4)) && (list.get(2)).equals(list.get(3)))
                {

                    max = k;
                    System.out.println(max);
                }
            }
        }
        System.out.println("Max je: " + max);
    }
}
