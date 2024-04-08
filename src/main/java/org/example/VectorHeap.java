package org.example;
import java.util.Vector;
public class VectorHeap<E extends Comparable<E>> implements IPriorityQueue<Paciente> {

    Vector<E> data;
    @Override
    public void add(Paciente element) {

    }
    @Override
    public Paciente remove() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public Paciente getFirst() {
        return null;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public void clear() {
        data.removeAllElements();
    }
}
