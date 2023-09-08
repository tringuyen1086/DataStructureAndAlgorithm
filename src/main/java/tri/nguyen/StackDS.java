package tri.nguyen;
import java.util.Stack;

public class StackDS {
    public static void main(String[] args){
        /*
           stack:           LIFO (Last-In First-Out) data structure
                            stores objects into a sort of "vertical tower"
           Method:          insert = push() to add to the top
                            remove = pop() to remove from the top
                            examine = peek() to check the top without removing the top object

           Usage of stack:
                            1. Undo/redo features in text editors
                            2. Moving back/forward through browser history
                            3. backtracking algorithms (maze, file directories)
                            4. Calling functions (call stack)
         */

        Stack<String> stack = new Stack<>();

        // check if the stack is empty
        System.out.println("Empty Stack: " + stack.empty());

        // add items to stack
        stack.push("Apple");
        stack.push("Diamond");
        stack.push("Umbrella");
        stack.push("Banana");
        stack.push("Zebra");

        System.out.println("After adding items to the stack: " + stack);
        System.out.println("Empty Stack: " + stack.empty());

        // remove the first/top item
        String top = stack.pop();
        System.out.println("The top item of the stack: " + top);
        System.out.println("After removing the top items: " + stack);

        // check the current top item
        String currentTop = stack.peek();
        System.out.println("The current top item of the stack: " + currentTop);
        System.out.println("The stack's items after using stack.peek(): " + stack);

        // search for an item in the stack
        System.out.println("\"Diamond\" in the stack? " + stack.search("Diamond"));
        System.out.println("\"Gold\" in the stack? " + stack.search("Gold"));
    }
}

