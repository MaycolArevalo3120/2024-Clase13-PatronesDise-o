/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clse13.patronesdediseño.decorador;

/**
 *
 * @author Maycol Arevalo
 */
public abstract class Bebida {
    String descripccion = "Bebida Desconocida";
    public String getDescripcion(){
        return descripccion;
    }
    
    public abstract double precio();
}
