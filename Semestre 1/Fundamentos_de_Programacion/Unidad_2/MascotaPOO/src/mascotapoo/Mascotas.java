/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mascotapoo;

/**
 *
 * @author DELL
 */
public class Mascotas {

    
    String nombre;
    int edad;
    String especie;
    
    //Constructor para nuevo objeto de forma constante asignado de forma constante
    public Mascotas(String nombre, int edad, String especie) {
        this.nombre=nombre;
        this.edad=edad;
        this.especie=especie;
    }
    //Constructor por defecto
    Mascotas(){
        this.nombre ="Desconocido";
        this.edad = 0 ;
        this.especie= "Desconocida";
    }
    //Constructor de copia
    Mascotas(Mascotas mascotaCopia){
        this.nombre = mascotaCopia.nombre;
        this.edad= mascotaCopia.edad;
        this.especie= mascotaCopia.especie;
    }
   public void ladrar(){
       System.out.println("Guau!");
   }
    
}
