package ar.mikellbobadilla;


import ar.mikellbobadilla.lista_enlazada.LinkedList;

import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
//        LinkedList<String> names = new LinkedList<>();
//
//        names.add("Hola");
//        names.add("Mundo");
//        names.addFirst("Mikell");
//        System.out.println(names.getSize());
//        names.remove(0);
//        System.out.println(names.getSize());
//
//        names.forEach(System.out::println);
//
//        java.util.LinkedList<String> ns = new java.util.LinkedList<>();

        int age = 10;

        for(int i = 0; i < 4; i++) {
            System.out.println(i);

            /*
            * Nodo e = elemento;
            * Nodo prev = e.prev
            * Nodo next = e.next
            * prev.next = next
            * e.prev = null
            * next.prev = prev
            * e.next = null
            * */

        }

        for (int i = age - 1; i > 7; i--) {
            System.out.println(i);
        }

     }
}
