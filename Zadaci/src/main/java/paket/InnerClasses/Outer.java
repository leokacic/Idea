package paket.InnerClasses;

public class Outer {
    private String ime;
     private Outer(){
         ime = "Outer";
    }
    static class Inner{
        public void print(){
            System.out.println("Intro.Hello");
        }

        public void toString(String a){
                System.out.println(a);
        }
    }
    static public Inner getInner(){
        return new Inner();
    }

    public static  void main(String [] args){
        Inner a = getInner();
        a.print();
        Outer o = new Outer();
        a.toString(o.ime);
    }
}
