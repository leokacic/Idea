package Intro;

class Dog {
    public String name;
    public String says;
    void metoda1(){
        System.out.println("Metoda1");
        this.metoda2();
        metoda2();
    };
    void metoda2(){
        int a;
        System.out.println("Metoda2");
    };

    Dog(){
        this(2);
        System.out.println("prvi konst");


    }
    Dog(int a){
        System.out.println("drugi konst");
    }


}

public class Dogs{


    public void obrada(String one, String two){

    }

    public static void main(String args []){
        Dog d1 = new Dog();
        Dog d2 = new Dog();
        d1.name= "spot";
        d1.says= "Ruff!";
        d2.name = "scruffy";
        d2.says = "Wurf!";

        Dog d3= new Dog();
        d3 = d1;
        if(d1.name == d3.name)
        {
            System.out.println("Isti su");
        }else{
            System.out.println("Nisu isti");
        }

        if(d1.name.equals(d3.name))
        {
            System.out.println("Isti su");
        }else{
            System.out.println("Nisu isti");
        }

//        d1.bark(2,'a');
//        d1.bark(3,'d');
//        d1.bark('a',2);
//        d2.bark('d',5);

        d1.metoda1();
        new Dog();

        System.out.println(d1.name + d1.says + " " + d2.name + d2.says);
    }



}
