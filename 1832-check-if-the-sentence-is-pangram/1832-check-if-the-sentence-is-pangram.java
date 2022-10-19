class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int ch[]=new int[26];
        
        for(int i=0;i<sentence.length();i++){
            ch[sentence.charAt(i)-'a']++;
            
        }
        for(int i=0;i<26;i++){
            if(ch[i]==0) return false;
            
        }
        return true;
        
    }
}