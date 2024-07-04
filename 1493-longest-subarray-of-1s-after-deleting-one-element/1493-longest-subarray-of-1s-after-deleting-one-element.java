class Solution {
    public int longestSubarray(int[] nums) {
        int i = 0;
        int j = 1;
        int count = 1;
        boolean flag = false;
        while(j<nums.length){   
            if(nums[i] != 1 ){
                i++;
                j++;
                if(j == nums.length-1){
                    return 0;
                }
            }
            else if(nums[i] == nums[j]){
                j++;
                count++;
               
            }
            else if(nums[i] != nums[j]  && nums[j+1] == 1){
                if(flag == false){
                    flag = true;
                    j++;
                }else{
                    return count;
                }
                continue;
            }else{
                count = 1;
                i = j+1;
                j = i+1;
                
            }
        }
        if(count == nums.length){
            count--;
        }
        return count;
    }
}