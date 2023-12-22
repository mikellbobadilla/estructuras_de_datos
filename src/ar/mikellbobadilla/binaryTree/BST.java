package ar.mikellbobadilla.binaryTree;

import ar.mikellbobadilla.clases.Empleado;

public class BST implements BinaryTreeImpl<Empleado> {

    private Empleado valor;
    private BST izquierdo, derecho;

    @Override
    public boolean esHoja() {
        return valor != null && izquierdo == null && derecho == null;
    }

    @Override
    public boolean esVacio() {
        return valor == null;
    }

    @Override
    public void insertar(Empleado element) {
        if (valor == null)
            valor = element;
        else {
            if (element.compareTo(valor) < 0){
                if (izquierdo == null) izquierdo = new BST();
                izquierdo.insertar(element);
            } else if (element.compareTo(valor) > 0) {
                if (derecho == null) derecho = new BST();
                derecho.insertar(element);
            } else {
                // Nada
                throw new RuntimeException("Insertando un valor duplicado");
            }

        }
    }

    @Override
    public boolean existe(int id) {
        if (valor != null)
            if (id == valor.getId()) return true;
            else if (id < valor.getId() && izquierdo != null) return izquierdo.existe(id);
            else if (id > valor.getId() && derecho != null) return derecho.existe(id);
            else return false;
        else
            return false;
    }

    @Override
    public Empleado obtener(int id) {
        if (valor != null)
            if (id == valor.getId()) return valor;
            else if (id < valor.getId() && izquierdo != null) return izquierdo.obtener(id);
            else if (id > valor.getId() && derecho != null) return derecho.obtener(id);
            else return null;
        else
            return null;
    }

    private void preOrdenImpl(String prefijo) {
        if (valor != null) {
            System.out.println( prefijo + valor);
            if (izquierdo != null) izquierdo.preOrdenImpl(prefijo + "  ");
            if (derecho != null) derecho.preOrdenImpl(prefijo + "  ");
        }
    }

    @Override
    public void preOrden() {
        preOrdenImpl("");
    }

    private void inOrdenImpl(String prefijo) {
        if (valor != null) {
            if (izquierdo != null) izquierdo.inOrdenImpl(prefijo + "  ");
            System.out.println(prefijo + valor);
            if (derecho != null) derecho.inOrdenImpl(prefijo + "  ");
        }
    }

    @Override
    public void inOrden() {
        inOrdenImpl("");
    }

    private void postOrdenImpl(String prefijo) {
        if (valor != null) {
            if (izquierdo != null) izquierdo.postOrdenImpl(prefijo + "  ");
            if (derecho != null) derecho.postOrdenImpl(prefijo + "  ");
            System.out.println(prefijo + valor);
        }
    }

    @Override
    public void postOrden() {
        postOrdenImpl("");
    }

    private void eliminarImpl(int id) {
        if (izquierdo != null && derecho != null) {
            // Eliminar con dos hijos
        } else if (izquierdo != null || derecho != null) {
            // Eliminar con 1 hijo
        } else {
            // Eliminar con 0 hijos

        }
    }

    @Override
    public void eliminar(int id) {
        if (valor != null) {
            if (id == valor.getId()) {
                // Eliminar valor
            } else if (id < valor.getId() && izquierdo != null) {
                izquierdo.eliminar(id);
            } else if (id > valor.getId() && derecho != null) {
                derecho.eliminar(id);
            }
        }
    }
}
