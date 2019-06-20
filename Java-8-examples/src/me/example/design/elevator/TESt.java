package me.example.design.elevator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TESt {

    public List<Integer> cellCompete(int[] states, int days)
    {
        // WRITE YOUR CODE HERE

        List<Integer> states1 = new ArrayList<>(states.length);
        for (int k = 0; k < states.length;k++) {
            states1.add(Integer.valueOf(states[k]));
        }

        List<Integer> states2 = new ArrayList<Integer>(states.length);


        while(days>0) {

            for(int i = 0; i < states1.size(); i++) {
                System.out.println("s2 size:" + states2.size());
                System.out.println("s1 size:" + states1.size());
                states2.add(i, states1.get(i));
                if(i == 0) {
                    if(0 != states1.get(i+1)) {
                        states2.add(i, 1);
                    } else {
                        states2.add(i, 0);
                    }
                } else if(i == states1.size() - 1){
                    if(0 != states1.get(i-1)) {
                        states2.add(i, 1);
                    } else {
                        states2.add(i, 0);
                    }
                } else {
                    if (states1.get(i-1) != states1.get(i+1)) {
                        states2.add(i, 1);
                    } else {
                        states2.add(i, 0);
                    }
                }
            }
            days--;
            states1 = states2;
            states2 = new ArrayList(states.length);
        }
        return states1;
    }
}
