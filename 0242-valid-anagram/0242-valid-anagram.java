class Solution {
    public boolean isAnagram(String s, String t) {
        
        int[] string1=new int[26];
        int[] string2=new int[26];
        for(char i:s.toCharArray()){
            string1[i - 'a']++;
            
        }
        
        for(char i:t.toCharArray()){
            string2[i - 'a']++;
            
        }
        
        return Arrays.hashCode(string1)==Arrays.hashCode(string2);
        
    }
}