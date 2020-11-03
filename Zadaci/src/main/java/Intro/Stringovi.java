package Intro;

import java.util.Random;

public class Stringovi {
    static String one = "leo";
    public Stringovi(){
        this.one = "teo";
        System.out.println("Ovo je konstruktor");
    }

    public Stringovi (String message){
        System.out.println(message);
        System.out.println("Ovo je konstruktor");
    }

    static int random(){
        Random rand = new Random();
        int result = rand.nextInt(100);

        return result;
    }

    public static void main (String[] args){
        int a,b;
        boolean flag = false;
        System.out.println("Ovaj broj je prost: " + one);
        Stringovi ex = new Stringovi();
        System.out.println("Ovaj broj je prost: " + ex.one);
        new Stringovi("aaa");
//        for(int i =2 ;i<24; i++){
//            flag = false;
//            a= i;
//            for(int j=2;j<=a/2; j++){
//                if (a % j == 0){
//                    flag = true;
//                    break;
//
//                }
//            }
//            if(!flag){
//                System.out.println("Ovaj broj je prost: " + a);
//            } else {
//                System.out.println("Ovaj broj nije prost: " + a);
//            }
////            a = random();
////            b= random();
////            if(a>b){
////                System.out.println("Vrijednost a je veca od b: a = "+a+" b = "+ b);
////            } else if(a<b){
////                System.out.println("Vrijednost b je veca od a: a = "+a+" b = "+ b);
////            } else {
////                System.out.println("Vrijednosti su jednake: a = "+a+" b = "+ b);
////            }
        }
    }

