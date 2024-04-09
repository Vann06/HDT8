package org.example;

import org.example.Paciente;
import org.example.VectorHeap;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class VectorHeapTest {

    private VectorHeap<Paciente> vectorHeap;

    @Before
    public void setUp() {
        vectorHeap = new VectorHeap<>();
    }

    @Test
    public void testAddAndSize() {
        assertTrue(vectorHeap.isEmpty());
        assertEquals(0, vectorHeap.size());

        Paciente paciente1 = new Paciente("Ricardo", "Fractura", "A");
        vectorHeap.add(paciente1);

        assertFalse(vectorHeap.isEmpty());
        assertEquals(1, vectorHeap.size());

        Paciente paciente2 = new Paciente("Vianka", "Alergia", "D");
        vectorHeap.add(paciente2);

        assertEquals(2, vectorHeap.size());
    }

    @Test
    public void testGetFirst() {
        assertTrue(vectorHeap.isEmpty());
        assertNull(vectorHeap.getFirst());

        Paciente paciente1 = new Paciente("Ricardo", "Fractura", "A");
        vectorHeap.add(paciente1);

        assertEquals(paciente1, vectorHeap.getFirst());

        Paciente paciente2 = new Paciente("Vianka", "Alergia", "D");
        vectorHeap.add(paciente2);

        assertEquals(paciente1, vectorHeap.getFirst());
    }

    @Test
    public void testRemoveAndIsEmpty() {
        assertTrue(vectorHeap.isEmpty());
        assertNull(vectorHeap.remove());

        Paciente paciente1 = new Paciente("Ricardo", "Fractura", "A");
        vectorHeap.add(paciente1);

        assertFalse(vectorHeap.isEmpty());

        Paciente removedPaciente = vectorHeap.remove();

        assertEquals(paciente1, removedPaciente);
        assertTrue(vectorHeap.isEmpty());
    }

    @Test
    public void testClear() {
        assertTrue(vectorHeap.isEmpty());

        Paciente paciente1 = new Paciente("Ricardo", "Fractura", "A");
        vectorHeap.add(paciente1);

        assertFalse(vectorHeap.isEmpty());

        vectorHeap.clear();

        assertTrue(vectorHeap.isEmpty());
        assertEquals(0, vectorHeap.size());
        assertNull(vectorHeap.getFirst());
    }
}
