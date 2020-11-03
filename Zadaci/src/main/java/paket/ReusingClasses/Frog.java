package paket.ReusingClasses;

class Amphibian{
    void sound(){
        System.out.println("Amphibit");
    }
    void jump(){
        System.out.println("I jumped");
    }
    static void amphibianSays(Frog i){
        System.out.println("I am an amphibian");
    }
}

public class Frog extends Amphibian{
    static void frogSays(Frog i){
        System.out.println("I am an frog");
    }
    void sound(){
        System.out.println("Ribbit");
    }
    public static void main(String[] args){
        Amphibian amphibian = new Amphibian();
        amphibian.sound();
        Frog frog = new Frog();
        frog.sound();
        amphibianSays(frog);
        frog.sound();
        amphibian.sound();

    }
}
