package me.example.core;

import java.io.*;
        import java.util.*;

class Solution {

    /**
     * return the value that is x number of elements
     * from the end of the inputList
     **/
    public static Integer getXFromEnd(final Iterator<Integer> inputList, int x)
    {

        Integer[] lastElements = new Integer[x+1];

        int i = 0;



        while(inputList.hasNext()) {
            if(i < x) {
              //  System.out.println("i :"+ i);
                Integer element = inputList.next();
                if(inputList.hasNext()) {
                    lastElements[i] = element == null ? null : element.intValue();
                 //   System.out.println("Last element of i :" + lastElements[i]);
                    i++;
                }
            } else {
                i = 0;
            }
        }

        return lastElements[i];

        //TODO: code this method
       // throw new UnsupportedOperationException();
    }

     /**
      * return the value that is x number of elements
      * from the end of the inputList, ignoring null values
      **/
     public static Integer getXFromEndIgnoreNulls(final Iterator<Integer> inputList, int x)
     {
       //TODO: code this method
       throw new UnsupportedOperationException();
     }




    /***************************
     * CODE TEST AND VALIDATOR *
     ***************************/
    public static void validator(Integer expectedValue, Integer valueToTest)
    {
        String response = "  >>>> FAIL: expected " + expectedValue + ", not " + valueToTest;

        if ((expectedValue == null && valueToTest == null)
                || (expectedValue != null && expectedValue.equals(valueToTest)))
        {
            response = "  PASS";
        }

        System.out.println(response);
    }

    public static void main(String[] args) {
        System.out.println("***** BEGIN TEST *****");

        Integer[] input_array = {1, 34, 9, null, 41, 7, 23, 684, 72, 0, 36, null, 8, 236, 131};
        Iterator<Integer> input = Arrays.asList(input_array).iterator();

        System.out.println("Tests: 1 & 2");
        int c1_x = 6;
        Integer c1_expval = 72;
        Integer c1_expval_nn = 684;
       // input = Arrays.asList(input_array).iterator();
        validator(c1_expval, getXFromEnd(input, c1_x));
        input = Arrays.asList(input_array).iterator();
       //  validator(c1_expval_nn, getXFromEndIgnoreNulls(input, c1_x));

        System.out.println("Tests: 3 & 4");
        int c2_x = 3;
        Integer c2_expval = null;
        Integer c2_expval_nn = 36;
        input = Arrays.asList(input_array).iterator();
        validator(c2_expval, getXFromEnd(input, c2_x));
        input = Arrays.asList(input_array).iterator();
        // validator(c2_expval_nn, getXFromEndIgnoreNulls(input, c2_x));

        System.out.println("***** TEST COMPLETE *****");
    }
}
