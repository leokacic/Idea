package paket.ReusingClasses;

class A{
    A(String a){
        System.out.println("Klasa A");
    }
}
class B{
    B(String b){
        System.out.println("Klasa B");
    }
}
class C extends A{
    C(){
        super("a");
        B ex = new B("b");
    }
}
public class ABC {
    public static void main (String[] args){
        C exC = new C();
    }
}
