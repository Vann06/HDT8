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

    /**
     * Constructor para crear un objeto Paciente con nombre, síntoma y prioridad especificados.
     *
     * @param nombre    El nombre del paciente.
     * @param sintoma   El síntoma del paciente.
     * @param prioridad La prioridad del paciente.
     */
    public Paciente(String nombre, String sintoma, String prioridad) {
        this.nombre = nombre;
        this.sintoma = sintoma;
        this.prioridad = prioridad;
    }
    /**
     * Método estático para crear un nuevo objeto Paciente.
     *
     * @param nombre    El nombre del paciente.
     * @param sintoma   El síntoma del paciente.
     * @param prioridad La prioridad del paciente.
     * @return Un nuevo objeto Paciente con los datos especificados.
     */
    public static Paciente crearPaciente(String nombre, String sintoma, String prioridad) {
        return new Paciente(nombre, sintoma, prioridad);
    }
    /**
     * Obtiene la prioridad del paciente.
     *
     * @return La prioridad del paciente.
     */
    public String getPrioridad(){
        return prioridad;
    }
    /**
     * Obtiene el nombre del paciente.
     *
     * @return El nombre del paciente.
     */
    public String getNombre(){
        return nombre;
    }
    /**
     * Obtiene el síntoma del paciente.
     *
     * @return El síntoma del paciente.
     */
    public String getSintoma(){
        return sintoma;
    }
    /**
     * Compara este paciente con otro paciente según su prioridad.
     *
     * @param pac El paciente con el que se va a comparar.
     * @return Un valor negativo si este paciente tiene una prioridad menor que el paciente dado,
     *         cero si tienen la misma prioridad, o un valor positivo si este paciente tiene una prioridad mayor.
     */
    public int compareTo(Paciente pac){
        return prioridad.compareTo(pac.getPrioridad());
    }
    /**
     * Devuelve una representación en cadena de este paciente.
     *
     * @return Una cadena que representa este paciente en el formato "nombre - sintoma - prioridad".
     */
    @Override
    public String toString(){
        return nombre + " - " + sintoma + " - " + prioridad;
    }
}
