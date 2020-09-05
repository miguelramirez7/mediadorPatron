/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.mediadorp;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ConcretMediador implements IMediador{
    private ArrayList<ConcretCliente> clientes;
    
    public ConcretMediador() {
        this.clientes = new ArrayList<ConcretCliente>();
    }
    
    public void agregarCliente(ConcretCliente cliente){
        this.clientes.add(cliente);
    }
    @Override
    public void enviarMensaje(String mensaje) {
        for (ConcretCliente cliente : clientes) {
            cliente.recibirMensaje(mensaje);
            
        }
    }
    
    
}
