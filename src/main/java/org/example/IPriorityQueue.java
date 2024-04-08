package org.example;

public interface IPriorityQueue<E extends Comparable<E>> {
    void add(E element);
    E remove();
    boolean isEmpty();
    public E getFirst();
    public int size();
    public void clear();
}
