package paket.AccessTest;
import paket.Access.*;
public class protectedTest extends PubPrivProtFields{
    public static void main (String[] args){
        PubPrivProtFields ex = new PubPrivProtFields();

        publicMethod("leo");
        //! privateMethod("leo"); //ne radi jer je metoda privatna
        protectedMethod("leo");
        //!ex.protectedString = "leo"; //ne radi protected je
    }
}
