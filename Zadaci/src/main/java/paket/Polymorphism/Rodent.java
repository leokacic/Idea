package paket.Polymorphism;

import java.awt.event.MouseAdapter;

abstract public class Rodent {
    Rodent(){
        print();
    }
     void eat(){};
     void run(){};
     void sleep(){};
     abstract void print ();

}

class Mouse extends Rodent{
    int i = 1;
    void eat() {
        System.out.println("Mouse eating");
    }
    void run() {
        System.out.println("Mouse running");
    }
    void print(){System.out.println("Mouse: "+i);}
    void sleep() {
        System.out.println("Mouse sleeping");
    }
}

class Gerbil extends Rodent{
    int i = 2;
    void eat() {
        System.out.println("Gerbil eating");
    }
    void run() {
        System.out.println("Gerbil running");
    }
    void print(){System.out.println("Mouse: "+i);}
    void sleep() {
        System.out.println("Gerbil sleeping");
    }
}

class Hamster extends Rodent{
    int i = 3;
    void eat() {
        System.out.println("Hamster eating");
    }
    void run() {
        System.out.println("Hamster running");
    }
    void print(){System.out.println("Mouse: "+i);}
    void sleep() {
        System.out.println("Hamster sleeping");
    }
}

class Rodents{
    public static void main(String[] args){
        Rodent[] rodents = new Rodent[5];

        rodents[0] = new Hamster();
        rodents[1] = new Mouse();
        rodents[2] = new Gerbil();

        rodents[0].eat();
        rodents[1].eat();
        rodents[2].eat();

        rodents[0].print();
        rodents[1].print();
        rodents[2].print();
    }

}
