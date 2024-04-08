package org.example;
/*
Facultad de Ingenieria
Departamento de Ciencias de la Computacion
Algoritmos y Estructura de Datos
HDT8

Vianka Castro - 23201

Clase JCK para el priorityQueue implementado por Java Collection Framework
 */
import java.util.Comparator;
import java.util.PriorityQueue;

public class JCF implements IPriorityQueue<Paciente> {

    private PriorityQueue<Paciente> priorityQueue;

    public JCF() {
        this.priorityQueue = new PriorityQueue<>(Comparator.comparing(Paciente::getPrioridad));
    }
    @Override
    public void add(Paciente element) {
        priorityQueue.add(element);
    }

    @Override
    public Paciente remove() {
        return priorityQueue.poll();
    }

    @Override
    public boolean isEmpty() {
        return priorityQueue.isEmpty();
    }

    @Override
    public Paciente getFirst() {
        return priorityQueue.peek();
    }

    @Override
    public int size() {
        return priorityQueue.size();
    }

    @Override
    public void clear() {
        priorityQueue.clear();
    }
}

