package paket.Interfaces;

abstract public class Abstract {
    void print(){
        System.out.println("abstract");
    }
}

class Derived extends  Abstract{
    void print(){
        System.out.println("Derived");
    }

    static void call(){
        Abstract a = new Derived();
        a.print();
    }



    public static void main (String[] args){
        call();
    }
}