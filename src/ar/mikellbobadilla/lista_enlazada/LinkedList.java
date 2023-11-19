package ar.mikellbobadilla.lista_enlazada;

import java.util.List;

public class LinkedList<E> implements LinkedListImpl<E> {

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


    @Override
    public void addFirst(E e) {
        Node<E> next = first.next;
        Node<E> newNode = new Node<>(null, e, next);
        first = newNode;
        if(next == null)
            last = newNode;
        size++;
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
    public void remove() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public void remove(int index) {

    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int getSize() {
        return 0;
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
