package paket.Interfaces;
//(2) Create three interfaces, each with two methods. Inherit anew interface that combines the three, adding a
// new method.
// Create a classby implementing the new interface and also inheriting from a concrete class. Now write four methods,
// each of which 232Thinking in JavaBruce Eckel
//takes one of the four interfaces as anargument. In main( ), create an object of your class and pass it to each of
// themethod
interface Interface1 {

    default public void foo() { System.out.println("Interface1's foo"); }
    default public void bar() { System.out.println("Interface1's bar"); }

}
interface Interface2 {

    default public void foo() { System.out.println("Interface2's foo"); }
    default public void bar() { System.out.println("Interface2's bar"); }

}
interface Interface3 {

    default public void foo() { System.out.println("Interface3's foo"); }
    default public void bar() { System.out.println("Interface3's bar"); }
}

interface Interface123 extends Interface1,Interface2,Interface3 {

    default public void foo() { System.out.println("Interface123's foo"); }
    default public void bar() { System.out.println("Interface123's bar"); }
    default public void foobar() { System.out.println("Interface1233's foobar"); }
}

public class Example implements Interface123{

    static public void one(Interface1 a){a.foo();};
    static public void two(Interface2 a){a.foo();};
    static public void three(Interface3 a){a.foo();};
    static public void four(Interface123 a){a.foo();};


    public static void main (String[] args){
        Example ex = new Example();
        one(ex);
        two(ex);
        three(ex);
        four(ex);
    }
}
