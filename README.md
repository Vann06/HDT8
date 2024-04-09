# Gestor de Pacientes

Este programa es un gestor de pacientes que permite cargar una lista de pacientes desde un archivo de texto, agregar nuevos pacientes, mostrar la lista de pacientes y más. Permite al usuario seleccionar el tipo de estructura de datos para gestionar la lista de pacientes, ya sea utilizando Java Collection Framework o un VectorHeap personalizado.

## Funcionalidades

El programa ofrece las siguientes funcionalidades:

1. **Cargar Lista de Pacientes desde Archivo**
   - Permite cargar una lista de pacientes desde un archivo de texto predefinido (`pacientes.txt`).
   - Cada línea en el archivo debe tener el formato: `Nombre, Síntoma, Prioridad`.
   - La prioridad debe ser una letra entre A y E que indica la gravedad del paciente.

2. **Agregar Nuevo Paciente**
   - Permite al usuario agregar un nuevo paciente manualmente.
   - Se solicita ingresar el nombre del paciente, síntoma y prioridad (letra entre A y E).

3. **Mostrar Lista de Pacientes**
   - Muestra la lista actual de pacientes cargada en el sistema.
   - Muestra el nombre, síntoma y prioridad de cada paciente.

4. **Mostrar Siguiente Paciente en la Lista**
   - Mostrar y eliminar al paciente con mayor prioridad de la lista.

5. **Salir del Programa**
   - Salir

## Selección de Estructura de Datos

Al iniciar el programa, el usuario tiene la opción de elegir entre dos tipos de estructuras de datos para gestionar la lista de pacientes:

- **Java Collection Framework**
  - Utiliza una implementación estándar de `PriorityQueue` de Java.
  
- **VectorHeap**
  - Utiliza una implementación personalizada de una cola de prioridad utilizando un vector.

## Instrucciones de Uso

1. **Ejecutar el Programa**
   - Ejecuta el programa desde el entorno de desarrollo o mediante la línea de comandos.
   
2. **Seleccionar Tipo de Estructura de Datos**
   - Elige el tipo de estructura de datos deseado (1 para Java Collection Framework o 2 para VectorHeap).
   
3. **Interactuar con el Menú**
   - Selecciona las opciones del menú para cargar pacientes, agregar pacientes, mostrar la lista, etc.
   
4. **Salir del Programa**
   - Cuando hayas terminado, elige la opción para salir del programa.

## Requisitos del Sistema

- Java Runtime Environment (JRE) instalado en el sistema.

## Vianka Castro - 23201

