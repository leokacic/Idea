package Intro;

class Horse{
    boolean inStable;
    Horse(boolean in){
        inStable = in;
    }
    Horse(){
        System.out.println("Error aaaaaaaaaaaathe horse is not in the stable!");
    }
    public void finalize(){
        if(!inStable)
            System.out.println("Error the horse is not in the stable!");
    }
}

public class MainWindow {
    public static void main(String[] args){
        System.out.println("Error bbbbbbbbbbbbbbbbbb orse is not in the stable!");
        Horse a = new Horse();
        Horse h = new Horse(false);
        h = new Horse (true);
        System.gc();
    }
}
