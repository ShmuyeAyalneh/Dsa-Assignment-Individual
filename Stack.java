public class Stack{
    private Node top;
    public Stack(){
        this.top = null;
    }
//    push operation adds an element to the top of the stack
    public void push(int data){
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }
//    pop operation: removes and returns the top element of the stack
    public int pop(){
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty.");
        }
        int data = top.data;
        top = top.next;
        return data;
    }
//    peek operation returns the top element of the stack without removing it
    public int peek(){
        if (isEmpty()){
            throw new IllegalStateException("Stack is empty: ");
        }
        return  top.data;
    }
    public boolean isEmpty(){
        return  top == null;
    }
    public void printStack(){
        Node current = top;
        while(current != null){
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("None");
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
//        pushing elements to the stack
        stack.push(10);
        stack.push(20);
        stack.push(30);
//        displaying elements of the stack
        stack.printStack();
//        peeking the top element
        System.out.println("Top element is " + stack.peek());
//        popping elements from the stack
        System.out.println("popped element is  " + stack.pop());


    }
}




