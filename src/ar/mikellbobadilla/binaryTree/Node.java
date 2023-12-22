package ar.mikellbobadilla.binaryTree;

public class Node<E extends Comparable<E>> {

    public E item;

    public Node<E> parent;

    public Node<E> left, right;

    public Node(E element) {
        item = element;
        left = right = null;
    }
}
