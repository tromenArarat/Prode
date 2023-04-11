/*

 */
package Servicios;

import Entidades.Partido;


public class PartidoServicio {
    // Método para crear partido que cargue fecha, local y visitante, y orden
    // En este método va a estar cargado el fixture del campeonato con dos for anidados
    
    // El fixture tiene 27 filas por las 27 fechas y 14 columnas por los 14 partidos de la fecha.
    
    public Partido crearPartido(){
        String fixtureFecha[][] = new String[27][14];
        String local = "";
        String visitante = "";
        int fecha = 0;
        int orden = 0;
        for (int i = 0; i < fixtureFecha.length; i++) {
            for (int j = 0; j < fixtureFecha[0].length; j++) {
                if(i==10 && j==0){
                    local = "Central Córdoba";
                    visitante = "Lanus";
                    fecha = 11;
                    orden = 1;
                    fixtureFecha[i][j] = local +" Vs. "+ visitante;
                }else{
                    fixtureFecha[i][j] = "VACIO";
                }
            }
        }
        return new Partido(local,visitante,fecha,orden);
    }
}