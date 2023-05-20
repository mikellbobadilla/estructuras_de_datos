# Estructuras de Datos

- Sirven para representar información en un ordenador
- Sirven para ordenar mejor la información más compleja. 


**Lista enlazada Simple**

- Es una lista enlazada que permite representar un grupo de elementos representados en una secuencia.
- Son similares a los arrays.

- ventajas:
  - Los nodos no tienen por qué guardarse todos juntos en memoria, como ocurre con los arrays.
  - Pueden tener longitud variable.
  - Podemos agregar y quitar elementos en tiempo de ejecución.

- Desventajas:
  - Las listas no tienen noción de índice, por loq ue no podemos hacer accesos aleatorios.
  - Necesitan más espacio en memoria, ya que tienes que almacenar punteros. 

```text

Pseudocódigo

ESTRUCTURA nodo
    elemento: libro
    siguiente: PUNTERO a nodo
FIN ESTRUCTURA

ESTRUCTURA lista
    cabeza: PUNTERO a nodo
FIN ESTRUCTURA

[ crear un nodo ]
FUNCIÓN CrearNodo(l: Libro): Nodo
    VARIABLE nuevoNodo: Nodo
    
    nuevoNodo.elemento = l
    nuevoNodo.siguiente = NULO
    
FIN FUNCIÓN

[ insertar al principio ]
FUNCIÓN InsertarPrincipio(l: Lista, b: Libro)
    VARIABLE nuevoNodo: Nodo
    
    nuevoNodo.elemento = b
    nuevoNodo.siguiente = l.primero
    l.primero = nuevoNodo
    
FIN FUNCIÓN

```
