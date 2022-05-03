package PaqueteDos;

import PaqueteUno.Terreno;


public class Ejecutor {
 
    public static void main(String[] args) { 
        
        Terreno trn = new Terreno();
        
        double ancho = 60;
        double largo = 84;
        double valorMetroCuadrado = 2.70;
               
        trn.establecerAncho(ancho);
        trn.establecerLargo(largo);
        trn.calcularArea();
        trn.establecerValorMetroCuadrado(valorMetroCuadrado);
        trn.calcularCostoTerreno();
        
        
        System.out.printf("Terreno\n\nAnchoMetros: %.0f\n"
                + "LargoMetros: %.0f\nArea: %.0f\n"
                + "ValorMetroCuadrado: %.2f\n"
                +"CostoTerreno: $%.2f\n", trn.obtenerAncho(),
                trn.obtenerLargo(), trn.obtenerArea(),
                trn.obtenerValorMetroCuadrado(), trn.obtenerCostoTerreno());
        
    
    
    }
    
}

