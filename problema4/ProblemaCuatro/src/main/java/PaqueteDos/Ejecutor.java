
package PaqueteDos;

import PaqueteUno.EquipoCelular;

public class Ejecutor {

    public static void main(String[] args) {
       
        
        EquipoCelular cel1 = new EquipoCelular();
        
        String sistemaOperativo = "Android";
        String direccionMac = "d2:5c:dd:8d";
        String imei = "357503040704274";
        double tamanioPantalla = 5.1;
        double costoInicial = 550;
        double iva;
        double ivaCostoInicial;
        double costoFinal;
        
        
        cel1.establecerSistemaOperativo(sistemaOperativo);
        cel1.establecerDireccionMac(direccionMac);
        cel1.establecerImei(imei);
        cel1.establecerTamanioPantalla(tamanioPantalla);
        cel1.establecerCostoInicial(costoInicial);
        cel1.calcularIva();
        cel1.calcularIvaCostoInicial();
        cel1.calcularCostoFinal();
        
        
        EquipoCelular cel2 = new EquipoCelular();
        
        sistemaOperativo = "iOS";
        direccionMac = "78:6c:38:8d:36:dd";
        imei = "528901240706274";
        tamanioPantalla = 6.1;
        costoInicial = 910;
        
        cel2.establecerSistemaOperativo(sistemaOperativo);
        cel2.establecerDireccionMac(direccionMac);
        cel2.establecerImei(imei);
        cel2.establecerTamanioPantalla(tamanioPantalla);
        cel2.establecerCostoInicial(costoInicial);
        cel2.calcularIva();
        cel2.calcularIvaCostoInicial();
        cel2.calcularCostoFinal();
        
        System.out.printf("EquipoCelular1: \n\nSistemaOperativo: %2s\n"
                + "DirecciónMAC: %15s\nIMEI: %27s\n"
                + "TamañoDePantalla: %.2f\n"
                + "CostoInicial: %10.2f\n"
                + "iva: %18.2f\n"
                + "--------------------\nIvaCostoInicial: %.2f\n"
                + "CostoFinal: %12.2f\n\n", cel1.obtenerSistemaOperativo(), cel1.obtenerDireccionMac(), cel1.obtenerImei(), cel1.obtenerTamanioPantalla(), cel1.obtenerCostoInicial(), cel1.obtenerIva(), cel1.obtenerIvaCostoInicial(), cel1.obtenerCostoFinal());
        
        System.out.printf("EquipoCelular2: \n\nSistemaOperativo: %2s\n"
                + "DirecciónMAC: %21s\nIMEI: %27s\n"
                + "TamañoDePantalla: %.2f\n"
                + "CostoInicial: %10.2f\n"
                + "iva: %18.2f\n"
                + "--------------------\nIvaCostoInicial: %.2f\n"
                + "CostoFinal: %12.2f\n\n", cel2.obtenerSistemaOperativo(), cel2.obtenerDireccionMac(), cel2.obtenerImei(), cel2.obtenerTamanioPantalla(), cel2.obtenerCostoInicial(), cel2.obtenerIva(), cel2.obtenerIvaCostoInicial(), cel2.obtenerCostoFinal());
        
    }
    
}
