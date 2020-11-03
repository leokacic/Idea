/**
 * Concrete object.
 */
public class ZdravoSvijeteImpl implements IHelloWorld {

    private String katica = "za sve!";

    public void sayHello() {
        System.out.println(katica);
    }

    // getters, setters

    public String getKatica() {
        return katica;
    }

    public void setKatica(String katica) {
        this.katica = katica;
    }
}

