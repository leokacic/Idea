package Intro;

public class Cup {
    Cup(int marker){
        System.out.println("Intro.Cup("+marker +")");
    }
    void f(int marker){
        System.out.println("f("+marker +")");
    }
}

class Cups{
    static Cup cup1;
    static Cup cup2;
    static {
        cup1 = new Cup(1);
        cup2 = new Cup(2);
    }
    Cups(){
        System.out.println("Intro.Cups()");
    }

    public class ExplicitStatic{

    }
}