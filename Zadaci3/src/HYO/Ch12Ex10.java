package HYO;

import java.util.EmptyStackException;

public class Ch12Ex10 {
    public void f(){
        try{
            g();
        }catch (Exception e){
            System.err.println("greska "+e);
            throw new EmptyStackException();
        }
        throw new NullPointerException();
    }
    public void g(){
        throw new IndexOutOfBoundsException();
    }
    public static void main(String[] args){
        Ch12Ex10 ex = new Ch12Ex10();
        ex.f();
    }
}
