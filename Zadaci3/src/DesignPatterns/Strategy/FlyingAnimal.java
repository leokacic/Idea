package DesignPatterns.Strategy;

public interface FlyingAnimal{

    public String fly();
}

class itFlys implements FlyingAnimal{

    @Override
    public String fly() {
        return "Im flying";
    }
}

class cantFlys implements FlyingAnimal{

    @Override
    public String fly() {
        return "Im not flying";
    }
}
