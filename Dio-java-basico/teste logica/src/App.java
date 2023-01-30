public class App {
    public static void main(String[] args) throws Exception {

        LongestIncreasingSequence(3,10,2,11);
    }

    private static void LongestIncreasingSequence(int i, int j, int k, int l) {
    }

    public static int LongestIncreasingSequence(int[] arr) {
        int[] dp = new int[arr.length];
        int maxLength = 0;

        for (int i = 0; i < arr.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (arr[i] > arr[j] && dp[i] <= dp[j]) {
                    dp[i] = dp[j] + 1;
                    maxLength = Math.max(maxLength, dp[i]);
                }
            }
        }
        return maxLength;
    }
}
