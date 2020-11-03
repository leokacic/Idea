package paket.ReusingClasses;

class Component1{
    Component1(String a){
        System.out.println("Component1");
    }
}
class Component2{
    Component2(String a){
        System.out.println("Component2");
    }
}
class Component3{
    Component3(String a){
        System.out.println("Component3");
    }
}

class Root {
    public void dispose(){
        System.out.println("Dispose component");
    }
    Root(String a){
        System.out.println("Root");
        Component1 ex1 = new Component1("a");
        dispose();
        Component2 ex2 = new Component2("a");
        dispose();
        Component3 ex3 = new Component3("a");
        dispose();
    }
}

class Stem extends Root{
    Stem(String a){
        super("a");
        System.out.println("Stem");
    }
    public static void main (String[] args){
        Stem ex = new Stem("a");
        ex.dispose();
    }

}