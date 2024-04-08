package org.example;
import java.util.Vector;
/*
Facultad de Ingenieria
Departamento de Ciencias de la Computacion
Algoritmos y Estructura de Datos
HDT8

Vianka Castro - 23201

Clase VectorHeap que implementa una cola de prioridad utilizando un heap representado con un Vector.

 @param <E> el tipo de elementos que se almacenarán en el heap, debe ser Comparable
 */
import java.util.Vector;

public class VectorHeap<E extends Comparable<E>> implements IPriorityQueue<E> {

    private Vector<E> pila;
    /**
     * Constructor que crea un nuevo VectorHeap vacío.
     */
    public VectorHeap() {  /**
     * Método privado para reordenar el heap hacia arriba a partir de un índice dado.
     *
     * @param hijo el índice del hijo desde el cual comenzar a tamizar hacia arriba.
     */
        pila = new Vector<>();
    }
    /**
     * Constructor que crea un nuevo VectorHeap a partir de un Vector dado.
     *
     * @param v Vector inicial que se utilizará para inicializar el VectorHeap.
     */
    public VectorHeap(Vector<E> v) {
        pila = new Vector<>(v);
    }
    /**
     * Agrega un elemento al VectorHeap y reordena el heap para mantener la propiedad del heap.
     *
     * @param element el elemento a agregar al VectorHeap.
     */
    @Override
    public void add(E element) {
        pila.add(element);
        tamizarArriba(pila.size() - 1);
    }
    /**
     * Método privado para reordenar el heap hacia arriba a partir de un índice dado.
     *
     * @param hijo el índice del hijo desde el cual comenzar a tamizar hacia arriba.
     */
    private void tamizarArriba(int hijo) {
        E item = pila.get(hijo);
        while (hijo > 0) {
            int padre = (hijo - 1) / 2;
            E parent = pila.get(padre);
            if (item.compareTo(parent) >= 0) {
                break;
            }
            pila.set(hijo, parent);
            hijo = padre;
        }
        pila.set(hijo, item);
    }

    /**
     * Elimina y devuelve el elemento con la prioridad más alta del VectorHeap.
     *
     * @return el elemento con la prioridad más alta en el VectorHeap, o null si el heap está vacío.
     */
    @Override
    public E remove() {
        if (pila.isEmpty()) {
            return null;
        }
        E removedItem = pila.firstElement();
        E lastItem = pila.remove(pila.size() - 1);
        if (!pila.isEmpty()) {
            pila.set(0, lastItem);
            tamizarAbajo(0);
        }
        return removedItem;
    }
    /**
     * Método privado para reordenar el heap hacia abajo a partir de un índice dado.
     *
     * @param padre el índice del padre desde el cual comenzar a tamizar hacia abajo.
     */
    private void tamizarAbajo(int padre) {
        int heapSize = pila.size();
        E item = pila.get(padre);
        while (padre < heapSize) {
            int izq = 2 * padre + 1;
            if (izq >= heapSize) {
                break;
            }
            int der = izq + 1;
            int minimo = izq;
            if (der < heapSize && pila.get(der).compareTo(pila.get(izq)) < 0) {
                minimo = der;
            }
            if (pila.get(minimo).compareTo(item) >= 0) {
                break;
            }
            pila.set(padre, pila.get(minimo));
            padre = minimo;
        }
        pila.set(padre, item);
    }
    /**
     * Verifica si el VectorHeap está vacío.
     *
     * @return true si el VectorHeap está vacío, false de lo contrario.
     */
    @Override
    public boolean isEmpty() {
        return pila.isEmpty();
    }

    /**
     * Obtiene el elemento con la prioridad más alta en el VectorHeap sin eliminarlo.
     *
     * @return el elemento con la prioridad más alta en el VectorHeap, o null si el heap está vacío.
     */
    @Override
    public E getFirst() {
        if (pila.isEmpty()) {
            return null;
        }
        return pila.firstElement();
    }

    /**
     * Obtiene el número de elementos en el VectorHeap.
     *
     * @return el número de elementos en el VectorHeap.
     */
    @Override
    public int size() {
        return pila.size();
    }

    /**
     * Elimina todos los elementos del VectorHeap.
     */
    @Override
    public void clear() {
        pila.clear();
    }
    /**
     * Método privado para construir el heap a partir de los elementos existentes en el Vector.
     */
    private void construirHeap() {
        for (int i = pila.size() / 2 - 1; i >= 0; i--) {
            tamizarAbajo(i);
        }
    }
}
