package Generics;

class A {

}

class B {

}

class C {

}
public class Holder<T> {
    private T a;
    public Holder(T a){
        this.a = a;
    }
    public void set(T a){
        this.a = a;
    }
    public T get(){
        return a;
    }

    public static void main(String[] args) {
        Holder<A> h1 = new Holder<A>(new A());
        Holder<B> h2 = new Holder<B>(new B());
        Holder<C> h3 = new Holder<C>(new C());

        h1.get();
    }
}
