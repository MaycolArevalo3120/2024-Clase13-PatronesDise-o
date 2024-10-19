/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clse13.patronesdediseño.decorador;

/**
 *
 * @author Maycol Arevalo
 */
public class HouseBlend extends Bebida{

    public HouseBlend() {
        descripccion = "House Blend";
    }

    @Override
    public double precio() {
        return 18.00;
    }
    
    
}
