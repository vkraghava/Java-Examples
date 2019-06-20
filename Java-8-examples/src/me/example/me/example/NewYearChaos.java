package me.example.me.example;

public class NewYearChaos {

    public static void main(String args[]) {
        int[] q = {2,1,5,3,4};
        compute(q);
    }

    public static void compute(int[] q) {

        int bribe =0;
        boolean chaotic = false;
        for(int i = 0; i < q.length; i++) {
            System.out.println("i:" + i);
            System.out.println("q["+i+"]: " + q[i]);
            System.out.println(" i+1: " + i+1);
            if(q[i]-(i+1) > 2) {
                chaotic = true;
                break;
            }
            for (int j = Math.max(0, q[i]-1-1); j < i; j++) {
                System.out.println("j: " + j);
                System.out.println("q["+j+"]: " + q[j]);
                System.out.println("q["+i+"]: " + q[i]);
                if (q[j] > q[i])
                    bribe++;
            }
        }
        if(chaotic) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(bribe);
        }

    }


}
