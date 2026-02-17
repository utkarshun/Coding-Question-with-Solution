import java.util.Stack;

class MinStack {
    Stack<Long> st = new Stack<>();
    long mini;

    public MinStack() {}

    public void push(int val) {
        long v = val;

        if (st.isEmpty()) {
            mini = v;
            st.push(v);
        }
        else if (v >= mini) {
            st.push(v);
        }
        else {
            st.push(2*v - mini);
            mini = v;
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long top = st.pop();

        if (top < mini) {
            mini = 2*mini - top;
        }
    }

    public int top() {
        long top = st.peek();
        return (top < mini) ? (int)mini : (int)top;
    }

    public int getMin() {
        return (int)mini;
    }
}