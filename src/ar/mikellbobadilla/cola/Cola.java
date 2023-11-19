package ar.mikellbobadilla.cola;

import ar.mikellbobadilla.clases.Trabajo;

public class Cola implements ColaProceso {
    private static class Nodo {
        private Trabajo trabajo;
        private Nodo siguiente;
        public Nodo(Trabajo trabajo) {
            this.trabajo = trabajo;
        }
    }

    @Override
    public void encolar(Trabajo t) {

    }

    @Override
    public void eliminar() {

    }

    @Override
    public Trabajo obtener() {
        return null;
    }
}