package org.example;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        /*
        STACK

        - LIFO data structure. Last-In First-Out
        - stores objects into a sort of "vertical tower"
        - push() to add  to the top
        - pop() to remove from the top
         */

        Stack<String> stack = new Stack<String>();

        //System.out.println(stack.empty());

        stack.push("Minecraft");
        stack.push("Skyrim");
        stack.push("DOOM");
        stack.push("Borderlands");
        stack.push("FFVII");

        //some stack methods:

        //String myFavGame = stack.pop();
        //System.out.println(stack.peek());
        //System.out.println(stack.search("Minecraft"));

        /* adding large quantities:
        for(int i=0; i< 1000000; i++){
            stack.push("Skyrim");
        }
        */

        // uses of stacks:
        /*
        1. undo/redo features in text editors
        2. moving back/forward through browser history
        3. backtracking algorithms (maze, file directories)
        4. calling functions (call stack)
        */

    }
}