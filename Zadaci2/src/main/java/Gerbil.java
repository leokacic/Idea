import java.util.ArrayList;

public class Gerbil {
    int gerbilNumber=0;
    Gerbil(int i){
        gerbilNumber=i;
    }
    public void hop() {
        System.out.println("Is hopping "+gerbilNumber);
    }
    public static void main(String[] args){
        ArrayList<Gerbil> lista = new ArrayList<Gerbil>();
        for(int i = 0; i<10;i++)
        {
            lista.add(new Gerbil(i));
        }
        for(int i = 0; i<10;i++)
        {
            lista.get(i).hop();
        }
    }
}
