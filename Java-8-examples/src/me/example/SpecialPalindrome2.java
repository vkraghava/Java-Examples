package me.example;

public class SpecialPalindrome2 {

    public static void main(String args[]) {

        String s = SpecialPalindrome2.getS();

       // char[] characters = s.toCharArray();

        long result = substrCount(s.length()+1, s);
        System.out.println(result);


    }


        static long substrCount(int n, String s) {
            long count = 0;
            for (int i = 0; i < n; i++) {
                char ch = s.charAt(i);
                int j = i + 1;
                while (j < n && s.charAt(j) == ch) { // loop until you identify a different character or end of string
                    count++;
                    j++;
                }
                if (j < n) { // means we did not reach at the end and encountered a different character
                    int mid = j; // index j was the mismatch
                    j++;
                    int equals = mid - i; // number of equal characters(+1) from i
                    while (j < n && j <= mid + equals && s.charAt(j) == ch) { // loop till equals till characters match
                        j++;
                    }
                    if (j - 1 - mid == mid - i) {
                        count++;
                    }
                }
            }
            return count + n;

        }


    static String getS() {
        return "abcbaba";

        //AAAAbbbb A A A A b b b b AA AA AA AAA AAA AAAA bb bb bb bbb bbb bbbb 20
        // asasd 7
        // aaaa 10
        // abcbaba a b c b a b a bcb bab aba
    }

}
