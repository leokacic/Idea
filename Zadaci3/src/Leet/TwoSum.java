package Leet;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {


    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        List<Integer> index = new ArrayList<>();
        lista.add(5);
        lista.add(7);
        lista.add(7);
        lista.add(8);

        index = getIndices(lista,12);
    }

  static List<Integer> getIndices(List<Integer> list,int target){
        for(int i = 0; i<list.size();i++){
            for(int j = 0; j<list.size();j++)
            {
                if((list.get(i)+list.get(j)) == target){
                    System.out.println("i: "+list.get(i) +" + j: "+list.get(j) +" =" + target);
                    List<Integer> listaIndexa = new ArrayList<>();
                    listaIndexa.add(list.get(i));
                    listaIndexa.add(list.get(j));
                    return listaIndexa;
                }
            }
        }
        return null;
  }
}
