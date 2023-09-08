package tri.nguyen;

import java.util.Queue;
import java.util.LinkedList;
public class QueueDS {
    public static void main(String[] args){
        /*
            Queue:       an interface
                        public interface Queue<E> extends java.util.Collection<E>
                        FIFO (First-In First-Out) data structure (ex. A line of people)
                        A collection designed for holding elements prior to processing
                        Linear data structure


            Method:     insert (an item to the end of the Queue) = enqueue() , offer()
                        remove (an item from the head of the Queue) = dequeue() , poll()
                        examine = element() , peek()
            Usage:
                        1. Keyboard buffer (letters should appear on the screen in the order they're pressed)
                        2. Printer Queue (Print jobs should be completed in order)
                        3. Used in LinkedLists, PriorityQueues, Breath-first search

         */

        Queue<String> queue = new LinkedList<String>();

        // check if the queue is empty
        System.out.println("Empty queue: " + queue.isEmpty());

        // add items to the Queue
        queue.offer("Apple");
        queue.offer("Diamond");
        queue.offer("Umbrella");
        queue.offer("Banana");
        queue.offer("Zebra");

        System.out.println("After adding to the queue: " + queue);
        System.out.println("Empty queue: " + queue.isEmpty());

        // check size of the queue
        System.out.println("The current size of the queue: " + queue.size());

        // remove the first item from the Queue
        String firstItem = queue.poll();
        System.out.println("The first item of the queue: " + firstItem);
        System.out.println("After removing the first item of the queue: " + queue);
        System.out.println("The current size of the queue: " + queue.size());

        // examine the current first item in the Queue
        String currentFirstItem = queue.peek();
        System.out.println("Examining the current first item of the queue: " + currentFirstItem);
        System.out.println("After examining an item in the queue: " + queue);
        System.out.println("The current size of the queue: " + queue.size());

        // search for an item in the queue
        System.out.println("\"Diamond\" in the queue? " + queue.contains("Diamond")); // does not give back the index of the search item
        System.out.println("\"Gold\" in the queue? " + queue.contains("Gold"));

    }
}
