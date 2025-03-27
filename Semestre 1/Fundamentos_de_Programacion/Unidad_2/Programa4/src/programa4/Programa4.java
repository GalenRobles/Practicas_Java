/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input  = new Scanner(System.in);
        String nom;
        double pies,longi,peso,altura;
        System.out.println("dime tu nombre ");
        nom=input.nextLine();
        System.out.println("dame tu peso ");
        pies=input.nextDouble();
        System.out.println("dame tu estatura ");
        longi=input.nextDouble();
        peso=pies*.454;
        altura=longi*.3047;
        System.out.println(nom+"tu peso es de "+peso+" kg  y tu altura es de "+altura);
        //Robles Picazo Grecia Genesis
        
               
    }
    
}
