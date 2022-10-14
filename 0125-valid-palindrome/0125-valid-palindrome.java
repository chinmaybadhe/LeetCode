class Solution {
    public boolean isPalindrome(String s) {
        
        int left=0;
        int right=s.length()-1;
        
        
        while(left<right){
            // System.out.println(left+" "+right);
            char leftChar=s.charAt(left);
            char rightChar=s.charAt(right);
            
            if(((int)leftChar<97 && ((int)leftChar<48 || (int)leftChar>57))) leftChar=(char)((int)leftChar+32);
            if(((int)rightChar<97 && ((int)rightChar<48 || (int)rightChar>57))) rightChar=(char)((int)rightChar+32);
            // System.out.println(leftChar+" "+rightChar);
            
            if((leftChar<97 && (leftChar<48 || leftChar>57)) || leftChar>122){
                left++;
                continue;
                
            }
            if((rightChar<97 && (rightChar<48 || rightChar>57)) || rightChar>122){
                right--;
                continue;
                
            }
            if(leftChar==rightChar){
                left++;
                right--;
                
            }else{
                return false;
                
            }
            
        }
        return true;
        
    }
}