class Solution {
    public int lengthOfLongestSubstring(String s) {
    int maxLength = 0;   
    Set<Character> set = new HashSet<>();
    if(s.contains(" ")){
                maxLength++;
            }
    for(int i=0; i<s.length()-1; i++){
        set.add(s.charAt(i));
        int j = i+1;
        
        while(j < s.length()){
            
            if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                maxLength = Math.max(maxLength, set.size());
            }else{
                maxLength = Math.max(maxLength, set.size());
                set.clear();
                break;
            }
            j++;
        }
    }
    return maxLength;
       
    }
}