package org.example;
/*
Facultad de Ingenieria
Departamento de Ciencias de la Computacion
Algoritmos y Estructura de Datos
HDT8

Vianka Castro - 23201

Interface
 */
public interface IPriorityQueue<E extends Comparable<E>> {
    void add(E element);
    E remove();
    boolean isEmpty();
    public E getFirst();
    public int size();
    public void clear();
}
