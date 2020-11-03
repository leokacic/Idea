package paket.Polymorphism;
import paket.Polymorphism.*;

public class Circle extends Shape{
    @Override public void draw() {
        System.out.println("Cricle.draw()");
    }
    @Override public void erase() {
        System.out.println("Cricle.erase()");
    }

    public void print(){
        System.out.println("Intro.Hello I'm a circle.");
    }
}