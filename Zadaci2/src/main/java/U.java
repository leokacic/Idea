import java.util.List;

public interface U {

    void print1();

    void print2();

    void print3();
}

class A {
    static int counter = 0;

    public U u() {
        return new U() {

            public void print1() {

                System.out.println("Print1");
            }

            public void print2() {
                System.out.println("Print2");
            }

            public void print3() {
                System.out.println("Print3");
            }
        };

    }

    public static void main(String[] args) {
        A a1 = new A();
        A a2 = new A();
        A a3 = new A();
        B b = new B();
        b.store(a1.u(), counter);
        counter++;
        b.store(a2.u(), counter);
        counter++;
        b.store(a3.u(), counter);
        counter++;
        b.nullAdder(1);
        b.readList(counter);
        ;
    }
}

class B {
    U[] lista = new U[30];

    void store(U u, int i) {
        lista[i] = u;
    }

    void nullAdder(int i) {
        lista[i] = null;
    }

    void readList(int j) {
        for (int i = 0; i < j; i++) {
            if (lista[i] == null) {
                System.out.println("ovaj clan je null");
                continue;
            }
            lista[i].print1();
        }
    }
}
