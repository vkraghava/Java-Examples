package me.example.me.example;

import java.util.ArrayList;
import java.util.Iterator;

public class SpecialPalindromeAgain2 {

    public static void main(String args[]) {

        String s = "abcbaba";


        long palindromeCount = substrCount(s.length(),s);

        System.out.println(palindromeCount);
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
            if(ch == s.charAt(i))
                count++;
            else {
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
            for(int i = 1; i < l.size() - 1; i++) {
                prev = curr;
                curr = next;
                next = itr.next();
                count += (curr.count * (curr.count + 1)) / 2;
                if(prev.key == next.key && curr.count == 1)
                    count += prev.count > next.count ? next.count : prev.count;
            }
            count += (next.count * (next.count + 1)) / 2;
        } else {
            for(Point curr:l){
                count += (curr.count * (curr.count + 1)) / 2;
            }
        }
        return count;
    }
}
