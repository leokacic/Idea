package Concurrency;

import java.util.concurrent.TimeUnit;

public class MyFirstThread {
    public static void main(String[] args) throws InterruptedException {
        Task task = new Task();
        Thread thread = new Thread(task);
        thread.start();

//        thread.sleep(3000);
        TimeUnit.SECONDS.sleep(3);
        System.out.println("Inside main");
    }
}

class Task implements Runnable{

    @Override
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
}

