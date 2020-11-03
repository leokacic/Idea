package paket.ReusingClasses;
class Cleanser {
    private String s = "cleanser";
    public void append(String a){ s+=a;};
    public void scrub(){
        append("scrub()");
    }
    public String toString(){
        return s;
    }
}
public class Detergent extends Cleanser{
    public void scrub(){
        append(" scrub with detergent");
    }
    public void sterilize(){
        append(" Sterilize");
    }
    public static void main (String[] args){
        Detergent x = new Detergent();
        x.scrub();
        x.sterilize();
        System.out.println(x);
    }
}
