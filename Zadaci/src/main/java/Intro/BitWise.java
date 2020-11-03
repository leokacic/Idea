package Intro;

public class BitWise {
    static Integer a = 0b1010101010;
    static Integer b = 0b0101010101;
    static Integer c = 0b111;

    public static void main (String[] args){
        System.out.println(Integer.toBinaryString(a&b));
        System.out.println(Integer.toBinaryString(a^b));
        System.out.println(Integer.toBinaryString(a|b));
        System.out.println(Integer.toBinaryString(a&=b));

        System.out.println(Integer.toBinaryString(c));
        System.out.println(Integer.toBinaryString(c>>1));
        System.out.println(Integer.toBinaryString(c>>>2));
        System.out.println(Integer.toBinaryString(c>>>1));
        System.out.println(Integer.toBinaryString(c>>>1));
        System.out.println(Integer.toBinaryString(c>>>1));
        System.out.println(Integer.toBinaryString(c>>>1));

    }

}
