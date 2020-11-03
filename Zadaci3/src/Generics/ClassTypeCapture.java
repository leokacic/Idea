package Generics;

import java.util.Map;

class Building{}
class House extends Building{}
public class ClassTypeCapture<T> {
    Class<T> kind;
    Map<String, Class<?>> map;
    public void addType(String typename, Class<?> kind){
        map.put(typename,kind);
    }

    public void createNew(String typename){
        kind.cast("typename"+"class");
        map.put(typename,kind);
    }

    public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }
    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }
    public static void main(String[] args) {
        ClassTypeCapture<Building> ctt1 =
                new ClassTypeCapture<Building>(Building.class);
        ctt1.addType("House",House.class);
        System.out.println(ctt1);
        System.out.println(ctt1.f(new Building()));
        System.out.println(ctt1.f(new House()));
        ClassTypeCapture<House> ctt2 =
                new ClassTypeCapture<House>(House.class);
        System.out.println(ctt2.f(new Building()));
        System.out.println(ctt2.f(new House()));
    }
}