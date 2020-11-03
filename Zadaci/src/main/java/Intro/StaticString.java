package Intro;

public class StaticString {
    public static String leo= "leo";

    StaticString(){
        System.out.println("pozvan konstruktor");
    }
    {
        String feo = "feo";
        System.out.println(feo);
        System.out.println(leo);
    }

    static {
        String teo="teo";
        System.out.println(teo);
        System.out.println(leo);
    }

    public static void main (String [] args){
        System.out.println("pocetak");
        new StaticString();
        System.out.println();
    }
}
