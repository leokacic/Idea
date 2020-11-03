package paket.Polymorphism;

import paket.ReusingClasses.Frog;

class Amphibian2{
    static void sound(){
        System.out.println("Amphibit");
        jump();
    }
    static void jump(){
        System.out.println("I jumped");
    }
    static void amphibianSays(FrogPoly i){
        System.out.println("I am an amphibian");
    }
}

public class FrogPoly extends Amphibian2{

    static void jump(){
        System.out.println("I jumped but i am a frog");
    }
    public static void main(String[] args){
        FrogPoly f= new FrogPoly();


    f.sound();
    }
}
