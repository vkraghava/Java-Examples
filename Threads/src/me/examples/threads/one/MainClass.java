package me.examples.threads.one;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public final static int MAX_THREAD = 20;
    public MainClass() {
        // TODO Auto-generated constructor stub
    }

    public static void main(String[] args) {

        List<Singleton> singletonList = new MainClass().createSingletonObjects();
        singletonList = Collections.synchronizedList(singletonList);

        int index = 0;
        for (int i = 0; i < MAX_THREAD; i++) {

            Thread thread1 = new Thread(new MyThread(singletonList,index), "Thread"+i);
            thread1.start();
            index++;
            if (index == singletonList.size()) {
                index = 0;
            }

        }

    }

    public synchronized List<Singleton> createSingletonObjects(){
        List<Singleton> listSingleton = new ArrayList<Singleton>();
        listSingleton.add(MySingleton1.getInstance());
        listSingleton.add(MySingleton2.getInstance());
        listSingleton.add(MySingleton3.getInstance());
        listSingleton.add(MySingleton4.getInstance());
        listSingleton.add(MySingleton5.getInstance());

        return listSingleton;

    }

}


public class MySingleton1 extends Singleton{
    private static Singleton mySingleton;
    private MySingleton1() {
        super();
        // TODO Auto-generated constructor stub
    }

    public static Singleton getInstance() {
        if (mySingleton == null) {
            mySingleton = new MySingleton1();
            return mySingleton;
        }
        return mySingleton;
    }


    public class MySingleton2 extends Singleton{
        private Singleton mySingleton;
        private MySingleton2() {
            super();
            // TODO Auto-generated constructor stub
        }

        public Singleton getInstance() {
            if (mySingleton == null) {
                mySingleton = new MySingleton2();
                return mySingleton;
            }
            return mySingleton;
        }







    }


    static class MySingleton3 extends Singleton{
        private static Singleton mySingleton;
        private MySingleton3() {
            super();
            // TODO Auto-generated constructor stub
        }

        public static Singleton getInstance() {
            if (mySingleton == null) {
                mySingleton = new MySingleton3();
                return mySingleton;
            }
            return mySingleton;
        }







    }


     class MySingleton4 extends Singleton{
        private static Singleton mySingleton;
        private MySingleton4() {
            super();
            // TODO Auto-generated constructor stub
        }

        public static Singleton getInstance() {
            if (mySingleton == null) {
                mySingleton = new MySingleton4();
                return mySingleton;
            }
            return mySingleton;
        }







    }


     class MySingleton5 extends Singleton{
        private static Singleton mySingleton;
        private MySingleton5() {
            super();
            // TODO Auto-generated constructor stub
        }

         static Singleton getInstance() {
            if (mySingleton == null) {
                mySingleton = new MySingleton5();
                return mySingleton;
            }
            return mySingleton;
        }







    }