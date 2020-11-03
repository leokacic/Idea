package paket.Interfaces;

import paket.Interfaces.testInterface.Car;

public class implementsCar implements Car {
    public void print(){System.out.println("aaa");};
    public void drive(){System.out.println("aaa");};
    public void brake(){System.out.println("aaa");};

    public static void main(String[] args){
        implementsCar a = new implementsCar();
        a.print();
        a.drive();
        a.brake();
    }
}
