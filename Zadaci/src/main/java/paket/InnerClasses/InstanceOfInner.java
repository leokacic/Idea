package paket.InnerClasses;

class Vanjska{
    static class Unutarnja{
        public void print(){
            System.out.println("Intro.Hello");
        }
    }
    public static Unutarnja getUnutarnja(){
        return new Unutarnja();
    }
}

public class InstanceOfInner {
    Vanjska ex = new Vanjska();
    Vanjska.Unutarnja ex2 = new Vanjska.Unutarnja();
}
