package org.example;
/*
Facultad de Ingenieria
Departamento de Ciencias de la Computacion
Algoritmos y Estructura de Datos
HDT8

Vianka Castro - 23201

Clase paciente para almacenar toda la informacion necesaria de un paciente
 */

public class Paciente implements Comparable<Paciente>{
    String nombre;
    String sintoma;
    String prioridad;


    public Paciente(String nombre, String sintoma, String prioridad) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.prioridad = prioridad;
    }

    public String getPrioridad(){
        return prioridad;
    }

    public String getNombre(){
        return nombre;
    }

    public String getSintoma(){
        return sintoma;
    }

    public int compareTo(Paciente pac){
        return prioridad.compareTo(pac.getPrioridad());
    }

    @Override
    public String toString(){
        return nombre + " - " + sintoma + " - " + prioridad;
    }
}
