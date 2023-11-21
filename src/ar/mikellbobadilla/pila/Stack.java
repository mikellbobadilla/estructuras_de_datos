package ar.mikellbobadilla.pila;

import java.util.EmptyStackException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class Stack<E> implements StackImpl<E>, Iterable<E> {

    private Node<E> last;
    private int size = 0;

    @Override
    public void push(E element) {
        Node<E> newNode = new Node<>(element);
        newNode.next = last;
        last = newNode;
        size++;
    }

    @Override
    public E pop() {

        if(isEmpty())
            throw new EmptyStackException();

        Node<E> e = last;
        last = e.next;
        e.next = null;
        size--;
        return e.item;
    }

    @Override
    public E peek() {
        if(isEmpty())
            throw new EmptyStackException();
        return last.item;
    }

    @Override
    public boolean isEmpty() {
        return last == null;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new StackIterator();
    }

    private class StackIterator implements Iterator<E> {

        Node<E> current = last;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if(!hasNext())
                throw new NoSuchElementException("No such element on the list");

            E item = current.item;
            current = current.next;
            return item;
        }
    }

    private static class Node<E> {
        E item;
        Node<E> next = null;

        public Node(E element) {
            item = element;
        }
    }
}
