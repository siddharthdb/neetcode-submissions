class MinStack {

    List<Integer> stack;
    List<Integer> minStack;

    public MinStack() {
        stack = new ArrayList();
        minStack = new ArrayList();
    }
    
    public void push(int val) {
        this.stack.add(val);

        if (this.minStack.size() == 0) {
            this.minStack.add(val);
        } else {
            var minTop = this.minStack.get(this.minStack.size() - 1);
            if (minTop > val)
                this.minStack.add(val);
            else
                this.minStack.add(minTop);
        }
    }
    
    public void pop() {
        this.stack.remove(this.stack.size() - 1);
        this.minStack.remove(this.minStack.size() - 1);
    }
    
    public int top() {
        return this.stack.get(this.stack.size() - 1);
    }
    
    public int getMin() {        
        return this.minStack.get(this.minStack.size() - 1);
    }
}
