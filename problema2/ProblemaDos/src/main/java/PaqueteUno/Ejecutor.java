package PaqueteUno;


import PaqueteDos.EquivalenteHora;

public class Ejecutor {
    
    public static void main(String[] args) {
        
        
        EquivalenteHora hr = new EquivalenteHora();
        
        int horas = 60;
  
               
        hr.establecerHoras(horas);
        hr.calcularMinutos();
        hr.calcularDias();
        hr.calcularSegundos();
        
        
        System.out.printf("Horas:%6d\nMinutos:%6d\nSegundos:%7d\nDias:%6.0f\n", hr.obtenerHoras(), hr.obtenerMinutos(), hr.obtenerSegundos(), hr.obtenerDias());
                
               
         
    }

    
}
