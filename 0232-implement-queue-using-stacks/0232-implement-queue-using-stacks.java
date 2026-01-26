class MyQueue {
    Stack<Integer>q1;
    Stack<Integer>q2;

    public MyQueue() {
        q1=new Stack<>();
        q2=new Stack<>();

    }
    
    public void push(int x) {
        q1.push(x);
    }
    
    public int pop() {
        moveIfNeeded();
        return q2.pop();
    }
    
    public int peek() {
        moveIfNeeded();
       return q2.peek();
    }
    
    public boolean empty() {
        return q1.isEmpty()&&q2.isEmpty();
    }
    private void moveIfNeeded(){
        if(q2.isEmpty()){
           while(!q1.isEmpty()){
            q2.push(q1.pop());
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