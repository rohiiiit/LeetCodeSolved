class Solution {
    public int longestSubarray(int[] nums) {
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        for(int i = 1; i < nums.length; i++ ){
            if(nums[i-1] == 1){
               left[i] = left[i-1]+1; 
            }
        }

        for(int i = nums.length-2; i >= 0 ; i-- ){
            if(nums[i+1] == 1){
                right[i] = right[i+1] + 1;
            }
        }
        int res = 0;
        for(int i = 0; i< nums.length; i++){
            res = Math.max(res, left[i]+right[i]);
        }

        return res;
    }
}