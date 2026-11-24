class Solution {
    public int largestSumAfterKNegations(int[] nums, int k) {
        int sum=0;
        for(int i=0; i<k; i++){
            int min=Integer.MAX_VALUE, index=0;
            for(int j=0; j<nums.length; j++){
                if(nums[j]<min){
                    min=nums[j];
                    index=j;
                }
            }
            nums[index]=-nums[index];
        }
        for(int num:nums) sum=sum+num;

        return sum;
    }
}