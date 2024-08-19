class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i< str.length(); i++){
            if(str.charAt(i)>= 97 && str.charAt(i)<= 122 || str.charAt(i)>=48 && str.charAt(i)<= 57){
                sb.append(str.charAt(i));
            }
        }
        s = sb.toString();
        System.out.print(s);
        int i = 0;
        int j = s.length()-1;
        while(i<j){
            if(s.charAt(i) != s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
        
    }
}