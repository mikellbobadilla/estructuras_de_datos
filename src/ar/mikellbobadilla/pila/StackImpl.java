package ar.mikellbobadilla.pila;

public interface StackImpl<E> {

    void push(E element);
    E pop();
    E peek();
    boolean isEmpty();
    int size();
}
