class StockSpanner {
    private Stack<int[]>stack;
    private int index;

    public StockSpanner() {
        stack=new Stack<>();
        index=-1;
    }
    
    public int next(int price) {
        index++;
        while(!stack.isEmpty() && stack.peek()[0]<=price){
            stack.pop();
        }
        int span;
        if(stack.isEmpty()){
            span=index+1;
        }else{
            span=index-stack.peek()[1];
        }
        stack.push(new int[]{price,index});
        return span;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */