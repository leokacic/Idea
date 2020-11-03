package Intro;

class Nizovi{
    Nizovi(String a){
        System.out.println(a);
    }
}


public class Arrays {

    public static void main(String [] args){
        String[] niz = {"Jedan", "Dva","Tri","Cetiri","Pet"};

        for(String a : niz){
            System.out.println(a);
        }
        Nizovi[] arrays = new Nizovi[10];
        System.out.println(arrays[1]);
    }
}
