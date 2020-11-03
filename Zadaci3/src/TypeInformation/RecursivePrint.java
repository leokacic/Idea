package TypeInformation;

class A {

}

class B extends A {

}

public class RecursivePrint {


    static public void getHierarchy(Class c){
        Class l = c.getSuperclass();
        if(l!=null)
        {System.out.println( c.getSuperclass());
            getHierarchy(c);}
        System.out.println( c.getSuperclass());
        }



    public static void main(String[] args) throws ClassNotFoundException {
    getHierarchy(Class.forName("TypeInformation.A"));
    }

}
