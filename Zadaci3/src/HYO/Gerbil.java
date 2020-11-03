package HYO;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Gerbil {
    int gerbilNumber=0;
    Gerbil(int i){
        gerbilNumber=i;
    }
    public static void display(Iterator<Gerbil> it){
        while(it.hasNext()){
            Gerbil g = it.next();
            g.hop();
            System.out.println(g.gerbilNumber +":" + g + " ");
        }
    }
    public void hop() {
        System.out.println("Is hopping "+gerbilNumber);
    }
    public static void main(String[] args){
        Map<Gerbil,String> map = new HashMap<Gerbil,String>();
        for(int i = 0; i<10;i++)
        {
            map.put(new Gerbil(i),""+i);
        }

            display(map.keySet().iterator());

    }
}
