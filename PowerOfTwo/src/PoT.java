import java.util.*;

public class PoT {

    public static void main(String[] args) {
    int counter = 0;
        Collection mapa = new TreeSet<>();
        for(int i = 2; i<101 ;i++) {
            for ( int j = 2; j<101; j++){
               double sum =  Math.pow(i,j);
               if(!mapa.contains(sum)){

               }
                counter++;
                mapa.add(sum); // TO DO: maknit ponavljanja i prebrojat koliko ih ima
            }
        }
        System.out.println(counter);
            System.out.println(mapa);
    }
}
