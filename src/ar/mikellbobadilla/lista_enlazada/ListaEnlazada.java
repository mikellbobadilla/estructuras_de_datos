package ar.mikellbobadilla.lista_enlazada;

import ar.mikellbobadilla.clases.Libro;

public class ListaEnlazada {

  private Nodo cabeza = null;
  private int longitud = 0;

  public void insertarPrincipio(Libro libro){
    Nodo nodo = new Nodo(libro);
    nodo.siguiente = cabeza;
    cabeza = nodo;
    longitud++;
  }

  public void insertarFinal(Libro libro){
    Nodo nodo = new Nodo(libro);
    if(cabeza == null){
      cabeza = nodo;
    }else {
      Nodo puntero = cabeza;
      while (puntero.siguiente != null){
        puntero = puntero.siguiente;
      }
      puntero.siguiente = nodo;
    }
    longitud++;
  }

  public Libro obtener(int n){
    if(cabeza == null){
      return null;
    }else {
      Nodo puntero = cabeza;
      int contador = 0;
      while (contador < n && puntero.siguiente != null){
        puntero = puntero.siguiente;
        contador++;
      }
      if (contador != n){
        return null;
      }else {
        return puntero.libro;
      }
    }
  }

  public void eliminarPrincipio(){
    if(cabeza != null){
      Nodo primer = cabeza;
      cabeza = cabeza.siguiente;
      primer.siguiente = null;
      longitud--;
    }
  }

  public void eliminarUltimo(){
    if(cabeza != null){
      if(cabeza.siguiente == null){
        cabeza = null;
      }else {
        Nodo puntero = cabeza;
        while (puntero.siguiente.siguiente != null){
          puntero = puntero.siguiente;
        }
        puntero.siguiente = null;
      }
      longitud--;
    }
  }

  public void eliminarLibro(int n){
    if(cabeza != null){
      if(n == 0){
        Nodo primer = cabeza;


        cabeza = cabeza.siguiente;
        primer.siguiente = null;
        longitud--;
      }else if (n < longitud){
        Nodo puntero = cabeza;
        int contador = 0;
        while(contador < (n -1)){
          puntero = puntero.siguiente;
          contador++;
        }
        Nodo temp = puntero.siguiente;
        puntero.siguiente = temp.siguiente;
        temp.siguiente = null;
        longitud--;
      }
    }
  }

  public boolean estaVacia(){
    return cabeza == null;
  }

  public int contar(){
    return longitud;
  }

  /* ---------------------------- */

  private static class Nodo{
    public Libro libro;
    public Nodo siguiente = null;

    public Nodo(Libro libro) {
      this.libro = libro;
    }
  }


  public static void main(String[] args) {
    ListaEnlazada libros = new ListaEnlazada();

    Libro l = new Libro("Caperucita Roja", "Sting", "1234567890");
    Libro l2 = new Libro("Viaje al centro de la tierra", "Capitan", "2445151");
    libros.insertarFinal(l);
    libros.insertarFinal(l2);
    System.out.println(libros.obtener(0));
    System.out.println(libros.obtener(1));
    System.out.println(libros.estaVacia());
  }
}
