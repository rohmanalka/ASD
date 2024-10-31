package Praktikum8;

public class stackDemo21 {
    public static void main(String[] args) {
        stack21 stack = new stack21(10);
        stack.push(8);
        stack.push(12);
        stack.push(18);
        stack.print();
        stack.pop();
        stack.peek();
        stack.pop();
        stack.push(-5);
        stack.print();
    }    
}
