package paket.Interfaces;

import java.util.Random;

interface CoinDiceGame{
    void printName(String a);
}

class Coin implements CoinDiceGame{
    String name ="50 cent coin";
    public void printName(String a){
        Coin c = new Coin();
        System.out.println(c.name);
    }
    void flip(){
        Random rand = new Random();
                 if(Math.random()<0.5){
                System.out.println("Palo je pismo");
            } else {
                System.out.println("Pala je glava");
            }
        }
    }

    interface CoinDiceFactory {
    CoinDiceGame getCoinDiceGame();
    }

    class CoinFactory implements CoinDiceFactory{
        public Coin getCoinDiceGame(){
            return new Coin();
        }
    }

class DiceFactory implements CoinDiceFactory{
    public Dice getCoinDiceGame(){
        return new Dice();
    }
}

class Dice implements  CoinDiceGame{
    public void printName(String a){
        Dice c = new Dice();
        System.out.println(c.name);
    }
    String name = "Dice with 6 numbers";
    void throwDice(){
        Random rand = new Random();
        System.out.println((rand.nextInt(6) + 1));
    }
        }



public class CoinDiceToss {

    public static void getCoin(CoinFactory factory){
        Coin c = factory.getCoinDiceGame();
        c.flip();
    }

    public static void getDice(DiceFactory factory){
        Dice d = factory.getCoinDiceGame();
        for(int i = 0; i< 10;i++){
            d.throwDice();
        }
    }

    public static void main(String[] args){
        getCoin(new CoinFactory());
        getDice(new DiceFactory());
    }
}
