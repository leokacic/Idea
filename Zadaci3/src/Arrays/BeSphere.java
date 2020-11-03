package Arrays;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class BerylliumSphere {
    public static  long counter;
    private final long id = counter++;
    public String toString() {
        return "Sphere "+ id;
    }
}

public class BeSphere {
    public static void getList(BerylliumSphere[] lista){

    }

    public static void main(String[] args) {
        List<Integer> list  = new ArrayList<>(){{
            add(1); add(2);
        }};
        System.out.println(list);
        Collections.shuffle(list);
        Collections.sort(list);
        System.out.println(list);
        BerylliumSphere[] c = new BerylliumSphere[5];
        getList(c);
    }
}
