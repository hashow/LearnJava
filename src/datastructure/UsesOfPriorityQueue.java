package datastructure;

import java.util.PriorityQueue;

/*
Priority Queue:
---------------
A PriorityQueue is used when the objects are supposed to be processed based on the priority.
It is known that a Queue follows the First-In-First-Out algorithm, but sometimes the elements of the
queue are needed to be processed according to the priority, that’s when the PriorityQueue comes into play.

The PriorityQueue is based on the priority heap. The elements of the priority queue are ordered according to the natural
ordering, or by a Comparator provided at queue construction time, depending on which constructor is used.

A few important points on Priority Queue are as follows:
--------------------------------------------------------
1. PriorityQueue does not permit null.
2. We can’t create a PriorityQueue of Objects that are non-comparable
3. PriorityQueue are unbound queues.
4. The head of this queue is the least element with respect to the specified ordering.
If multiple elements are tied for the least value, the head is one of those elements — ties are broken arbitrarily.
5. Since PriorityQueue is not thread-safe, java provides PriorityBlockingQueue class
that implements the BlockingQueue interface to use in a java multithreading environment.
6. The queue retrieval operations poll,  remove,  peek, and element access the element at the head of the queue.
7. It provides O(log(n)) time for add and poll methods.
8. It inherits methods from AbstractQueue, AbstractCollection, Collection, and Object class.
*/
public class UsesOfPriorityQueue {

    public static void main(String[] args) {

        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.add(10);
        pq.add(100);
        pq.add(1000);
        pq.add(10000);
        pq.add(100000);

        /*
        For each loop is the easiest way to retrieve values from PriorityQueue
        */
        for (Integer c : pq) {
            System.out.println(c);
        }

    }
}
