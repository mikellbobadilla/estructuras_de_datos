package ar.mikellbobadilla;


import ar.mikellbobadilla.lista_enlazada.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Hola");
        names.add("Como estas?");
        names.add("Esto es como que esta funcionando");
        names.add("Los videos que se esta mirando son raros");
        names.addFirst("Primer comentario");
        System.out.println(names.get(0));
        System.out.println(names.get(4));
     }
}
