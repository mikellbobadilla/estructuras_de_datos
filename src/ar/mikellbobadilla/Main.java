package ar.mikellbobadilla;


import ar.mikellbobadilla.binaryTree.BST;
import ar.mikellbobadilla.clases.Empleado;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Empleado e1 = new Empleado(20, "Pepito Pérez", "Ventas", "A-252");
        Empleado e2 = new Empleado(44, "Ana López", "Recursos Humanos", "B-198");
        Empleado e3 = new Empleado(18, "Elena Nito", "Ventas", "A-241");
        Empleado e4 = new Empleado(33, "José Gómez", "Contabilidad", "B-96");
        Empleado e5 = new Empleado(64, "Francisco Pérez", "Marketing", "A-69");
        Empleado e6 = new Empleado(55, "Javier López", "Informática", "B-161");
        Empleado e7 = new Empleado(10, "Javier López", "Informática", "B-162");


        BST bst = new BST();
        Arrays.asList(e1, e2, e3, e4, e5, e6, e7).forEach(bst::insertar);

        bst.preOrden();

    }
}
