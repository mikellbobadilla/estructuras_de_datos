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

## Arboles

La primer caracteristica es que los arboles no son lineales. En tal caso los nodos pueden apuntar a un numero indefinido de elementos

- Nodo Raiz : Es el primer nodo que no tiene un nodo padre
- Nodo Hijo : Es un nodo que esta siendo apuntado por un nodo (padre)
- Nodo Hoja : Es el ultimo nodo de un arbol, osea no tiene hijos, ni puede tenerlos
- Los nodos no pueden tener ciclo, osea mas de un nodo no puede tener dos padre ni puede apuntarse a si mismo.

```text
/* Definido de forma recursiva */
Estructura Nodo {
    Valor: INT
    Hijos: LIST OF Nodo
        
}  

```

Propiedades

- A que distancia esta un nodo raiz medida en nodos (Es decir, cuantas aristas debo atravesar para llegar al nodo raiz)
- La forma en la que se miden los arboles, esta definido en niveles, siendo el nodo raiz como el nivel cero, incrementando asi la lista de nodos de otros niveles.
- Altura/Profundidas es decir el maximo nivel que tengamos en los arboles.
- Orden indica cuando nodos puede tener como hijo. 
  - Es importante limitar la cantidad de hijos que puede tener un nodo
  - Los arboles deben crecer de forma vertical (ser mas profundos), frente a los arboles crecen en horizontal (tienen mas hijos)

Ejemplo:

- Orden 2: un nodo puede tener 0,1 o 2 hijos (Arbol binario)
- Orden 3: un nodo puede tener hasta 3 hijos (Arbol Ternario)
- Orden 4: un nodo puede tener hasta 4 hijos
- Etc.

Arbol completo

- Todos los nodos tienen:
  - 0 o hijos
  - 0 el numero maximo de hijos
- Ejemplo: Un arbol completo todos los nodos tienen 2 hijos o son hojas

Operaciones:
- Insertar elementos
- Eliminar elementos
- Localizar elementos
- Recorrer un arbol

## Arboles Binarios

- Son de orden 2, osea como maximo tienen como 2 hijos maximos.
- Full Complete:
  - Todos los nodos de arbol binario tienen,o Ningun hijo (son hojas) o tiene 2 hijos.
- Complete Binary Tree
  - El ultimo nivel de un Fill Binary Tree puede permitirse el prescindir de algunos de sus hijos. (El padre del nodo hoja solo tiene un hijo).
  - A condicion de que el nodo hoja sea el hijo de la izquierda.
- Arboles degenerados:
  - Cada nodo solo tiene un hijo.
  - Se comportan como listas.
- Arboles balanceados
  - Un arbol binario balanceado intenta mantener la profundidad de sus dos subarboles la menos posible.
  - El balanceo o equilibrio de un arbol hace que alguna operaciones sean mas eficientes.
  - Algunos arboles especiales se aprovechan del balanceo. Dependiendo de que tipo de balanceo intentemos usar se usa un regla u otra distinta.

### Cambios de Estructura

```text
ESTRUCTURA NODO_BT {
    valor: ENTERO
    izquierdo, derecho : PUNTERO a NODO_BT
}
```

- Operaciones
  - Insercion
  - Eliminacion
  - Localizacion
  - Recorrido
- Formas de recorrer un Arbol
  - Hacer un proceso sobre cada nodo del arbol
  - Existen varias formas de recorrer un arbol:
    - En anchura
    - En preorden (En profundidad)
    - En inorden (En profundidad)
    - En postorden (En profundidad)

- Recorrido en anchura:
  - Consiste en procesar a las vez todos los elementos del mismo nivel.
  - Cuando hemos terminado con un nivel pasamos al siguiente nivel.
- Recorrido en profundidad:
  - Es mejor considerar los nodos izquierdo y derecho como subarboles.
  - Se procesan
    - La raiz
    - El subarbol izquierdo
    - El subarbol derecho
  - Dependiendo de cuando se procese la raiz, tenemos varias configuraciones.

- Preorden
  - Procesamos la raiz
  - Procesamos el arbol izquierdo
  - Procesamos el arbol derecho
- Inorden
  - Procesamos el arbol isquierdo
  - Procesamos la raiz
  - Procesamos el arbol derecho
- Postorden
  - Procesamos el arbol izquierdo
  - Procesamos el arbol derecho
  - Procesamos la raiz

### Algoritmo

```text
/* Preorden */

void preorden(arbol* a) {
    if (a.raiz != null) {
        procesar(a.raiz)
        preorden(a.izquierdo)
        preorden(a.derecho)
    }
}


/* Inorden */

void inorden(arbol* a) {

    if(a.raiz != null) {
        inorden(a.izquierdo)
        procesar(a.raiz)
        inorden(a.derecho)
    }
}

/* Postorden */

void postorden(arbol* a) {
    if(a.raiz != null) {
        postorden(a.izquierdo)
        postorden(a.derecho)
        procesar(a.raiz)
    }
}


```

## Arboles binarios de busqueda

- Es un arbol binario muy extendido
- Un arbol binario de busqueda con raiz R es de busqueda cuando no es vacio y:
  - Si tiene un subarbol isquierdo, la raiz del subarbol izquierdo es menor a R, y ala vez el subarbol izquierdo tambien es de busqueda
  - Si tiene un subarbol derecho, la raiz del subarbol derecho es mayor a R y a la vez el subarbol derecho tambien es de busqueda.

Operacion Busqueda

- Localizar elementos a partir de su clave.
- Usos:
  - Operacion Existe?: Comprobar si una clave esta presente en un arbol o no.
  - Operacion Obtener: Obtener el objeto cuyo identificador sea el que pedimos.

### Logica

- Si el arbol es un arbol vacio: insertamos en la raiz.
- Si la raiz del arbol es igual al elemento a insertar: si no toleramos duplicados, no insertamos o emitimos un error.
- Si la raiz del arbol es mayor al elemento a insertar: insertamos en el subarbol izquierdo.
- Si la raiz del arbol es menor al elemento a insertar insertamos en el subarbol derecho.


