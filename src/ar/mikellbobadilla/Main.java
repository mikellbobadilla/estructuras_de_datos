package ar.mikellbobadilla;


import ar.mikellbobadilla.lista_enlazada.LinkedList;

public class Main {

    public static void main(String[] args) {

        LinkedList<String> names = new LinkedList<>();
        names.add("Hola");
        names.add("Como estas?");
        names.add("Esto es como que esta funcionando");
        names.add("Los videos que se esta mirando son raros");
        names.add("Este es el ultimo comentario");
        names.add("Este es otro ultimo comentario");
        names.addFirst("Primer comentario");
        names.addFirst("Es es otro primer comentario");

        names.removeFirst();
        names.removeLast();
        names.remove(1);

        names.forEach(name -> {
            System.out.println(name.toUpperCase());
        });
        System.out.println(names.getSize() + ": nombres");
        System.out.println(names.isEmpty());

     }
}
