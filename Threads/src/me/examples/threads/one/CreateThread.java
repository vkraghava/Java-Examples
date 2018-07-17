package me.examples.threads.one;

public class CreateThread {

    public static  void main (String args[]) {

        ChildThread t1 = new ChildThread();

        t1.start();
        for (int i = 0 ;i < 10; i++) {
            System.out.println("Main Thread");
        }
    }

}
