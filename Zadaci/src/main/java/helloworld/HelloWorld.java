package helloworld;
import java.util.Date;
/**
 * Ovo je javadoc
 * */
public class HelloWorld {
    static int i;
    static String color;
    double d;
    boolean b;

    Character ch= 'x';
    char c = ch;

    float x=11.3f;
    float y= 34.2f;



    static void increment(int a){

        double d = HelloWorld.i++ + a;
//        System.out.println(d);
    }

    static void changeHueOfColor(int newHue){
        switch(newHue){
            case 1:
            color = "blue";
                break;
            case 2:
                color = "red";
                break;
            case 3:
                color = "green";
                break;

        }
    }

    public static void main(String args[]){
//

//        System.out.println("hello world its ");/**/
//        System.out.println(new Date());
//
        HelloWorld ex1 = new HelloWorld();
        HelloWorld ex2= new HelloWorld();
        ex1=ex2;
        System.out.println(ex1.x +" "+ex2.x);
        ex1.x=22.3f;
        System.out.println(ex1.x +" "+ex2.x);
//        HelloWorld ex3 = new HelloWorld();
//
//
//        HelloWorld sf = new HelloWorld();
//
//        for (int i = 0;i<10;i++){
//            HelloWorld.increment(i);
//        }
//        ex2.i++;
//
////        System.out.println(ex1.i + " " + ex2.i + ex3.i);
//        System.out.println(ex1.ch+ " " + ex1.c);
//        System.out.println(" O");

    float b = 2;
    b= ex1.x * ex2.y;

        HelloWorld.changeHueOfColor(1);
        System.out.println("The color is " + b);

    }
}
