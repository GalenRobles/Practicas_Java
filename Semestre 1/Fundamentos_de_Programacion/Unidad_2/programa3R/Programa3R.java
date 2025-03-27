/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa3r;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa3R {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("dame el costo del articulo");
        double cost =input.nextDouble();
        System.out.println("ingresa el pago");
        double pag=input.nextDouble();
        double cambio = pag-cost;
        System.out.println("tu cambio fue de "+cambio);
    }
    
}
