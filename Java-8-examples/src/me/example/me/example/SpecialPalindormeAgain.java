package me.example.me.example;

public class SpecialPalindormeAgain {

    public static void main(String args[]) {

        String s = "abcbaba";


       long palindromeCount = substrCount(s);

        System.out.println(palindromeCount);
    }

    // Complete the substrCount function below.
    static long substrCount( String s) {
        int palidromeCount =0;
        for (int i =0;i < s.length();i++) {
            int j =i;
            while(j <= s.length()) {
                String s1 = s.substring(i,j);
                System.out.println("s1 :" + s1);
                if(checkPalindrome(s1)) {
                    palidromeCount++;
                }
                j++;
            }

        }
        return palidromeCount;

    }
    static boolean checkPalindrome(String s) {
        if(s.length()%2 == 0) {
            System.out.print(" first : "+s);
            return checkForSameElements(s);
        } else {
            if(s.length() > 2){
                int middle = (s.length())/2;

                System.out.println(" left : 0 and middle -1 is "+ (middle-1) +" string " +s.substring(0, middle));
                boolean left = checkForSameElements(s.substring(0, middle-1));
                System.out.println(" right :  middle +1 is "+ (middle+1) +"lenght - 1"+(s.length()-1)+" string " +s.substring(middle+1, s.length()));
                boolean right = checkForSameElements(s.substring(middle  +1, s.length() -1));
                if(left && right && (s.substring(0, middle).equals(s.substring(middle +1, s.length())))) {
                    System.out.println("return true for odd");
                    return true;
                }
            }
        }
        return false;
    }

    static boolean checkForSameElements(String s) {
        char[] sc = s.toCharArray();
        boolean isTrue = true;
        if(sc.length > 1) {
            char c = sc[0];
            System.out.println("first character"+ c);
            for(int i = 0; i < sc.length; i++) {
                System.out.println(i+"th character : "+ sc[i]);
                if(sc[i] != c) { isTrue = false; break;}
            }
        }
        System.out.println("return "+ isTrue+" for even");
        return isTrue;
    }

}
