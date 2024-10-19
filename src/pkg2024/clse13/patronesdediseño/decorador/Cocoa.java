/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clse13.patronesdediseño.decorador;

/**
 *
 * @author Maycol Arevalo
 */
public class Cocoa extends Decorador{

    private Bebida bebida;
    
    public Cocoa(Bebida bebida) {
     this.bebida = bebida;
    }
    
    

    @Override
    public String getDescripcion() {
        return bebida.getDescripcion()+", Cocoa";
    }

    @Override
    public double precio() {
        return bebida.precio() + 3.00;
    }
    
}
