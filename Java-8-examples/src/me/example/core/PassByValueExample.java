package me.example.core;

import java.net.Inet4Address;
import java.util.Iterator;
import java.util.TreeSet;

class Testing {
   private int a = 0;
    private Integer aObject = 0;

    public void setA(int a) {
        this.a = a;
    }

    public  void setaObject(int a) {
        this.aObject = a;
    }

    public Integer getaObject() {
        return this.aObject;
    }

    public int getA() {
        return this.a;
    }
}


//amazonid 23280666269208
//
//amcat id 23280666269208
public class PassByValueExample {

    public static void main(String args[]) {
        PassByValueExample passByValueExample = new PassByValueExample();
        Testing test = new Testing();
        System.out.println(passByValueExample.getTesting(test).getaObject());

        TreeSet<Integer> sets = new TreeSet<>();

        sets.iterator();

        sets.parallelStream().forEach(x -> System.out.println(x));

      //  YO+=2;
    }

    public Testing getTesting(Testing testing) {
        Testing a2 = new Testing();
        a2.setaObject(101);
        a2.setA(10);
        return a2;
    }

}
