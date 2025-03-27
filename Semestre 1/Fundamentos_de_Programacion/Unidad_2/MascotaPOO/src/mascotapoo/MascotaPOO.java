/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mascotapoo;

/**
 *
 * @author DELL
 */
public class MascotaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Mascotas mascotaSergio = new Mascotas("mateo",3,"perro");
        Mascotas mascotaPersona= new Mascotas();
        System.out.println(mascotaPersona.nombre + "tiene - "+mascotaPersona.edad+" anos  y es "+mascotaPersona.especie);
        System.out.println(mascotaSergio.nombre);
    }
    
}
