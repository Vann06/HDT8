package org.example;
/*
Facultad de Ingenieria
Departamento de Ciencias de la Computacion
Algoritmos y Estructura de Datos
HDT8

Vianka Castro - 23201

Clase que implementa una cola de prioridad utilizando PriorityQueue del Java Collections Framework (JCF).
Los elementos se ordenan según la prioridad definida por el método getPrioridad de la clase Paciente.
 */
import java.util.Comparator;
import java.util.PriorityQueue;

public class JCF implements IPriorityQueue<Paciente> {

    private PriorityQueue<Paciente> priorityQueue;

    public JCF() {
        this.priorityQueue = new PriorityQueue<>(Comparator.comparing(Paciente::getPrioridad));
    }
    /**
     * Agrega un elemento a la cola de prioridad.
     *
     * @param element el elemento a agregar a la cola de prioridad.
     */
    @Override
    public void add(Paciente element) {
        priorityQueue.add(element);
    }
    /**
     * Elimina y devuelve el elemento con la prioridad más alta de la cola de prioridad.
     *
     * @return el elemento con la prioridad más alta en la cola de prioridad.
     */
    @Override
    public Paciente remove() {
        return priorityQueue.poll();
    }
    /**
     * Verifica si la cola de prioridad está vacía.
     *
     * @return true si la cola de prioridad está vacía, false de lo contrario.
     */
    @Override
    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }
    /**
     * Obtiene el elemento con la prioridad más alta en la cola de prioridad sin eliminarlo.
     *
     * @return el elemento con la prioridad más alta en la cola de prioridad.
     */
    @Override
    public Paciente getFirst() {
        return priorityQueue.peek();
    }
    /**
     * Obtiene el número de elementos en la cola de prioridad.
     *
     * @return el número de elementos en la cola de prioridad.
     */
    @Override
    public int size() {
        return priorityQueue.size();
    }

    /**
     * Elimina todos los elementos de la cola de prioridad.
     */
    @Override
    public void clear() {
        priorityQueue.clear();
    }
}

