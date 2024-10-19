/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clse13.patronesdediseño.observador;

import java.util.ArrayList;

/**
 *
 * @author Maycol Arevalo
 */
public class EstacionClima implements Sujetos{
    private float humedad;
    private float temperatura;
    private float presion;
    
    private ArrayList<Observador> obserbadores;

    public EstacionClima() {
        this.obserbadores = new ArrayList<>();
    }
    
    

    @Override
    public void regitrarObservador(Observador o) {
        this.obserbadores.add(o);
    }

    @Override
    public void eliminarObservador(Observador o) {
       int i= this.obserbadores.indexOf(o);
        if (i >= 0) {
            this.obserbadores.remove(i);
            
        }
    }

    @Override
    public void notificarObservadores() {
        for (int i = 0; i < this.obserbadores.size(); i++) {
            
           Observador observado = this.obserbadores.get(i);
           observado.actualizar(temperatura, humedad, presion);
        }
    }
    
    public void setMediciones(float humedad, float temperatura, float presion){
        this.humedad = humedad;
        this.temperatura = temperatura;
        this.presion = presion;
        notificarObservadores();
    }
    
    
}
