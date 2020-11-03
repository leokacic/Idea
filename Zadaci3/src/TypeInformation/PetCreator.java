package TypeInformation;

import java.util.ArrayList;
import java.util.List;

interface Factory<T>{
    T create();
}

interface Pet{
    public String toString();

}

class Cat implements Pet {
    public String toString(){
        System.out.println("I am a cat");
        return "";
    }
}

class Mouse implements Pet{
    public static class Factory implements TypeInformation.Factory{
        public Mouse create(){
            return new Mouse();
        }
    }

    public String toString(){
        System.out.println("I am a mouse");
        return "";
    }
}

class Dog implements Pet{
    public String toString(){
        System.out.println("I am a dog");
        return "";
    }
}

public class PetCreator {
    static List<Factory<? extends Pet>> petFactories = new ArrayList<Factory<? extends  Pet>>();
    static{
        petFactories.add(new Mouse.Factory());
    }
}
