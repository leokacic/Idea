package paket.Access;

public class protectedClass {
    protected static String protectedMethod(String a) {
        System.out.println("Ovo je ispis protected varijable: "+a);
        String protectedVar= "protectedVar";
        return protectedVar;
    }

    static String TestMethod (String a){
        String testVar;
        testVar = protectedMethod("leo");System.out.println("Ovo je ispis testne varijable: "+testVar);
        return a;
    }
    public static void main (String[] args){
        TestMethod("a");
    }
}
