package org.example;
/*
Facultad de Ingenieria
Departamento de Ciencias de la Computacion
Algoritmos y Estructura de Datos
HDT8

Vianka Castro - 23201

Interfaz que define una cola de prioridad genérica.
@param <E> el tipo de elementos que se almacenarán en la cola de prioridad.
 */
public interface IPriorityQueue<E extends Comparable<E>> {
    /**
     * Agrega un elemento a la cola de prioridad.
     *
     * @param element el elemento a agregar a la cola de prioridad.
     */
    void add(E element);
    /**
     * Elimina y devuelve el elemento con la prioridad más alta de la cola de prioridad.
     *
     * @return el elemento con la prioridad más alta en la cola de prioridad.
     */
    E remove();
    /**
     * Verifica si la cola de prioridad está vacía.
     *
     * @return true si la cola de prioridad está vacía, false de lo contrario.
     */
    boolean isEmpty();
    /**
     * Obtiene el elemento con la prioridad más alta en la cola de prioridad sin eliminarlo.
     *
     * @return el elemento con la prioridad más alta en la cola de prioridad.
     */
    public E getFirst();
    /**
     * Obtiene el número de elementos en la cola de prioridad.
     *
     * @return el número de elementos en la cola de prioridad.
     */
    public int size();
    /**
     * Elimina todos los elementos de la cola de prioridad.
     */
    public void clear();
}
