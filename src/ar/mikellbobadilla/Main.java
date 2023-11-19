package ar.mikellbobadilla;


import ar.mikellbobadilla.lista_enlazada.LinkedList;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        LinkedList<String> names = new LinkedList<>();

        names.add("Hola");
        names.add("Mundo");
        names.addFirst("Mikell");
        System.out.println(names.getSize());
        names.remove(0);
        System.out.println(names.getSize());

        names.forEach(System.out::println);

        Queue<String> authores = new PriorityQueue<>();
        authores.poll();
     }
}
