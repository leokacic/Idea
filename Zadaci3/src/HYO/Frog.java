package HYO;

class Characteristic {
    private String s;

    Characteristic(String s) {
        this.s = s;
        System.out.println("Creating HYO.Characteristic " + s);
    }

    protected void dispose() {
        System.out.println("disposing HYO.Characteristic " + s);
    }
}

class Description {
    private String s;

    Description(String s) {
        this.s = s;
        System.out.println("Creating HYO.Description " + s);
    }

    protected void dispose() {
        System.out.println("disposing HYO.Description " + s);
    }
}

class LivingCreature {
    private Characteristic p = new Characteristic("is alive");
    private Description t = new Description("Basic Living Creature");

    LivingCreature() {
        System.out.println("HYO.LivingCreature()");
    }

    protected void dispose() {
        System.out.println("HYO.LivingCreature dispose");
        t.dispose();
        p.dispose();
    }
}

class Animal extends LivingCreature {
    private Characteristic p = new Characteristic("has heart");
    private Description t = new Description("HYO.Animal not Vegetable");

    Animal() {
        System.out.println("HYO.Animal()");
    }

    protected void dispose() {
        System.out.println("HYO.Animal dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

class Amphibian extends Animal {
    private Characteristic p = new Characteristic("can live in water");
    private Description t = new Description("Both water and land");

    Amphibian() {
        System.out.println("HYO.Amphibian()");
    }

    protected void dispose() {
        System.out.println("HYO.Amphibian dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }
}

public class Frog extends Amphibian {
    private Characteristic p = new Characteristic("Croaks");
    private Description t = new Description("Eats Bugs");

    public Frog() {
        System.out.println("HYO.Frog()");
    }

    protected void dispose() {
        System.out.println("HYO.Frog dispose");
        t.dispose();
        p.dispose();
        super.dispose();
    }

    public static void main(String[] args) {
        Frog frog = new Frog();
        try{
            System.out.println("Bye!");
        } finally {
            frog.dispose();
        }

    }
}