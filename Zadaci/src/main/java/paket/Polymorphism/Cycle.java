package paket.Polymorphism;


//Create a Cycle interface, with implementations Unicycle, Bicycle and Tricycle. Create factories for each type of Cycle, and code that uses these factories.
interface ICycle{
    void ride();
}

interface CycleFactory{
    Cycle getCycle();
}


public class Cycle implements ICycle {
    public void ride(){};
    static Integer wheels;
    public static void ride(Cycle i){
        System.out.println("I'm riding!!!");
        wheels(i.wheels);
    }
    public static void wheels(Integer wheels){
        System.out.println("I have this much wheels: " +wheels);
    }
}

class UnicycleFactory implements CycleFactory{
    public Unicycle getCycle(){
        return new Unicycle();
    }
}

class BicycleFactory implements CycleFactory{
    public Bicycle getCycle(){
        return new Bicycle();
    }
}

class TricycleFactory implements CycleFactory{
    public Tricycle getCycle(){
        return new Tricycle();
    }
}

class Unicycle extends Cycle{
    public static void main(String[] args){
        Unicycle u = new Unicycle();
        u.wheels = 1;
        Cycle.ride(u);
    }
    public void balance(){
        System.out.println("I am balancing");
    }
    }


class Bicycle extends Cycle {
    public static void main(String[] args) {
        Bicycle b = new Bicycle();
        b.wheels = 2;
        Cycle.ride(b);
    }
    public void balance(){
        System.out.println("I am balancing");
    }
}
class Tricycle extends Cycle{
    public static void main(String[] args){
        Tricycle c = new Tricycle();
        c.wheels = 3;
        Cycle.ride(c);
    }
}

class Riding{
    public static void getUnicycle(UnicycleFactory factory) {
        Unicycle s = factory.getCycle();
        System.out.println("Intro.Hello its me");
    }
    public static void getBicycle(BicycleFactory factory) {
        Bicycle s = factory.getCycle();
        System.out.println("Intro.Hello its me");
    }
    public static void getTricycle(TricycleFactory factory) {
        Tricycle s = factory.getCycle();
        System.out.println("Intro.Hello its me");
    }

    public static void main(String[] args){
        getUnicycle(new UnicycleFactory());
        getBicycle(new BicycleFactory());
        getTricycle(new TricycleFactory());
/*
        Unicycle u = new Unicycle();
        Cycle.ride(u);
        Bicycle b = new Bicycle();
        b.wheels = 2;
        Cycle.ride(b);
        Tricycle c = new Tricycle();
        c.wheels = 3;
        Cycle.ride(c);

        Unicycle[] x = {
*/
/*            new Cycle(),*//*

        };
        x[0].balance();
*/

    }
}
