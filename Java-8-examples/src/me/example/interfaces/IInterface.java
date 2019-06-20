package me.example.interfaces;

public interface IInterface {

   default void printStuff() {
        System.out.print("I am in Interface");
    }

    static void printStaticStuff() {
        System.out.print("I am in Static method of Interface");
    }

}
