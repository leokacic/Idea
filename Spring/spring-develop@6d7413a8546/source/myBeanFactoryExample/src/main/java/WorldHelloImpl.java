/**
 * Concrete object.
 */
public class WorldHelloImpl implements IHelloWorld {

    private String frane = "matosic";

    public void sayHello() {
        System.out.println(frane);
    }

    // getters, setters

    public String getFrane() {
        return frane;
    }

    public void setFrane(String frane) {
        this.frane = frane;
    }
}

