package paket.InnerClasses;

class StringClass {
    String a;

    public String toString(String a) {
        System.out.println(a);
        return a;
    }
}

class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) items[next++] = x;
    }

}

public class StringSequence {
    public static void main(String[] args){
        Sequence sequence = new Sequence(10);
        StringClass print = new StringClass();
        for(int i = 0; i < 10; i++)    {
            sequence.add(Integer.toString(i));
            print.toString(Integer.toString(i));
        }

    }
}
