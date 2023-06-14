/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.estructuradedatosejemplo1;

import com.mycompany.estructuradedatosejemplo1.modelo.ColaTareas;
import com.mycompany.estructuradedatosejemplo1.modelo.PilaTareas;
import com.mycompany.estructuradedatosejemplo1.modelo.Tarea;

/**
 *
 * @author LAB-05
 */
public class EstructuraDeDatosEjemplo1 {

    public static void main(String[] args) {
        System.out.println("Colas y Pilas implementacion generica!");
        //Instancias de las clases
        
        ColaTareas<String> colaTareas = new ColaTareas<>();
        ColaTareas<Integer> colaTareasInt = new ColaTareas<>();
        int[] a = {1, 2, 3, 4, 5, 6};
        int[] b = {1, 2, 3, 4, 5, 6};
        int[] c = {1, 2, 3, 4, 5, 6};
        ColaTareas<int[]> colaTareasArregloEnteros = new ColaTareas<>();
        String[] d = {"Hola","Soy","Si"};
        String[] e = {"Adios","No Soy","No"};
        String[] f = {"Silencio","Tal vez Soy","Tal vez"};
        ColaTareas<String[]> colaTareasArregloString = new ColaTareas<> ();
        
        //Clases PilaTarea
        PilaTareas<Integer> pilaTareas = new PilaTareas<>();
        PilaTareas<ColaTareas> pilaTareasDeColas = new PilaTareas<>();
        
        
        
        //Insercion de tareas a la Cola
        //String
        colaTareas.agregarTarea(new Tarea(1,"Tarea 1"));
        colaTareas.agregarTarea(new Tarea(2,"Tarea 2"));
        colaTareas.agregarTarea(new Tarea(3,"Tarea 3"));
        colaTareas.agregarTarea(new Tarea(4,"Tarea 4"));
        colaTareas.agregarTarea(new Tarea(5,"Tarea 5"));
        colaTareas.agregarTarea(new Tarea(6,"Tarea 6"));
        //Int
        colaTareasInt.agregarTarea(new Tarea(1,1));
        colaTareasInt.agregarTarea(new Tarea(2,2));
        colaTareasInt.agregarTarea(new Tarea(3,3));
        colaTareasInt.agregarTarea(new Tarea(4,4));
        colaTareasInt.agregarTarea(new Tarea(5,5));
        colaTareasInt.agregarTarea(new Tarea(6,6));
        //ArrayEnteros
        colaTareasArregloEnteros.agregarTarea(new Tarea(1,a));
        colaTareasArregloEnteros.agregarTarea(new Tarea(2,b));
        colaTareasArregloEnteros.agregarTarea(new Tarea(3, c));
        //ArrayString
        colaTareasArregloString.agregarTarea(new Tarea(1,d));
        colaTareasArregloString.agregarTarea(new Tarea(2,e));
        colaTareasArregloString.agregarTarea(new Tarea(3,f));
        
        //Insercion de tareas a la pila
        //Int
        pilaTareas.agregarTarea(new Tarea(6,6));
        pilaTareas.agregarTarea(new Tarea(7,7));
        pilaTareas.agregarTarea(new Tarea(8,8));
        //Colas
        pilaTareasDeColas.agregarTarea(new Tarea(9,colaTareas));
        pilaTareasDeColas.agregarTarea(new Tarea(10,colaTareasArregloEnteros));
        pilaTareasDeColas.agregarTarea(new Tarea(11,colaTareasArregloString));
        pilaTareasDeColas.agregarTarea(new Tarea(8,colaTareasInt));
        //pilaTareasDeColas.agregarTarea(new Tarea());
        
        while(!colaTareas.estaVacia()){
            Tarea<String> tareaProcesada = colaTareas.procesarTarea();
            
            System.out.println("Prosesando tarea de la cola: \n\t Sale ---> " + tareaProcesada.getId()+"--"+tareaProcesada.getAtributo());
        }
        
        while(!colaTareasInt.estaVacia()){
            Tarea<Integer> tareaProcesadaInt = colaTareasInt.procesarTarea();
            
            System.out.println("Prosesando tarea de la cola: \n\t Sale ---> " + tareaProcesadaInt.getId()+"--"+tareaProcesadaInt.getAtributo());
        }
        
        while(!colaTareasArregloEnteros.estaVacia()){
            Tarea<int[]> tareaProcesadaArregloEnteros = colaTareasArregloEnteros.procesarTarea();
            
            System.out.println("Prosesando tarea de la cola: \n\t Sale ---> " + tareaProcesadaArregloEnteros.toString());
        }
        
        while(!colaTareasArregloString.estaVacia()){
            Tarea<String[]> tareaProcesadaArregloString = colaTareasArregloString.procesarTarea();
            
            System.out.println("Prosesando tarea de la cola: \n\t Sale ---> " + tareaProcesadaArregloString.getId());
            
        //Print de pilas
        }
        while(!pilaTareasDeColas.estaVacia()){
            Tarea<ColaTareas>  tareaCola = pilaTareasDeColas.procesarTarea();
            tareaCola.getAtributo().procesarTarea();
            System.out.println("Prosesando tarea de la cola: \n\t Sale ---> " + tareaCola.getId()+"--"+tareaCola.getAtributo());
        }
    }
}
