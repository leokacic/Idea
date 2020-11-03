package paket;
import paket.Vector.*;
import java.util.*;
public class packageClass {
    public String name;
    packageClass(){
         name = "leo";
    }
    public static void main(String[] args){
        packageClass ex = new packageClass();
      //!  Vector v = new Vector();  ne radi jer se tuku dva importa
        ex.name= "teo";

    }
}
