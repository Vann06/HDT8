package org.example;
import java.util.Scanner;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        IPriorityQueue<Paciente> pacienteQueue;

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


    }


}
