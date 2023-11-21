package ar.mikellbobadilla.cola;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Queue<E> implements QueueImpl<E>, Iterable<E> {

    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    @Override
    public void enqueue(E element) {
        Node<E> newNode = new Node<>(element);
        if(isEmpty()) {
            first = newNode;
        } else {
            last.next = newNode;
        }
        last = newNode;
        size++;
    }

    @Override
    public E dequeue() {

        if(isEmpty())
            throw new IllegalStateException("The queue is empty");

        Node<E> element = first;
        first = element.next;
        element.next = null;
        size--;
        if(isEmpty()) {
            last = null;
        }
        return element.item;
    }

    @Override
    public E peek() {
        if(isEmpty())
            throw new IllegalStateException("The queue is empty");

        return first.item;
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new QueueIterator();
    }

    private class QueueIterator implements Iterator<E> {

        Node<E> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if(!hasNext())
                throw new NoSuchElementException("No such element on the queue");
            E element = current.item;
            current = current.next;
            return element;
        }
    }
    private static class Node<E> {
        public E item;
        public Node<E> next = null;

        public Node(E element) {
            item = element;
        }
    }
}