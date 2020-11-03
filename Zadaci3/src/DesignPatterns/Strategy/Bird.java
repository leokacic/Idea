package DesignPatterns.Strategy;

public class Bird extends Animal{

    public Bird() {
       flyingType = new cantFlys();
    }
}
