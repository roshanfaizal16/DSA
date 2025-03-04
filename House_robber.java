public class House_robber {
   public static void main(String[] args) {
       House_robber m = new House_robber();
        int[] nums = {9,5,6,3,7};
        System.out.print(m.rob(nums));
   }
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        if(n==1){
            dp[0] = nums[0];
            return dp[0];
        }
        if(n==2){
            dp[1] = Math.max(nums[0],nums[1]);
            return dp[1];
        }
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0],nums[1]);
        for (int i = 2;i<n;i++){
            dp[i] =Math.max(dp[i-1],nums[i]+dp[i-2]);
        }
        return dp[n-1];
    }
}

