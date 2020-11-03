package Intro;

public class RekurzijaFaktorijel {

    static public Integer faktorijela= 1;
    static Integer Rekurzija(Integer var){

        if(var>1) {
            faktorijela *= var;
            var--;
            Rekurzija(var);
            return faktorijela;
        }
    return faktorijela;
    }

    public static void main (String[] args){
        Integer var = 5;
        faktorijela = Rekurzija (var);
        System.out.println(faktorijela);
    }
}
