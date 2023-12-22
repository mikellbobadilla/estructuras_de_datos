package ar.mikellbobadilla.binaryTree;

public class BinaryTree<E extends Comparable<E>> {

    public Node<E> root;

    public BinaryTree() {
        root = null;
    }

    public boolean esHoja(Node<E> root) {
        return root != null && root.left == null && root.right == null;
    }

    public boolean esVacio() {
        return root == null;
    }

    public void insert(E element) {
        root = insertR(root, element);
    }

    private Node<E> insertR(Node<E> root, E element) {
        if (root == null)
            return new Node<>(element);

        if (element.compareTo(root.item) < 0)
            root.left = insertR(root.left, element);
        else if (element.compareTo(root.item) > 0)
            root.right = insertR(root.right, element);

        return root;
    }

    public boolean search(E element) {
        return searchR(root, element);
    }

    private boolean searchR(Node<E> root, E element) {
        if (root == null || root.item.equals(element))
            return root != null;

        if (element.compareTo(root.item) < 0)
            return searchR(root.left, element);

        return searchR(root.right, element);
    }

}
