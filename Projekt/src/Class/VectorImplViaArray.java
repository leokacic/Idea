package Class;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
* JavaDoc
*/

interface IVector{
    public boolean addObject (Integer index, Object element);
    public boolean add (Object o);
    public Object elementAt (Integer i);
    public Object remove (Integer i);
    public boolean remove (Object o);
    public int size ();
}

public class VectorImplViaArray{
    public static Object array[] = new Object[100];


    public static boolean addObject(int index, Object element){
        List<Object> list = new ArrayList<Object>();
        list.add(index, element);
        array = list.toArray();
        System.out.println(list);
        System.out.println(array);
        return true;
    }

    public boolean add (Object o){

        return true;
    }

    public static void main(String args[]){

        addObject(1,"aa" );
        for(int i = 0; i < 10 ; i++){

        }

    }

}
