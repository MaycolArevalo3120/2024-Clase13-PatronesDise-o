/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.clse13.patronesdediseño;

import pkg2024.clse13.patronesdediseño.observador.EstacionClima;
import pkg2024.clse13.patronesdediseño.observador.Insibume;
import pkg2024.clse13.patronesdediseño.observador.SmartPhone;

/**
 *
 * @author Maycol Arevalo
 */
public class Clse13PatronesDeDiseño {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        EstacionClima estacionClima = new EstacionClima();
        
        SmartPhone smartPhone = new SmartPhone(estacionClima);
        Insibume insibume = new Insibume(estacionClima);
        
        estacionClima.setMediciones(45, 13, 14);
        smartPhone.visualizar();
        insibume.visualizar();
        insibume.actualizar(90, 13, 14);
    }
    
}
