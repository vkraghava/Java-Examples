package me.example;

import java.util.ArrayList;
import java.util.Iterator;

public class specialPalindrom3 {
    public static void main(String args[]) {

        String s = "aabaa";

        // char[] characters = s.toCharArray();

        long result = substrCount(s.length(), s);
        System.out.println(result);


    }


    static class Point {
        public char key;
        public long count;

        public Point(char x, long y) {
            key = x;
            count = y;
        }
    }

    // Complete the substrCount function below.
    static long substrCount(int n, String s) {
        s = s + " ";
        ArrayList<Point> l = new ArrayList<Point>();
        long count = 1;
        char ch = s.charAt(0);
        for(int i = 1; i <= n ; i++) {
            if(ch == s.charAt(i)) {
                count++;
                System.out.println("count" + count);
            }
            else {
                System.out.println("else ch :"+ch +" count : " + count);
                l.add(new Point(ch, count));
                count = 1;
                ch = s.charAt(i);
            }
        }
        count = 0;
        if(l.size() >= 3) {
            Iterator<Point> itr = l.iterator();
            Point prev, curr, next;
            curr = (Point)itr.next();
            next = (Point)itr.next();
            count = (curr.count * (curr.count + 1)) / 2;
            System.out.println("curr: "+ curr.key + "next : "+ next.key + "count : " +count);
            for(int i = 1; i < l.size() - 1; i++) {
                prev = curr;
                curr = next;
                next = itr.next();
                count += (curr.count * (curr.count + 1)) / 2;
                System.out.println("in if for loop curr: "+ curr.key + "next : "+ next.key + "count : " +count);
                if(prev.key == next.key && curr.count == 1)
                    count += prev.count > next.count ? next.count : prev.count;
            }

            count += (next.count * (next.count + 1)) / 2;
            System.out.println( "if end count : " +count);
        } else {
            for(Point curr:l){
                count += (curr.count * (curr.count + 1)) / 2;
                System.out.println( "else loop count : " +count);
            }
        }
        return count;
    }

}
