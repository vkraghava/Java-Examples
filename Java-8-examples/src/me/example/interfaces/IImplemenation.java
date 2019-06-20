package me.example.interfaces;

public class IImplemenation extends ParentClass implements IInterface, Interface2 {

    @Override
    public void printStuff() {
        IInterface.printStaticStuff();
    }
   // @Override
    public void display() {
        System.out.print("Child Class");
    }

    public static void main(String args[]) {
       /* IInterface i2 = new IImplemenation();
        i2.printStuff();*/

      /*  ParentClass pc = new IImplemenation();
        pc.display();*/
    }

}
