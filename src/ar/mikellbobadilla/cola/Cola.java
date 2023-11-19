package ar.mikellbobadilla.cola;

import ar.mikellbobadilla.clases.Trabajo;
import org.w3c.dom.Node;

public class Cola implements ColaProceso {



    private static class Nodo {
        private Trabajo trabajo;
        private Node siguiente;
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