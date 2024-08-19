class Solution {
    public boolean check(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        int initIndex =0;
        for(int i = 0 , j = i+1; i < nums.length-1; i++){
            if(nums[i]>nums[j]){
                initIndex = j;
            }else{
                j++;
            }
        }

        for(int i = initIndex; i<nums.length; i++){
            arr.add(nums[i]);
        }

        for(int i = 0 ; i<initIndex; i++){
            arr.add(nums[i]);
        }
        
        for(int i = 0 , j = i+1; i < arr.size()-1; i++){
            if(arr.get(i)>arr.get(j)){
                return false;
            }else{
                j++;
            }
        }
        return true;
    }
}