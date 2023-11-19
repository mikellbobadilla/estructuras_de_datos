package ar.mikellbobadilla.lista_enlazada;

public interface LinkedListImpl<E> {

    /**
     * Add the element in the first position
     * @param e element
     */
    void addFirst(E e);

    /**
     * Add the element int the last position
     * @param e element
     */
    void add(E e);

    /**
     * Get the element
     * @param index position
     * @return element
     */
    E get(int index);

    /**
     * Remove the first element
     * @return true if was removed
     */
    void remove();

    /**
     * Removes the last element
     */
    void removeLast();

    /**
     * Removes the element at the specifies position int this list
     * @param index position
     * @return true if was removed
     */
    void remove(int index);

    /**
     * @return true if the list has no elements
     */
    boolean isEmpty();

    /**
     * @return numbers exist in the list
     */
    int getSize();
}
