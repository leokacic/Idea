package HYO;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
        System.out.println("HYO.Mouse eating");
    }
    void run() {
        System.out.println("HYO.Mouse running");
    }
    void print(){System.out.println("HYO.Mouse: "+i);}
    void sleep() {
        System.out.println("HYO.Mouse sleeping");
    }
}

class Gerbil2 extends Rodent{
    int i = 2;
    void eat() {
        System.out.println("HYO.Gerbil eating");
    }
    void run() {
        System.out.println("HYO.Gerbil running");
    }
    void print(){System.out.println("HYO.Gerbil2: "+i);}
    void sleep() {
        System.out.println("HYO.Gerbil sleeping");
    }
}

class Hamster extends Rodent{
    int i = 3;
    void eat() {
        System.out.println("HYO.Hamster eating");
    }
    void run() {
        System.out.println("HYO.Hamster running");
    }
    void print(){System.out.println("HYO.Hamster: "+i);}
    void sleep() {
        System.out.println("HYO.Hamster sleeping");
    }
}

class Rodents{
    public static void main(String[] args){
        List<Rodent> list = new ArrayList<Rodent>();

        for(int i = 0; i<3;i++){
            list.add(new Hamster());
            list.add(new Mouse());
            list.add(new Gerbil2());
        }

        Iterator<Rodent> it = list.iterator();


        while(it.hasNext()){
            it.next().eat();
        }

/*        rodents[0].eat();
        rodents[1].eat();
        rodents[2].eat();

        rodents[0].print();
        rodents[1].print();
        rodents[2].print();*/
    }

}