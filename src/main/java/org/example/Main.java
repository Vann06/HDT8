package org.example;
/*
Facultad de Ingenieria
Departamento de Ciencias de la Computacion
Algoritmos y Estructura de Datos
HDT8

Vianka Castro - 23201

Clase Main para interactuar
 */

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IPriorityQueue<Paciente> pacienteQueue;
        List<Paciente> pacientes = new ArrayList<>();

        System.out.println("Bienvenido al gestor de pacientes!");
        System.out.println("Seleccion el tipo de Queue que desea utilizar:");
        System.out.println("1. Java Collection Framework \n2. VectorHeap");
        int opcion = scanner.nextInt();
        scanner.nextLine();

        switch (opcion) {
            case 1:
                pacienteQueue = new JCF();
                System.out.println("ha seleccionado JavaCollectionFramework");
                break;
            case 2:
                pacienteQueue = new VectorHeap();
                System.out.println("ha seleccionado Vector Heap");
                break;
            default:
                System.out.println("Opción no válida. Saliendo del programa.");
                return;
        }

        boolean continuar = true;
        while (continuar) {

            System.out.println("¿Qué acción desea realizar?");
            System.out.println("1. Cargar lista de pacientes");
            System.out.println("2. Agregar paciente a la lista");
            System.out.println("3. Mostrar lista de pacientes");
            System.out.println("4. Mostar siguiente paciente en la lista");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int eleccion = scanner.nextInt();
            scanner.nextLine();

            switch (eleccion) {

                case 1:
                    cargarPacientesDesdeArchivo(pacienteQueue, pacientes);
                    System.out.println("--------------------------");
                    System.out.println("Lista de pacientes cargada correctamente.");
                    System.out.println("--------------------------");

                    break;
                case 2:
                    System.out.println(" ** Agregar paciente a la lista **");
                    System.out.print("Nombre del paciente: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Descripción del síntoma: ");
                    String sintoma = scanner.nextLine();
                    System.out.print("Código de emergencia (A-E): ");
                    String prioridad = scanner.nextLine().toUpperCase();

                    if (!prioridad.matches("[ABCDE]")) {
                        System.out.println("ERROR Debe ser una letra entre A y E.");
                        break;
                    }
                    Paciente nuevoPaciente = Paciente.crearPaciente(nombre, sintoma, prioridad);
                    pacientes.add(nuevoPaciente);
                    pacienteQueue.add(nuevoPaciente);
                    System.out.println("--------------------------");
                    System.out.println("Paciente agregado correctamente.");
                    System.out.println("--------------------------");
                    break;
                case 3:
                    System.out.println("Mostrando lista de pacientes:");
                    System.out.println("--------------------------");

                    if (pacientes.isEmpty()) {
                        System.out.println("Lista de pacientes está vacía!");
                        System.out.println("--------------------------");
                    } else {
                        for (Paciente paciente : pacientes) {
                            System.out.println("Nombre: " + paciente.getNombre());
                            System.out.println("Síntoma: " + paciente.getSintoma());
                            System.out.println("Prioridad: " + paciente.getPrioridad());
                            System.out.println("--------------------------");
                        }
                    }
                    break;
                case 4:
                    if (pacienteQueue.isEmpty()) {
                        System.out.println("--------------------------");
                        System.out.println("No hay pacientes en la lista.");
                        System.out.println("--------------------------");
                    } else {
                        Paciente siguientePaciente = pacienteQueue.getFirst();
                        if (siguientePaciente != null) {
                            System.out.println("Siguiente paciente en la lista:");
                            System.out.println("--------------------------");
                            System.out.println("Nombre: " + siguientePaciente.getNombre());
                            System.out.println("Síntoma: " + siguientePaciente.getSintoma());
                            System.out.println("Prioridad: " + siguientePaciente.getPrioridad());
                            System.out.println("--------------------------");

                            System.out.println("\n¿Desea atender a este paciente? (S/N)");
                            String respuesta = scanner.nextLine().trim().toUpperCase();

                            if (respuesta.equals("S")) {
                                Paciente pacienteAtendido = pacienteQueue.remove();
                                pacientes.remove(pacienteAtendido);
                                System.out.println("Se ha atendido al paciente: " + pacienteAtendido.getNombre());
                            } else if (respuesta.equals("N")) {
                                System.out.println("No se ha atendido al paciente.");
                            } else {
                                System.out.println("Respuesta no válida. No se realizará ninguna acción.");
                            }
                        } else {
                            System.out.println("No se pudo obtener el siguiente paciente.");
                        }
                    }
                    break;
                default:
                    System.out.println("Opción no válida.");
            }
        }
        System.out.println("Gracias por usar el gestor de pacientes.");
    }


    private static void cargarPacientesDesdeArchivo(IPriorityQueue<Paciente> pacienteQueue,List<Paciente> pacientes) {
        InputStream inputStream = Main.class.getClassLoader().getResourceAsStream("pacientes.txt");
        Scanner scanner = new Scanner(inputStream);
        if(inputStream == null){
            throw new IllegalArgumentException("Archivo no encontrado");
        }
        try{
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();
                String[] data = line.split(",");
                if(data.length < 3){
                    System.out.println("Linea no valida " + line);
                    continue;
                }
                Paciente paciente = new Paciente(data[0].trim(), data[1].trim(), data[2].trim());
                pacienteQueue.add(paciente);
                pacientes.add(paciente);
            }
        }finally{
            scanner.close();
        }
    }
}


