package org.example;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {

        /*
        Priority Queue = FIFO data structure that serves elements
                         with the highest priorities first
                         before elements with lower priority
        */

        // -------------- DOUBLES -------:

        // ascending order:
        Queue<Double> queue = new PriorityQueue<>();

        // descending order:
        //Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());

        queue.offer(3.0);
        queue.offer(2.5);
        queue.offer(4.0);
        queue.offer(1.5);
        queue.offer(2.0);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }

        // -------------- STRINGS -------:

        // ascending by alphabetical order
        Queue<String> queue2 = new PriorityQueue<>();

        queue2.offer("B");
        queue2.offer("C");
        queue2.offer("A");
        queue2.offer("F");
        queue2.offer("D");

        while(!queue2.isEmpty()){
            System.out.println(queue2.poll());
        }
    }
}