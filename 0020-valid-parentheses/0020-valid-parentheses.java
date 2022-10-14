class Solution {
    public boolean isValid(String s) {
        
        HashSet<Character> set=new HashSet<>();
        Stack<Character> stack=new Stack<>();
        set.add('(');
        set.add('{');
        set.add('[');
        
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(set.contains(c)){
                stack.push(c);
                
            }else{
                if(stack.isEmpty()) return false;
                if(c==')'){
                    if(stack.peek()=='(') stack.pop();
                    else return false;
                    
                }
                if(c=='}'){
                    if(stack.peek()=='{') stack.pop();
                    else return false;
                    
                }
                if(c==']'){
                    if(stack.peek()=='[') stack.pop();
                    else return false;
                    
                }
                
            }
            
            
        }
        
        if(stack.size()>0) return false;
        return true;
        
    }
}