package Intro;

/**
 *Ovo je javadoc
 * @author kacicleo
 *
 * <ol>
 * <li> one
 * <li> two
 * <li> three </li>
 * </ol>
 *
 */

public class Autoboxing {
    public static void main(String[ ] args){
        Character c = 'x';
        char ch = c;
        System.out.println("Character: " + c + " char: " + ch);
        Integer i = 2;
        int in = i;
        System.out.println("Integer: " + i + " int: " + in);
        Boolean b = true;
        boolean bo = b;
        System.out.println("Boolean: " + b + " boolean: " + bo);
        // printanje char u binarni tip podatka
        Integer a = (int)ch;
        System.out.println(Integer.toBinaryString(a));

    }
}

