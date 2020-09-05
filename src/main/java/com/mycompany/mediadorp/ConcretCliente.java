/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mediadorp;

/**
 *
 * @author User
 */
public class ConcretCliente implements ComponentCliente{
    
    private String nombre;
    private IMediador mediador;
    
    public ConcretCliente(IMediador mediador,String nombre) {
        this.mediador = mediador;
        this.nombre=nombre;
    }
    
    //cuando cambia de estado se le tiene q notificar a todos los q tiene el mediador
    public void cambieNombre(String nombre){
       
        this.mediador.enviarMensaje(this.nombre+" cambio a: "+nombre);
    }
    
    @Override
    public void recibirMensaje(String mensaje) {
        System.out.println(this.nombre + " recibio mensaje: " + mensaje);
    }
    
}
