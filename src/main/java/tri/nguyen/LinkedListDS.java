package tri.nguyen;

import java.util.LinkedList;

public class LinkedListDS {

    /*
    LinkedList:     stores Nodes in 2 parts (data + address)
                    Nodes are in non-consecutive memory locations
                    Elements are linked using pointers
                                    Singly Linked List
                        Node                    Node                    Node
                    [data | address] ->     [data | address] ->     [data | address]

                                    Doubly Linked List
                        Node                                            Node
                    [address | data | address]      <->     [address | data | address]

    Pros:
                    1. Dynamic Data Structure (allocates needed memory while running)
                    2. Insertion and Deletion of Nodes is easy. Time Complexity: O(1) === Constant Time
                    3. No/Low memory
    Cons:
                    1. Greater memory usage (addition pointer)
                    2. No random access of elements (no index [i])
                    3. Accessing/searching elements is more time consuming. Time Complexity: O(n) === Linear

    Method:         Insert      addFirst(e)
                                offerFirst(e)
                                addLast(e)
                                offerLast(e)

                    Remove      removeFirst()
                                pollFirst()
                                removeLast()
                                pollLast()

                    Examine     getFirst()
                                peekFirst()
                                getLast()
                                peekLast()
    Usage:
                    1. Implement Stacks/Queues
                    2. GPS navigation (application of Nodes for stop places and destinations)
                    3. Music playlist
     */

    public static void main(String[] args){

        // LinkedList as Stack
        LinkedList<String> linkedListStack = new LinkedList<>();
        // add items to the LinkedList as Stack
        linkedListStack.push("***");
        linkedListStack.push("A");
        linkedListStack.push("B");
        linkedListStack.push("C");
        linkedListStack.push("D");
        linkedListStack.push("F");

        System.out.println("LinkedList as Stack: " + linkedListStack);
        // remove the top item of the LinkedList as Stack
        String topItemStack = linkedListStack.pop();
        System.out.println("After using pop(), LinkedList as Stack: " + linkedListStack);
        String currentTopItemStack = linkedListStack.peek();
        System.out.println("The current top item using peek(): " + currentTopItemStack);
        System.out.println("After using peek(), LinkedList as Stack: " + linkedListStack);
        System.out.println("\"A\" in the list? " + linkedListStack.contains("A")); // can't use search() like stack for this
        System.out.println("\"G\" in the list? " + linkedListStack.contains("G"));

        // add E to the list at index 4
        linkedListStack.add(4, "E");
        System.out.println("After adding \"E\" at index 4: " + linkedListStack);

        // remove E from the list
        linkedListStack.remove("E");
        System.out.println("After removing \"E\" from the list: " + linkedListStack);

        // searching for the index of B
        System.out.println("The index of \"B\" in the list: " + linkedListStack.indexOf("B") );

        // peek the first and last item
        System.out.println("The first item of the list: " + linkedListStack.peekFirst());
        System.out.println("The last item of the list: " + linkedListStack.peekLast());

        // add item to the head and tail
        linkedListStack.addFirst("O");
        System.out.println("After adding to the head of the linkedList: " + linkedListStack);
        linkedListStack.addLast("99");
        System.out.println("After adding to the tail of the linkedList: " + linkedListStack);

        // remove item from the head and tail
        linkedListStack.removeFirst();
        System.out.println("After removing an item from the head of the linkedList: " + linkedListStack);
        linkedListStack.removeLast();
        System.out.println("After removing an item from the tail of the linkedList: " + linkedListStack);


        System.out.println("***************************************************************");

        // LinkedList as Queue
        LinkedList<String> linkedListQueue = new LinkedList<>();
        // add items to the LinkedList as Queue
        linkedListQueue.offer("***");
        linkedListQueue.offer("A");
        linkedListQueue.offer("B");
        linkedListQueue.offer("C");
        linkedListQueue.offer("D");
        linkedListQueue.offer("F");

        System.out.println("LinkedList as Queue: " + linkedListQueue);

        // remove the top item of the LinkedList as Queue
        String topItemQueue = linkedListQueue.poll();
        System.out.println("After using poll(), LinkedList as Queue: " + linkedListQueue);
        String currentTopItemQueue = linkedListQueue.peek();
        System.out.println("The current top item using peek(): " + currentTopItemQueue);
        System.out.println("After using peek(), LinkedList as Queue: " + linkedListQueue);
        System.out.println("\"A\" in the list? " + linkedListQueue.contains("A"));
        System.out.println("\"G\" in the list? " + linkedListQueue.contains("G"));

        // add E to the list at index 4
        linkedListQueue.add(4, "E");
        System.out.println("After adding \"E\" at index 4: " + linkedListQueue);

        // remove E from the list
        linkedListQueue.remove("E");
        System.out.println("After removing \"E\" from the list: " + linkedListQueue);

        // searching for the index of B
        System.out.println("The index of \"B\" in the list: " + linkedListQueue.indexOf("B") );

        // peek the first and last item
        System.out.println("The first item of the list: " + linkedListQueue.peekFirst());
        System.out.println("The last item of the list: " + linkedListQueue.peekLast());

        // add item to the first and last index
        linkedListQueue.addFirst("O");
        System.out.println("After adding to the head of the linkedList: " + linkedListQueue);
        linkedListQueue.addLast("99");
        System.out.println("After adding to the tail of the linkedList: " + linkedListQueue);

        // remove item from the head and tail
        linkedListQueue.removeFirst();
        System.out.println("After removing an item from the head of the linkedList: " + linkedListQueue);
        linkedListQueue.removeLast();
        System.out.println("After removing an item from the tail of the linkedList: " + linkedListQueue);
    }
}
