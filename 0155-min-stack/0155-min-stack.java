
class MinStack {
    class Node {
        int val;
        int min;
        Node next;

        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }
    }

    private Node top;

    public MinStack() {
        top = null;
    }

    public void push(int value) {
        if (top == null) {
            top = new Node(value, value);
        } else {
            Node n = new Node(value, Math.min(value, top.min));
            n.next = top;
            top = n;
        }
    }

    public void pop() {
        top = top.next;
    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        return top.min;
    }
}
