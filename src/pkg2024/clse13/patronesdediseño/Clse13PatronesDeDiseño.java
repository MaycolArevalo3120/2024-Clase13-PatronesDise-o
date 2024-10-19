/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg2024.clse13.patronesdediseño;

import pkg2024.clse13.patronesdediseño.decorador.Bebida;
import pkg2024.clse13.patronesdediseño.decorador.CremaChatilli;
import pkg2024.clse13.patronesdediseño.decorador.Expresso;
import pkg2024.clse13.patronesdediseño.decorador.HouseBlend;
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
        System.out.println("-------------------------Ejercicio de medidor clima-------------------------");
        EstacionClima estacionClima = new EstacionClima();
        
        SmartPhone smartPhone = new SmartPhone(estacionClima);
        Insibume insibume = new Insibume(estacionClima);
        
        estacionClima.setMediciones(45, 13, 14);
        smartPhone.visualizar();
        insibume.visualizar();
        insibume.actualizar(90, 13, 14);
        
        
        System.out.println("\n-------------------------Ejercicio de Bebidas-------------------------");
        Bebida houseBlend = new HouseBlend();
        Bebida expresso = new Expresso();
        
        
        System.out.println(houseBlend.getDescripcion()+ " Precio: GTQ "+ houseBlend.precio());
        
        houseBlend  =  new CremaChatilli(houseBlend);
        System.out.println(houseBlend.getDescripcion()+ " Precio: GTQ "+ houseBlend.precio());
        
        System.out.println(expresso.getDescripcion()+ " Precio: GTQ "+ expresso.precio());
        expresso  =  new CremaChatilli(expresso);
        System.out.println(expresso.getDescripcion()+ " Precio: GTQ "+ expresso.precio());
    }
    
}
