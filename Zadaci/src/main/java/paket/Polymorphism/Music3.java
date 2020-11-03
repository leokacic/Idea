package paket.Polymorphism;

import java.util.Random;

class Instrument {
    String name;
    void play (Note n){
        System.out.println("Instrument.play()" + n);
    }
    public String toString(){

        return("My name is: "+name);
    }
    void adjust(){
        System.out.println("adjusting Instrument()" );
    }

    void clearSpit(){

    }
}

class Wind extends Instrument {
    void play (Note n){
        System.out.println("Wind.play()" + n);
    }
    Wind(){
        name = "Wind";
    }
    void adjust(){
        System.out.println("adjusting Wind()" );
    }
}

class Percussion extends Instrument {
    Percussion(){
        name = "percussion";
    }
    void play (Note n){
        System.out.println("Percussion.play()" + n);
    }
    String what(){
        return "Percussion";
    }
    void adjust(){
        System.out.println("adjusting Percussion()" );
    }
}

class Brass extends Wind {
    Brass(){
        name = "Brass";
    }
    void play (Note n){
        System.out.println("Brass.play()" + n);
    }
    void adjust(){
        System.out.println("adjusting Brass()" );
    }
}

class RandomInstrumentGenerator{
    Wind w = new Wind();
    Brass b = new Brass();
    Percussion p = new Percussion();

    public Instrument[] generate(){
        Instrument[] listOfInstruments= new Instrument[10];
        Random rand = new Random(47);
        for(int i=0; i<10;i++){
            switch(rand.nextInt(3)){
                case 0:
                    listOfInstruments[i]= new Wind();
                    break;
                case 1:
                    listOfInstruments[i]= new Brass();
                    break;
                case 2:
                    listOfInstruments[i]= new Percussion();
                    break;
            }
        }


        return listOfInstruments;
    }
}

public class Music3 {
    public static void tune (Instrument i){
        i.play(Note.C_SHARP);
    }

    public static void tuneAll(Instrument[] e){
        for(Instrument i : e){
            tune(i);
        }
    }
    public static void main(String[] args){
        Instrument[] lista;
        RandomInstrumentGenerator gen = new  RandomInstrumentGenerator();
        lista = gen.generate();
        for(int i =0;i<lista.length;i++){
            System.out.println(lista[i]
            );
        }
        Instrument[] orchestra ={
                new Wind(),
                new Brass(),
                new Percussion()
        };
        tuneAll(orchestra);
    }
}
