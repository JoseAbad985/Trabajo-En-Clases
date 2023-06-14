/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.estructuradedatosejemplo1.modelo;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author LAB-05
 */
public class ColaTareas<T> {
    private Queue<Tarea<T>> colaTareas;

    public ColaTareas(){
        colaTareas = new LinkedList<>();
    }
    
    public ColaTareas(Queue<Tarea<T>> colaTareas) {
        this.colaTareas = colaTareas;
    }
    
    public void agregarTarea(Tarea<T> tarea){
        colaTareas.offer(tarea);
    }
    
    public Tarea<T> procesarTarea(){
        Tarea<T> tareaProcesada = colaTareas.poll();
        return tareaProcesada;
    }
    
    public boolean estaVacia(){
        return colaTareas.isEmpty();
    }
    
    
}
