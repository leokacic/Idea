package paket.InnerClasses;

public interface ClassInInterface {
    void howdy();
    class Test implements ClassInInterface{
        public void howdy(){
            System.out.println("Howdy!");
        }
        public static void main(String[] args){
            new Test().howdy();
        }
    }
}

class ImplementsInterface implements  ClassInInterface{
    @Override
    public void howdy() {
        System.out.println("Howdy Leo aa!");
    }
    public static void main(String [] args){
        Test leo = new Test();
        leo.howdy();
        new ImplementsInterface().howdy();
    }
}