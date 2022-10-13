class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        HashMap<Character, Integer> lastIndex=new HashMap<>();
        int maxLen=0;
        int len=0;
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(lastIndex.containsKey(c)){
                if(lastIndex.get(c)<i-len){
                    len++;
                    
                }else{
                    maxLen=Math.max(len,maxLen);
                    len=i-lastIndex.get(c);
                    
                }
                
                
            }else{
                len++;
                
            }
            lastIndex.put(c,i);
        }
        return Math.max(len,maxLen);
        
    }
}