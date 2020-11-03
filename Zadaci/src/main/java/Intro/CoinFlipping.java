package Intro;

import java.util.Random;

public class CoinFlipping {

    public static void main (String[] args){
        Random rand = new Random();
        int pismo = 0;
        int glava = 0;
        for(int i = 0;i<1000;i++){
            if(Math.random()<0.5){
                System.out.println("Pismo");
                pismo++;
            } else {
                System.out.println("Glava");
                glava++;
            }
        }
        System.out.println("Pismo: "+pismo +" Glava: "+ glava);


    }
}
