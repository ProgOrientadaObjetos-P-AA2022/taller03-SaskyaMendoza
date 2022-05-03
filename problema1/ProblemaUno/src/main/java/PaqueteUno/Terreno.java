package PaqueteUno;


public class Terreno {
    
    private double costoTerreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;
    
    
    public void establecerAncho(double c){
        ancho = c;
    }
    
    public void establecerLargo(double c){
        largo = c;
    }
    
    public void calcularArea(){
        area = ancho * largo;
    }
    
    public void establecerValorMetroCuadrado(double c){
        valorMetroCuadrado = c;
    }
    
    public void calcularCostoTerreno(){
        costoTerreno = valorMetroCuadrado * area;
    }
    
    public double obtenerCostoTerreno(){
        return costoTerreno;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetroCuadrado;
    }


    
}
