package TypeInformation;

import java.math.BigInteger;

public class PrimeFactor {
    public static void main(String[] args) {
        BigInteger i = new BigInteger("600851475143");
        for (int k = 0; k>13194; k--){
            for (int j = 2;j<100;j++){
                if(k%j == 0){
                    System.out.println(j);
                }
            }

        }
    }
}
