/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa9;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double cat,hip,b;
        System.out.println("dame el cateto");
        cat=input.nextDouble();
        System.out.println("dame la hipotenusa");
        hip=input.nextDouble();
        b=(Math.sqrt(Math.pow(hip,2)-(Math.pow(cat,2))));
        System.out.println("el valor de cateto b es de "+b);
        //Robles Picazo Grecia Genesis
    }
    
}
