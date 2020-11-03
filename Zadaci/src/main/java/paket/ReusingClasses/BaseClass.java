package paket.ReusingClasses;

class BaseClass {
    BaseClass(String a){
        System.out.println("Base class Const");
    }
}

class DerivedClass extends BaseClass{
    DerivedClass(){
        super("a");
        System.out.println("Derived no-arg constructor");

    };
    DerivedClass(String a){
        super("b");
        System.out.println("Derived string constructor");
    }
}