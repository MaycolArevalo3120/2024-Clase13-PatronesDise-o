/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg2024.clse13.patronesdediseño.observador;

/**
 *
 * @author Maycol Arevalo
 */
public class Insibume implements Observador{
    private float temperatura;
    private float presion;
    private float humedad;
    private Sujetos Sujetos;

    public Insibume(Sujetos sujeto) {
        this.Sujetos = sujeto;
        sujeto.regitrarObservador(this);
    }    

    @Override
    public void actualizar(float temperatura, float humedad, float presion) {
        this.temperatura = temperatura;
        this.humedad = humedad;
        this.presion = presion;
    }
    
    public void visualizar(){
        System.out.println("----Insubume----\n"+"Condiciones Climaticas\n"+ 
                this.temperatura+ " Grados cCelcius,\n"+
                this.humedad+ " de humedad y\n"+
                this.presion+ " unidades de presín.");
    }
    
}
