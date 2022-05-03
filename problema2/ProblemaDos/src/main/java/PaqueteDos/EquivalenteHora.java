
package PaqueteDos;

public class EquivalenteHora {
    
    
    private int horas;
    private int minutos;
    private int segundos;
    private double dias;

    
    
    public void establecerHoras(int c){
        horas = c;
    }
    
    public void calcularMinutos(){
        minutos = horas * 60;
    }
    
    public void calcularDias(){
        dias = horas / 24;
    }
    
    public void calcularSegundos(){
        segundos = minutos * 60;
    }
    
    public int obtenerHoras(){
        return horas;
    }
    
    public int obtenerMinutos(){
        return minutos;
    }
    
    public double obtenerDias(){
        return dias;
    }
    
    public int obtenerSegundos(){
        return segundos;
    }
    


    
}

  
