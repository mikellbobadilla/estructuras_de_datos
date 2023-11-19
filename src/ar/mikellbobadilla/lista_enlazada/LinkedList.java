package ar.mikellbobadilla.lista_enlazada;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedList<E> implements LinkedListImpl<E>, Iterable<E> {

    private Node<E> first;
    private Node<E> last;
    private int size = 0;

    private Node<E> node(int index) {
        Node<E> x = null;
        if (index < size) {
            if (index < (size >> 1)) {
                x = first;
                for (int i = 0; i < index; i++)
                    x = x.next;
            } else {
                x = last;
                for (int i = size - 1; i > index; i--)
                    x = x.prev;
            }
        }
        return x;
    }

    private void unlink(Node<E> x) {
        Node<E> next = x.next;
        Node<E> prev = x.prev;

        if(prev == null)
            first = next;
        else {
            prev.next = next;
            x.prev = null;
        }

        if(next == null)
            last = prev;
        else {
            next.prev = prev;
            x.next = null;
        }
        size--;
    }


    @Override
    public void addFirst(E e) {
        if(first != null) {
            final Node<E> el = first;
            Node<E> newNode = new Node<>(null, e, null);
            newNode.next = el;
            el.prev = newNode;
            first = newNode;
            if(el.next == null)
                last = el;
            size++;
        }

    }

    @Override
    public void add(E e) {
        Node<E> newNode = new Node<>(null, e, null);
        if(first == null) {
            first = newNode;
            last = newNode;
        } else {
            Node<E> el = last;
            el.next = newNode;
            last  = newNode;
            newNode.prev = el;
        }
        size++;
    }

    @Override
    public E get(int index) {
        Node<E> node = node(index);
        return (node != null) ? node.item : null;
    }

    @Override
    public void removeFirst() {
        if(first != null)
            unlink(first);
    }

    @Override
    public void removeLast() {
        if(last != null)
            unlink(last);
    }

    @Override
    public void remove(int index) {
        unlink(node(index));
    }

    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {

        private Node<E> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {

            if(!hasNext())
                throw new NoSuchElementException("No elements in the list");

            E item = current.item;
            current = current.next;
            return item;
        }
    }

    private static class Node<E> {
        private Node<E> next;
        private Node<E> prev;
        private E item;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.prev = prev;
            item = element;
            this.next = next;
        }
    }
}
