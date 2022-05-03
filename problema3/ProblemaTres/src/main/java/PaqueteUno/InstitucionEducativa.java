
package PaqueteUno;

public class InstitucionEducativa {
    
    private String nombre;
    private String tipo;
    private int alumnos;
    private int docentes;
    private int sedes;
    private double gastosEstudiante;
    private double presupuesto;
    
    
    public void establecerNombre(String c){
        nombre = c;
    }
    
    public void establecerTipo(String c){
        tipo = c;
    }
    
    public void establecerAlumnos(int c){
        alumnos = c;
    }
    
    public void establecerDocentes(int c){
        docentes = c;
    }
    
    public void establecerSedes(int c){
        sedes = c;
    }
    
    public void establecerGastosEstudiante(double c){
        gastosEstudiante = c;
    }
    
    public void calcularPresupuesto(){
        presupuesto = alumnos * gastosEstudiante;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
    
    public int obtenerAlumnos(){
        return alumnos;
    }
    
    public int obtenerDocentes(){
        return docentes;
    }
    
    public int obtenerSedes(){
        return sedes;
    }
    
    public double obtenerGastosEstudiante(){
        return gastosEstudiante;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }

    
}
