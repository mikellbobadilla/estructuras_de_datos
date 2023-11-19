package ar.mikellbobadilla.lista_enlazada;

public class HashList<E> implements LinkedListImpl<E> {

    private Node<E> head = null;
    private Node<E> last = null;
    private int size = 0;

    private void linkFirst(E e) {
        final Node<E> f = head;
        final Node<E> newNode = new Node<>(null, e, f);
        head = newNode;
        if (f == null)
            last = newNode;
        else
            /* Apunta al siguiente nodo de la lista */
            f.prev = newNode;
        size++;
    }

    private void linkLast(E e) {
        final Node<E> l = last;
        final Node<E> newNode = new Node<>(l, e, null);
        last = newNode;
        if(l == null)
            head = newNode;
        else
            l.next = newNode;
        size++;
    }

    private void unlinkLast() {
        final Node<E> l = last;
        final Node<E> prev = l.prev;
        l.item = null;
        l.prev = null;
        last = prev;
        if(prev == null)
            head = null;
        else
            prev.next = null;
        size--;
    }

    /*
    * Returns the Node at the specified element index
    * */
    Node<E> node(int index) {
        Node<E> x;
        if(index < (size >> 1)){
            x = head;
            for (int i = 0; i < index; i++)
                x = x.next;
        } else {
            x = last;
            for (int i = size - 1; i > index; i--)
                x = x.prev;
        }
        return x;
    }

    private void unlink(Node<E> x) {
        final Node<E> next = x.next;
        final Node<E> prev = x.prev;

        if (prev == null)
            head = next;
        else {
            prev.next = next;
            x.prev = null;
        }

        if (next == null)
            last = prev;
        else {
            next.prev = prev;
            x.next = null;
        }
        size--;
    }

    @Override
    public void addFirst(E e) {
        linkFirst(e);
    }

    @Override
    public void add(E e) {
        linkLast(e);
    }

    @Override
    public E get(int index) {
        /* index < (size/2) */
        if(index < (size >> 1)){
            Node<E> p = head;
            for (int i = 0; i < index; i++)
                p = p.next;
            return p.item;
        } else {
            Node<E> l = last;
            for (int i = size - 1; i > index; i--)
                l = l.prev;
            return l.item;
        }
    }

    @Override
    public void remove() {
        unlinkLast();
    }

    @Override
    public void remove(int index) {
        if(index < (size >> 1)){
            Node<E> p = head;
            for (int i = 0; i < index; i++)
                p = p.next;

        }
    }

    @Override
    public boolean isEmpty() {
        return head == null;
    }

    @Override
    public int getSize() {
        return 0;
    }

    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;

        public Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
}
