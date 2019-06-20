package me.example.core;

public class SystemExitinStaticBlock {

    static {
        System.out.println("Inside block");
        System.exit(1);
    }

    public static void main(String args[]) {
        System.out.println("Inside Main");
    }
}
