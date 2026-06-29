class MyStack {
    Queue<Integer> first;
    Queue<Integer> sec;
    public MyStack() {
        first = new LinkedList<>();
        sec = new LinkedList<>();
    }
    
    public void push(int x) {
        if(first.isEmpty() && sec.isEmpty()){
            first.offer(x);
        }else if(first.isEmpty()){
            sec.offer(x);
        }else{
            first.offer(x);
        }
    }
    
    public int pop() {
        if(first.isEmpty()){
            while(sec.size()>1){
                first.offer(sec.poll());
            }
           return sec.poll();
        }else{
            while(first.size()>1){
                sec.offer(first.poll());
            }
           return first.poll();
        }
    }
    
    public int top() {
         if(first.isEmpty()){
            while(sec.size()>1){
                first.offer(sec.poll());
            }
            first.offer(sec.peek());
           return sec.poll();
        }else{
            while(first.size()>1){
                sec.offer(first.poll());
            }
            sec.offer(first.peek());
           return first.poll();
        }
    }
    
    public boolean empty() {
        if(first.isEmpty() && sec.isEmpty()) return true;
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */