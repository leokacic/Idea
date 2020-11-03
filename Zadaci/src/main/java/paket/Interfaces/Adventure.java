package paket.Interfaces;

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanCLimb {
    void climb();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {
    }
}

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly,CanCLimb {
    public void swim() {
    }

    public void fly() {
    }

    public void climb() {
    }
}

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }
    public static void y(CanCLimb y) {
        y.climb();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero h = new Hero();
        t(h);
        y(h);// Treat it as a CanFight//
        u(h); // Treat it as a CanSwim
        v(h); // Treat it as a CanFly
        w(h); // Treat it as an ActionCharacter
        }
}