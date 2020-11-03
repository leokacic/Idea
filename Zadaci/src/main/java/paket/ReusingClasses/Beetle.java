package paket.ReusingClasses;

class Insect {
    private int i = 9;
    protected int j;
    Insect(){
        System.out.println("i= " + i + ", j ="+ j);
        j=39;
    }

    private static int x1 = printInit("static Insect.x1 initialized");
    final public static int printInit(String s){
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insect{
    private int k = printInit("Beetle.k initialized");

    static int printInit(Integer s){
        System.out.println("Overwritten method: "+s);
        return 3;
    }
    public Beetle(){
        System.out.println("k = " + k);
        System.out.println("j = " + j);
    }
    private static int x2 = printInit("static Beetle.x2 initiallized");
    public static void main (String[] args){
        printInit(2);
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}

class TypeOfBeetle extends Beetle{
 private int b = printInit("TypeOfBeetle.b initialized");
 public static void main (String [] args){
     System.out.println("Type of Beetle constructor");
     String[] a ={};
     Beetle.main(a);
     TypeOfBeetle egyptian = new TypeOfBeetle();
 }
}
