package ar.mikellbobadilla.binaryTree;

public interface BinaryTreeImpl<E extends Comparable<E>> {

    void insertar(E element);
    boolean existe(int id);
    E obtener(int id);
    boolean esHoja();
    boolean esVacio();

    void preOrden();
    void inOrden();
    void postOrden();
    void eliminar(int id);
}
