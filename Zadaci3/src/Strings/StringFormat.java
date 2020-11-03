package Strings;

import org.w3c.dom.ls.LSOutput;

public class StringFormat {
    int num = 10;
    long numLong = 10;
    float numFloat = 10.0f;
    double numDouble = 10.0;
    @Override
    public String toString() {
        System.out.println(String.format("%d, %d, %f,%f",num, numLong,numFloat, numDouble));
        return "";
    }

    public static void main(String[] args) {
    StringFormat ex = new StringFormat();
    ex.toString();

    }
}
