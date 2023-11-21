package ar.mikellbobadilla;


import ar.mikellbobadilla.cola.Queue;
import ar.mikellbobadilla.pila.Stack;

import java.util.Iterator;

public class Main {

    public static void main(String[] args) {

        Stack<String> names = new Stack<>();

        names.push("Primer comentario");
        names.push("Segundo comentario");
        names.push("Tercer comentario");
        names.push("Cuarto comentario");
        names.push("Quinto comentario");

        while (!names.isEmpty())
            System.out.println(names.pop());

        System.out.println(names.size());
    }
}
