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
public class pruebaMediador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ConcretMediador admin = new ConcretMediador();
        
        //creamos los clientes y q tengan a su mediador
        ConcretCliente cl1 = new ConcretCliente(admin,"miguel");
        ConcretCliente cl2 = new ConcretCliente(admin,"marcos");
        
        //agregamos los clientes para enviar
        admin.agregarCliente(cl1);
        admin.agregarCliente(cl2);
        
        cl1.cambieNombre("juan");
        
    }
    
}
