package ar.mikellbobadilla.cola;

import ar.mikellbobadilla.clases.Trabajo;

public interface QueueImpl<E> {

    /**
     * Add the element at the final queue
     * @param element element
     */
    void enqueue(E element);

    /**
     * Returns the first element and deletes
     * @return element
     */
    E dequeue();

    /**
     * Returns the first element without deletes
     * @return element
     */
    E peek();

    boolean isEmpty();
    int size();
}
