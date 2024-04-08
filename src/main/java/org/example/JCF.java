package org.example;

import java.util.Comparator;
import java.util.PriorityQueue;

public class JCF implements IPriorityQueue<Paciente> {
    private PriorityQueue<Paciente> priorityQueue;
    private Comparator<Paciente> comparator;
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

