package HYO;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.*;
import java.util.ArrayList;
import java.util.logging.*;

public class Exercise1 {

    public static Logger logger = Logger.getLogger("Logging Exceptions");
    static void logException(Exception e){
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static void f() {
        List<String> lista = new ArrayList<String>();
        String a = "a";
        String b = "b";
        lista.add(a);
        lista.add(b);
        lista.remove(10);
    }

    public static class MyException extends Exception{
        String str = "";
        public MyException(){}
        public MyException(String a){
            MyException ex = new MyException();
            ex.str = a;
            System.out.println(ex.str);
        }
    }

    public static void main(String[] args) throws MyException,IndexOutOfBoundsException{
        List<String> lista = new ArrayList<>();
        Exercise1 ex = null;
        int i = 0;
        while(i<20){
            try{
//                throw new MyException("HYO.Hello");
//            ex.toString();

                String a = "a";
                String b = "b";
                lista.add(a);
                lista.add(b);
                lista.remove(10);
                throw new NullPointerException();

            } catch (Exception e) {
                logException(e);
                System.err.println("Ovo je moj exception " + e);
            } finally {
                System.out.println("Zavrseno");
            }
            String b = "b";
            lista.add(b);
            i++;
        }


    }
}
