package Intro;

public class Enum {


    public enum Currency {
        CENT, NICKLE, DIME, DOLLAR, FIFTY_DOLLARS, HUNDRED_DOLLARS
    }
    public static void main (String [] args){

        for(Currency c : Currency.values()){
            System.out.print("Value is : "+ c + " ordnial is : " + c.ordinal() + " ");
            switch (c){
                case CENT:
                    System.out.println("1 Cent 1/100 of a dollar");
                    break;
                case NICKLE:
                    System.out.println("A nickle is 25 cents");
                    break;
                case DIME:
                    System.out.println("A dime is 50 cents");
                    break;
                case DOLLAR:
                    System.out.println("A dollar is 100 cents");
                    break;
                case FIFTY_DOLLARS:
                    System.out.print("50 dollars");
                    break;
                case HUNDRED_DOLLARS:
                    System.out.println("100 dollars");
                    break;
            }
        }


    }
}

