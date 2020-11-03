package paket.ReusingClasses;

class method{
    method(){}
    void print(){
        System.out.println("Without arguments");
    }
    void print(String a){
        System.out.println("String argument: " + a);
    }
    void print(Integer a, Integer b){
        System.out.println("Integer argument: " + a + " " + b);
    }
}

public class OverloadingClass extends method{
    void print(Float a, Float b, Float c){
        System.out.println("Float argument: " + a + " " + b + " " + c);
    }

    public static void main(String[] args){
        OverloadingClass ex = new OverloadingClass();
        ex.print();
        ex.print("String print");
        ex.print(2,3);
        ex.print(3f,5f,7f);
    }
}
