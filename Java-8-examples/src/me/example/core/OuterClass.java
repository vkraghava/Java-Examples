package me.example.core;

public class OuterClass {

    String outerVariable = "Outer Public";

    public String getOuterVariable() {
        return outerVariable;
    }

    private class OuterInnerClass {
        String innerVariable = "Inner Private";

        private String getVaraible() {
            return innerVariable;
        }

    }

    public String getInnerVariable() {
        OuterInnerClass oic = new OuterClass.OuterInnerClass();
        return oic.getVaraible();
    }

    public static void main(String args[]) {
        OuterClass oc = new OuterClass();
        System.out.println(oc.getOuterVariable());
        System.out.println(oc.getInnerVariable());
    }
}
