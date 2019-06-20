package me.example.core;

public class CoinChange {
    public static void main(String args[]) {

        CoinChange.change(10, new int[]{1,2,5});
    }

    public static int change(int amount, int[] coins) {
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        for(int coin : coins) {
            System.out.println("new coin " + coin);
            for(int i = coin; i <= amount; i++) {
                dp[i] += dp[i - coin];
                System.out.print(dp[i] + " ");
            }
            System.out.print("\n");

        }
        System.out.println(dp[amount]);

        return dp[amount];
    }
}

/*



 */