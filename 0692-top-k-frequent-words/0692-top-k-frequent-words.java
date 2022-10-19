class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        
        HashMap<String, Integer> wordToFreq=new HashMap<>();
        HashMap<Integer, List<String>> freqToList=new HashMap<>();
        List<String> ans=new ArrayList<>();
        int flag=0;
        
        for(String word: words){
            wordToFreq.put(word, wordToFreq.getOrDefault(word, 0)+1);
            
        }
        
        for(String word: wordToFreq.keySet()){
            if(freqToList.containsKey(wordToFreq.get(word))){
                freqToList.get(wordToFreq.get(word)).add(word);
                
            }else{
                ArrayList<String> li=new ArrayList<>();
                li.add(word);
                freqToList.put(wordToFreq.get(word),li);
            }
        }
        
        for(int i=words.length-1;i>=1;i--){
            if(freqToList.containsKey(i)){
                List<String> lis=freqToList.get(i);
                Collections.sort(lis);
                for(int j=0;j<freqToList.get(i).size();j++){
                    ans.add(lis.get(j));
                    if(ans.size()==k){
                        flag=1;
                        break;
                        
                    }
                    
                }
                if(flag==1)
                    break;
            }
            
            
        }
        
        // Collections.sort(ans);
        return ans;
    }
}