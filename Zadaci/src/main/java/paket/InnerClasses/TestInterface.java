package paket.InnerClasses;

import paket.InnerClasses.TestPackage.Interface;

public class TestInterface {
    protected  class TestInnerInterface implements Interface{
        public void print(){
            System.out.println("Intro.Hello from the inner class");
        }
    }
}
