package testPkg;

import java.util.Stack;


public class Take5 {

    public static void main(String[] args) {
        Stack stack = new Stack<String>();
        stack.push("hey");
        stack.push(9);
        System.out.println(stack.peek());
        System.out.println(stack.peek());


    }

    protected void setIt() {
        System.out.println("hey");
    }
}
