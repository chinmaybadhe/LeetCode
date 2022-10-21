class MyQueue {

    Stack<Integer> pushStack;
    Stack<Integer> pullStack;

    
    public MyQueue() {
        pushStack=new Stack<>();
        pullStack=new Stack<>();
        
    }
    
    public void push(int x) {
        if(pullStack.size()!=0){
            popAll(pullStack);
            
        }
        pushStack.push(x);
        
    }
    
    public int pop() {
        if(pushStack.size()!=0){
            popAll(pushStack);
            
        }
        return pullStack.pop();
        
    }
    
    public int peek() {
        if(pushStack.size()!=0){
            popAll(pushStack);
            
        }
        return pullStack.peek();
        
    }
    
    public boolean empty() {
        if(pushStack.size()==0 && pullStack.size()==0){
            return true;
            
        }
        return false;
        
    }
    
    private void popAll(Stack<Integer> stack){
        if(pushStack.size()!=0){
            while(!pushStack.isEmpty()){
                pullStack.push(pushStack.pop());
                
            }
            
        }else{
            while(!pullStack.isEmpty()){
                pushStack.push(pullStack.pop());
                
            }
            
        }
   
        
        
        
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */