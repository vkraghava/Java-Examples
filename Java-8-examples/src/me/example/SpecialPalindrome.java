package me.example;

public class SpecialPalindrome {

    public static void main(String args[]) {

        String s = SpecialPalindrome.getS();

        char[] characters = s.toCharArray();

        int result = findCount(characters);
        System.out.println(result);


    }

    static int findCount(char[] arrayString) {
        int ans = 0;

        for(int i = 0; i < arrayString.length; i++) {
            char c = ' ';
            int counter = 0;
            for(int j = 0; (j+i) < arrayString.length && i-j >=0;j++ ) {
                if(arrayString[i+j] != arrayString[i-j]) {
                    break;
                } else {
                    if(j == 0) {
                        ans++;
                    }
                    if(j == 1) {
                        c = arrayString[i+j];
                        counter++;
                    }

                    else if(c == arrayString[i+j]){
                        counter++;
                    }
                }
            }
            if(counter >= 1) {
                ans++;
            }
        }
        for(int i = 0; i < arrayString.length; i++) {
            for(int j = 0; (j+i+1) < arrayString.length && i-j >=0;j++ ) {
                if(arrayString[i+j+1] != arrayString[i-j]) {
                    break;
                } else {
                    ans++;
                }
            }
        }


        return ans;
    }

    static String getS() {
        return "abcbaba";

        //AAAAbbbb A A A A b b b b AA AA AA AAA AAA AAAA bb bb bb bbb bbb bbbb 20
        // asasd 7
        // aaaa 10
        // abcbaba a b c b a b a bcb bab aba
    }

}
