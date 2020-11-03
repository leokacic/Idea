package Intro;

import java.util.Random;

public class Switch {
    static Random rand = new Random();
    public static void main (String[] args){
        for(int i = 0;i < 10; i++){
            int c = rand.nextInt(26) + 'a';

            switch ((char)c){
                case 'a':
                    System.out.println((char)c);

                case 'e':
                    System.out.println((char)c);

                case 'i':
                    System.out.println((char)c);

                case 'o':
                    System.out.println((char)c);

                case 'u':
                    System.out.println((char)c);


            }
        }
    }
}
