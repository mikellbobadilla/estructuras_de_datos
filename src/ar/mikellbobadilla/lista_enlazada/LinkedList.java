package ar.mikellbobadilla.lista_enlazada;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class LinkedList<E> implements Iterable<E>{

    private Node<E> head = null;
    private int size = 0;

    /**
     * Add element in the fist position
     * @param e element
     */
    public void addFirst(E e) {
        Node<E> newNode = new Node<>(e);
        newNode.next = head;
        head = newNode;
        size++;
    }

    /**
     * Add element in the last position
     * @param e element
     */
    public void add(E e) {
        Node<E> newNode = new Node<>(e);
        if(head == null)
            head = newNode;
        else {
            Node<E> p = head;
            while (p.next != null) {
                p = p.next;
            }
            p.next = newNode;
        }
        size++;
    }

    /**
     * Return Element
     * @param index position on the list
     * @return Element
     */
    public E get(int index) {
        if(head == null)
            return null;
        else {
            Node<E> p = head;
            int count = 0;
            while (count < index && p.next != null){
                p = p.next;
            count++;
            }

            if(count != index)
                return null;
            else
                return p.item;
        }
    }

    /**
     * Remove the first element
     * @return true if was removed
     */
    public boolean remove() {
        if(head != null) {
            Node<E> e = head;
            head = head.next;
            /* JVM delete this */
            e.next = null;
            size--;
            return true;
        }
        return false;
    }

    /**
     * Removes the element at the specified position in this list
     * @param index position
     * @return true if was removed
     */
    public boolean remove(int index) {
        if(head != null) {
            if(index == 0) {
                Node<E> e = head;
                head = head.next;
                e.next = null;
            } else if(index < size) {
                Node<E> p = head;
                int count = 0;
                while (count < (index - 1)) {
                    p = p.next;
                    count++;
                }
                /* Get node to remove */
                Node<E> temp = p.next;
                /* set the pointer to the next element */
                p.next = temp.next;
                temp.next = null;
            }
            size--;
            return true;
        }
        return false;
    }

    /**
     * @return true if the list has no collections
     */
    public boolean isEmpty() {
        return head == null;
    }

    public int getSize() {
        return size;
    }

    @Override
    public Iterator<E> iterator() {
        return new LinkedListIterator();
    }

    private class LinkedListIterator implements Iterator<E> {
        private Node<E> current = head;
        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }

            E item = current.item;
            current = current.next;
            return item;
        }

    }

    private static class Node<E> {
        E item;
        Node<E> next = null;
        public Node(E item) {
            this.item = item;
        }
    }

}
