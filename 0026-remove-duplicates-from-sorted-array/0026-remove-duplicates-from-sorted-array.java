class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 1;
        int i = 0;
        int j = 1;
        while(j<nums.length){
                if(nums[i] != nums[j]){
                    nums[i+1] = nums[j];
                    i = i+1;
                    count++;

                }else{
                    j++;
                }
            
              
        }
          return count; 
      
    }
}