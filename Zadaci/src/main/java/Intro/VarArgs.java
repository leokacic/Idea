package Intro;

public class VarArgs {

    public static void VarArgMethod(String... args){
        for(String arg : args){
            System.out.println(arg);
        }
    }
    public static void main (String [] args){
        String string1 = "Jedan";
        String string2 = "Dva";
        String string3 = "Tri";
        VarArgMethod(string1,string2,string3);
        String[] stringArray = { "One","Two","Three"};
        VarArgMethod(stringArray);
        for(String a : args){
            System.out.println(a);
        }
    }
}
