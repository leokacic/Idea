package HYO;

import java.util.ArrayList;

public class ListClass {
    private static int count = 0;
    private final int ID = ++count;
    public String toString(){
        return "HYO.ListClass#" + ID;
    }

    String name ="List";
    public static void main(String[] args){
        ListClass ex1 = new ListClass();
        ListClass ex2 = new ListClass();
        ListClass ex3 = new ListClass();
        ListClass ex4 = new ListClass();

        ArrayList<ListClass> lista = new ArrayList<>();
        lista.add(ex1);
        lista.add(ex2);
        lista.add(ex3);
        lista.add(ex4);


        System.out.println(lista);
        lista.subList(1,3).clear();
        System.out.println(lista);

    }
}
