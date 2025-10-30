/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb_2025_10_23_preproyecto;

import java.util.Random;

/**
 *
 * @author trcuser
 */
public class Nombres {
     Random  random = new Random();
     
    private  String [] nom={ "juan","yamilet","nancy","roberto","saul","andrea","veronica","alejandro","kenia","edwin","fabiola","armando","daniela","pedro","sofia"};
    private  String[] ape={"rodriguez","robles","chavez","martinez","cisena","onofre","picazo","vargas","cervantes","rico","garcia","rios","mendez"};
    public String nextNombre(){
        return nom[random.nextInt(nom.length)];
    }
    public   String nextApellido(){
        return ape[random.nextInt(ape.length)];
    }
    public  String nextNombreCorto(){
        return nextNombre()+" "+nextApellido();
    }
    public   String nextNombreCompleto(boolean dosNombres){
               String nombre="";

        if(dosNombres==true){
            nombre=nextNombre()+" ";
           
        }
         return nombre+" "+nextApellido();
    }
    public   String nextNombreFormal(){
        return nextApellido()+" "+nextApellido()+" "+nextNombre();
    }
}
