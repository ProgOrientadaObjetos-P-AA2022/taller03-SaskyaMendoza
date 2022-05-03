
package PaqueteDos;

import PaqueteUno.InstitucionEducativa;

public class Ejecutor {

    public static void main(String[] args) {
        InstitucionEducativa edu1 = new InstitucionEducativa();
        
        String nombre = "Mater Dei";
        String tipo = "Fiscomisional";
        int alumnos = 12000;
        int docentes = 53;
        int sedes = 90;
        double gastosEstudiante = 35;
        double presupuesto;
        
        
        edu1.establecerNombre(nombre);
        edu1.establecerTipo(tipo);
        edu1.establecerAlumnos(alumnos);
        edu1.establecerDocentes(docentes);
        edu1.establecerSedes(sedes);
        edu1.establecerGastosEstudiante(gastosEstudiante);
        edu1.calcularPresupuesto();
        
        
        InstitucionEducativa edu2 = new InstitucionEducativa();
        
        nombre = "La Porciuncula";
        tipo = "Privada";
        alumnos = 2000;
        docentes = 30;
        sedes = 50;
        gastosEstudiante = 80;
        presupuesto = 0;
        
        edu2.establecerNombre(nombre);
        edu2.establecerTipo(tipo);
        edu2.establecerAlumnos(alumnos);
        edu2.establecerDocentes(docentes);
        edu2.establecerSedes(sedes);
        edu2.establecerGastosEstudiante(gastosEstudiante);
        edu2.calcularPresupuesto();
        
        
        System.out.printf("Institucion1: \n\nNombre: %19s\n"
                + "Tipo: %25s\nNumeroDeAlumnos: %6d\n"
                + "NumeroDeDocentes: %d\n"
                + "NumeroDeSedes: %5d\n"
                + "--------------------\nGastosPorEstudiante: %.2f\n"
                + "Presupuesto: %17.2f\n\n", edu1.obtenerNombre(), edu1.obtenerTipo(), edu1.obtenerAlumnos(), edu1.obtenerDocentes(), edu1.obtenerSedes(), edu1.obtenerGastosEstudiante(), edu1.obtenerPresupuesto());
        
        System.out.printf("\nInstitucion2: \n\nNombre: %25s\n"
                + "Tipo: %20s\nNumeroDeAlumnos: %6d\n"
                + "NumeroDeDocentes: %3d\n"
                + "NumeroDeSedes: %6d\n"
                + "--------------------\nGastosPorEstudiante: %.2f\n"
                + "Presupuesto: %17.2f\n", edu2.obtenerNombre(), edu2.obtenerTipo(), edu2.obtenerAlumnos(), edu2.obtenerDocentes(), edu2.obtenerSedes(), edu2.obtenerGastosEstudiante(), edu2.obtenerPresupuesto());
    }
    
}
