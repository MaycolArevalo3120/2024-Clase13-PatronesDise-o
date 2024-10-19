/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pkg2024.clse13.patronesdediseño.observador;

/**
 *
 * @author Maycol Arevalo
 */
public interface Sujetos {
    public void regitrarObservador(Observador o);
    public void eliminarObservador(Observador o);
    public void notificarObservadores();
            
    
}
