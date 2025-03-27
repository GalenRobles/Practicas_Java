/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa22;

import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Programa22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int min,clave;
        System.out.println("ingresa los minutos de tu llamada");
        min=input.nextInt();
        System.out.println("escribe la clave de la zona que deseas llamar: "
                + " America del norte (12)"
                + " America Central (15)"
                + " America del sur (18)"
                + " Europa (19)"
                + " Asia (23)"
                + " Africa(25)"
                + " Oceania(24)"
                 );
        clave=input.nextInt();
        double cost=0;
        switch(clave){
            case 12-> cost=2;    
            case 15->
                cost=2.2;
            case 18-> cost=4.5;
            case 19-> cost=3.5;
            case 23-> cost=6;
            case 25-> cost=6;
            case 24-> cost=5;
            default ->System.out.println("no existe esa categoria "+cost);        }
        double r=min*cost;
        System.out.println("el costo de tu llamada es de "+r);
    }
    //Robles Picazo Grecia Genesis
}


