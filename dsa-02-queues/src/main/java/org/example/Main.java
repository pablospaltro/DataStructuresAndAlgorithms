package org.example;

import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        /*
       Queue = FIFO data structure. First-In First-Out
               A collection designed for holding elements prior to processing
               Linear data structure

               add    = enqueue, offer()
               remove = dequeue, poll()
        */

        Queue<String> queue = new LinkedList<String>();

        //this should be true:
        System.out.println(queue.isEmpty());

        //adding strings to the queue:
        queue.offer("Juan");
        queue.offer("Carlos");
        queue.offer("Lionel");
        queue.offer("Julian");

        //now it should be false:
        System.out.println(queue.isEmpty());

        //show the first string:
        System.out.println(queue.peek());

        //show the size of the queue (it should be 4):
        System.out.println(queue.size());

        //look for some string in our queue (only boolean,
        // not returning the index):
        System.out.println(queue.contains("Lionel"));

        //removing each string:
        queue.poll();
        queue.poll();
        queue.poll();
        queue.poll();

        System.out.println(queue);


        /*
        Where are queues useful?

        1. Keyboard Buffer (letters should appear on the screen
           in the order they're pressed).
        2. Printer Queue (Print jobs should be completed in order)
        3. Used in LinkedLists, PriorityQueues, Breadth-first search.

        */
    }
}