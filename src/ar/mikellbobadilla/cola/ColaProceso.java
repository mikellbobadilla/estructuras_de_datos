package ar.mikellbobadilla.cola;

import ar.mikellbobadilla.clases.Trabajo;

public interface ColaProceso {

    void encolar(Trabajo t);
    void eliminar();
    Trabajo obtener();

}
