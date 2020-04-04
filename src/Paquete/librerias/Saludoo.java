/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paquete.librerias;

/**
 *
 * @author Batman
 */
public class Saludoo {
    String Nombre;

    public Saludoo(String Nombre) {
        this.Nombre= Nombre;
    }
    
    public String Mensaje(){
        return("Bienvenido " + Nombre + ", estamos usando librerias");
    }
    
    
}
