class Solution {
    //RECURSION
    // static boolean solve(int index, int target, int[] nums) {
    //     // Base cases
    //     if(target==0) return true;
    //     if(index==nums.length) return false;

    //     boolean skip = solve(index+1,target,nums);              //dont pick the current element
    //     boolean select = false;
    //     if(nums[index]<=target) select=solve(index+1,target-nums[index],nums);
        
    //     return select||skip;
    // }
    // public boolean canPartition(int[] nums) {
    //     int sum=0;
    //     for(int num:nums)sum+=num;
    //     if(sum%2!=0) return false;
    //     return solve(0,sum/2,nums);
    // }


    //MEMOIZATION
        static boolean solve(int index, int target, int[] nums, int[][] dp) {
        // Base cases
        if(target==0) return true;
        if(index==nums.length) return false;

        if(dp[index][target]!=-1) return dp[index][target]==1;

        boolean skip = solve(index+1,target,nums, dp); //dont pick the current element
        boolean select = false;
        if(nums[index]<=target) select=solve(index+1,target-nums[index],nums,dp);
        
        dp[index][target]=(select||skip)? 1:0;

        return dp[index][target]==1;
    }
    public boolean canPartition(int[] nums) {
        int sum=0;
        for(int num:nums) sum+=num;

        int t=sum/2;
        int[][]dp=new int[nums.length][t+1];

        for(int[] row:dp) Arrays.fill(row,-1);

        if(sum%2!=0) return false;
        return solve(0,t,nums,dp);
    }
}