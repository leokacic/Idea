package DesignPatterns;

public class Pyth {
    public static void main(String[] args) {


        for(int i = 1; i<1000;i++)
        {
             for(int j = 1;j<1000;j++)
             {
                 for(int k = 0; k<1000;k++) {
                     if(((i*i) + (j*j) == (k*k)) && (i+j+k == 1000)){
                         System.out.println("i: " + i + " j: "+ j+" k: "+k);

                     }
                 }

             }

        }

    }
}
