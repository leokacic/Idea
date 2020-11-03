package Concurrency;

public class MyFirstThread2 extends Thread{
    public void run() {
        System.out.println("Inside run");
        go();
    }

    private void go(){
        System.out.println("inside go");
        more();
    }

    private void more(){
        System.out.println("inside more");
    }

    public static void main(String[] args) {
        Thread myThread = new MyFirstThread2();
        myThread.start();


        System.out.println("inside main");
    }
}
