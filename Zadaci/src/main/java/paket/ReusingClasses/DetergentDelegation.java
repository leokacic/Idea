package paket.ReusingClasses;
class CleanserDelegation {
    private String s = "cleanser";
    public void append(String a){ s+=a;};
    public void scrub(){
        append("scrub()");
    }
    public String toString(){
        return s;
    }
}
public class DetergentDelegation{
    private String s;
    private CleanserDelegation control = new CleanserDelegation();

    public void append(String a){
        control.append(a);
    }

    public void scrub(){
        append("Detergent.scrub()");
    }
    public String toString(){
        return control.toString();
    }
    public static void main (String[] args){
        DetergentDelegation x = new DetergentDelegation();
        x.scrub();
        System.out.println(x);
    }
}
