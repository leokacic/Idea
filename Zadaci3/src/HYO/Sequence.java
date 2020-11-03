package HYO;

import java.util.Iterator;
import java.util.Scanner;

interface Selector {
    boolean end();

    Object current();

    void next();
}

public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public Iterator<Object> iterator(){
        return  new SequenceIterator();
    }

    public void add(Object x) {
        if (next < items.length) items[next++] = x;
    }

    private class SequenceIterator implements Iterator<Object> {
        int cursor = 0;
        @Override
        public boolean hasNext() {
            return cursor<items.length;
        }

        @Override
        public Object next() {
            return items[cursor++];
        }
    }

    private class SequenceSelector implements Selector {
        private int i = 0;

        public boolean end() {
            return i == items.length;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if (i < items.length) i++;
        }
    }

    class ReverseSelector implements Selector{
        private int i = items.length-1;

        public boolean end() {
            return i == 0;
        }

        public Object current() {
            return items[i];
        }

        public void next() {
            if ( items.length > 0) i--;
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    public Selector reverseSelector() {
        return new ReverseSelector();
    }

    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        Sequence sequence = new Sequence(number);
        if(number>10){
            throw new IllegalArgumentException("Number must be smaller then 10. Try Again");
        }
        for (int i = 0; i < number; i++) sequence.add(Integer.toString(i));



        Iterator<Object> it = sequence.iterator();

        while(it.hasNext()){

            System.out.println(it.next());
        }

        Selector selector = sequence.selector();
        Selector reverseSelector = sequence.reverseSelector();
        while (!selector.end()) {
            System.out.print(selector.current() + " ");
            selector.next();
        }
        while (!reverseSelector.end()) {
            System.out.print(reverseSelector.current() + " ");
            reverseSelector.next();
        }
    }
}