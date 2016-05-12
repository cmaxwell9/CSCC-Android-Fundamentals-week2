package com.cmax.exercise12;

/**
 * Created by Clint on 4/19/2016.
 * Implement a Queue<E> generic type similar to the Stack<E> type but
 * with enqueue() and dequeue() methods. The enqueue() method adds an
 * element to the queue and the dequeue() method removes the first/oldest
 * element from the queue. Stacks are often described as being "last-in,
 * first-out" whereas queues represent a "first-in, first-out" behavior.

 */

/**
 * Created by aneuman1 on 4/21/2016.
 */

class QueueFullException extends Exception {}

class QueueEmptyException extends Exception {}

class Queue<E> {
    private E[] elements;
    private int index;
    private int size;

    Queue(int size) {
        this.size = size;
        elements = (E[]) new Object[size];
        index = 0;
    }

    public void enqueue(E element) throws QueueFullException {
        if (index >= size) {
            throw new QueueFullException();
        }

        elements[index] = element;
        index++;
    }

    public E dequeue() throws QueueEmptyException {
        if (index == 0) {
            throw new QueueEmptyException();
        }

        E returnValue = elements[0];

        E[] newElements = (E[]) new Object[size];
        for(int i = 1; i < size; i++) {
            newElements[i-1] = elements[i];
        }
        index--;
        elements = newElements;
        return returnValue;
    }
}

class QueueExample {
    public static void main(String[] args) {
        Queue<String> names = new Queue(4);

        try {
            names.enqueue("Clint");
            names.enqueue("Patty");
            names.enqueue("Kristy");
            names.enqueue("Greg");
            System.out.println(names.dequeue());
            System.out.println(names.dequeue());
            System.out.println(names.dequeue());
            System.out.println(names.dequeue());
 //           System.out.println(names.dequeue());
        }
        catch (QueueEmptyException | QueueFullException e) {
            e.printStackTrace();
        }
    }
}

