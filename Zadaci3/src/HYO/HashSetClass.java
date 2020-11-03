package HYO;

import java.util.*;

public class HashSetClass {
    public static void main(String[] args){
        Random rand = new Random(47);
        Set<String> set = new HashSet<String>();
        Set<String> linkedSet = new LinkedHashSet<String>();
        for(int i= 0; i<10; i++){
            set.add("a"+rand.nextInt(20));
        }

        System.out.println(set);
    Iterator<String> it = set.iterator();
        while(it.hasNext()){
            linkedSet.add(it.next());
        }
        System.out.println(linkedSet);
    }
}
