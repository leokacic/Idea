package HYO;

import java.util.*;

public class HashTesting {
    public static void main(String[] args) {
        // insert HashMap
        Map<String, Integer> hashMap = new HashMap<String, Integer>();
        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);
        hashMap.put("four", 4);
        hashMap.put("five", 5);
        // print HashMap
        System.out.println(hashMap);
        // extract to ArrayList
        Set<Map.Entry<String,Integer>> set = hashMap.entrySet();
        List<Map.Entry<String,Integer>> list = new ArrayList<Map.Entry<String,Integer>>();
        list.addAll(set);
        // sort ArrayList
        Collections.sort(list, new Comparator<Map.Entry<String,Integer>>() {
            public int compare(Map.Entry<String,Integer> entry1, Map.Entry<String,Integer> entry2) {
                return Integer.compare(entry1.getValue(),  entry2.getValue());
            }
        });
        // insert into LinkedHashMap
        Map<String,Integer> linkedHashMap = new LinkedHashMap<String,Integer>();
        for (Map.Entry<String,Integer> entry : list) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        // print LinkedHashMap
        System.out.println(linkedHashMap);
    }
}