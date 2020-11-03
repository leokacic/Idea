package HYO;

public class DerivedBase {
    DerivedBase(){
        throw new IndexOutOfBoundsException();
    }
    static class Derived extends DerivedBase{
        Derived(){
            try{
               // super(); ne može jer mora bit prva linija
            }
            catch (Exception e)
            {

            }

        }
    }
    public static void main(String[] args){
    Derived ex = new Derived();
    }
}
