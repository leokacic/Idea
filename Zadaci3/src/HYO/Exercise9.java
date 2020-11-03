package HYO;

import org.w3c.dom.ls.LSOutput;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

public class Exercise9 {

    public static Logger logger =java.util.logging.Logger.getLogger("Logging");

    public static void loggingException(Exception e)
    {
        StringWriter trace = new StringWriter();
        e.printStackTrace(new PrintWriter(trace));
        logger.severe(trace.toString());
    }

    public static class MyException1 extends Exception{
        MyException1(){
            System.out.println("MyException1");
        }
    }
    public static class MyException2 extends Exception{
        MyException2(){
            System.out.println("MyException2");
        }
    }
    public static class MyException3 extends Exception{
        MyException3(){
            System.out.println("MyException3");
        }
    }

    public static void main(String[] args){
        int i = 1;
        while(i<4){
            try{
                switch (i) {
                    case 1 -> throw new MyException1();
                    case 2 -> throw new MyException2();
                    case 3 -> throw new MyException3();
                }
            } catch (Exception e) {
                System.out.println("MyException "+e);
                loggingException(e);
            }
            i++;
        }
    }
}
