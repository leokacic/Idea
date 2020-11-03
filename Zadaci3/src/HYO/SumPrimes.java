package HYO;

import java.math.BigDecimal;

import static java.lang.Math.sqrt;

interface Hello2{
    public void go();
    default void hello(){
        System.out.println("Helloooo");
    }
}

public class SumPrimes implements Hello2{
    public static void main(String[] args) {
        int num= 2000000;
        long sum = 0;
        int counter = 0;
        for(int i = 2;i<num;i++)
        {
            counter=1;
            if(i%2 == 0 || i%3 == 0 || i%5 == 0 ){
                if(i ==2 || i == 3 || i==5){
                    sum+=i;
                }
            } else {
                for(int j = 1;j<=sqrt(i);j++)
                {
                    if(i%j ==0){
                        counter++;
                    }
                }
                if(counter == 2){
                    System.out.println("Prime #: "+i);
                    Hello2 hello2 = new Hello2() {
                        @Override
                        public void go() {

                        }
                    };

                    hello2.hello();
                    sum += i;
                }
            }
        }
        System.out.println(sum);
    }
    @Override
    public void go() {
        System.out.println("go");
    }

}
