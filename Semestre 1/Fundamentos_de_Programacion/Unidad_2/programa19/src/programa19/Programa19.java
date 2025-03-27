/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa19;

import java.util.Scanner;

public class Programa19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Dame el monto de la compra: ");
        double monto = input.nextDouble();
        double descuento = 0;
        
        if (monto > 15000) {
            descuento = 0.25;
        } else if (monto > 7000) {
            descuento = 0.18;
        } else if (monto > 1000) {
            descuento = 0.11;
        } else if (monto >= 500) {
            descuento = 0.05;
        }
        
        double total = monto - (monto * descuento);
        
        if (descuento > 0) {
            System.out.println("Tu descuento fue de " + (int)(descuento * 100) + "%: " + total);
        } else {
            System.out.println("No tiene descuento: " + monto);
        }
    }
    //Robles Picazo Grecia Genesis
}
