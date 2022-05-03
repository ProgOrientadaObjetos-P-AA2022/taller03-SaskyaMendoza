
package PaqueteUno;

public class EquipoCelular {
    
    private String sistemaOperativo;
    private String direccionMac;
    private String imei;
    private double tamanioPantalla;
    private double costoInicial;
    private double iva;
    private double ivaCostoInicial;
    private double costoFinal;
    
    
    
    public void establecerSistemaOperativo(String c){
        sistemaOperativo = c;
    }
    
    public void establecerDireccionMac(String c){
        direccionMac = c;
    }
    
    public void establecerImei(String c){
        imei = c;
    }
    
    public void establecerTamanioPantalla(double c){
        tamanioPantalla = c;
    }
    
    public void establecerCostoInicial(double c){
        costoInicial = c;
    }
    
    public void calcularIva(){
        iva = 12;
    }
    
    public void calcularIvaCostoInicial(){
        ivaCostoInicial = (costoInicial * (iva/100)) + costoInicial;
    }
    
    public void calcularCostoFinal(){
        costoFinal = costoInicial + ivaCostoInicial;
    }
    
    public String obtenerSistemaOperativo(){
        return sistemaOperativo;
    }
    
    public String obtenerDireccionMac(){
        return direccionMac;
    }
    
    public String obtenerImei(){
        return imei;
    }
    
    public double obtenerTamanioPantalla(){
        return tamanioPantalla;
    }
    
    public double obtenerCostoInicial(){
        return costoInicial;
    }
    
    public double obtenerIva(){
        return iva;
    }
    
    public double obtenerIvaCostoInicial(){
        return ivaCostoInicial;
    }
    
    public double obtenerCostoFinal(){
        return costoFinal;
    }
    
}
