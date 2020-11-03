package paket.InnerClasses;

public class InnerInnerClass {

    class innerClass {
        class oneMoreInnerClass{
            String name= "leo";
            oneMoreInnerClass(){
                name= "hello";
            }
        }
        public void main (String[] args){
            oneMoreInnerClass leo = new oneMoreInnerClass();
        }
    }
    public static void main (String[] args){
       //neMoreInnerClass leo = new oneMoreInnerClass(); // ne moze se pozvati instanca druge unutarnmje klase
    }
}
