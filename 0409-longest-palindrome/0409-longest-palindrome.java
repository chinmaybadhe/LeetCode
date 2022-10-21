class Solution {
    String input="";
    public int longestPalindrome(String s) {

        int ch[]=new int[200];
        boolean oddPresent=false;
        
        for(int i=0;i<s.length();i++){
            ch[s.charAt(i)-'0']++;
            
        }
        
        int sum=0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]%2==0)sum+=ch[i];
            else{
                sum+=ch[i]-1;  
                oddPresent=true;
            } 
        }
        
        return oddPresent?sum+1:sum;
        
    }
}