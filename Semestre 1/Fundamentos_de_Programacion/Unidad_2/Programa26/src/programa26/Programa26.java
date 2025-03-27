/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa26;

import java.util.Scanner;

public class Programa26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int tipo, mens=0;
        double cosT = 0, mont, cos, desc = 0, interes = 0;
        String form;
        System.out.println("Ingresa el tipo de cliente: 1) Normal 2) Plus 3) Platino");
        tipo = input.nextInt();
        System.out.println("Ingresa el monto de la compra:");
        mont = input.nextDouble();
        switch (tipo) {
            case 1:
                desc = 0;
                break;
            case 2:
                if (mont > 5000) desc = 0.15;
                else if (mont > 3000) desc = 0.10;
                else if (mont > 1000) desc = 0.05;
                break;
            case 3:
                if (mont > 5000) desc = 0.20;
                else if (mont > 3000) desc = 0.15;
                else if (mont > 1000) desc = 0.10;
                break;
            default:
                System.out.println("No existe ese tipo de cliente.");
                return;
        }
        cos = mont - (desc * mont);
        System.out.println("Tu forma de pago es al contado o a credito?");
        form = input.next();

        if (form.equalsIgnoreCase("contado")) {
            cosT = cos - (cos * 0.10);
        } 
        else if (form.equalsIgnoreCase("credito")) {
            if (mont > 1000) {
                System.out.println("Elige tus mensualidades 3,6,9,12");
                mens = input.nextInt();
                
                switch (mens) {
                    case 3:
                        cosT = cos / 3;
                        break;
                    case 6:
                    case 9:
                    case 12:
                        cosT = cos / mens;
                        interes = cosT * 0.05;
                        cosT += interes;
                        break;
                    default:
                        System.out.println("Tu numero de meses es invalido.");
                        return;
                }
            } else {
                System.out.println("No aplicas para credito.");
                return;
            }
        } 
        else {
            System.out.println("Forma de pago no valida.");
            return;
        }

        System.out.println("Tu monto total de compra es $" + mont);
        System.out.println("Tu monto con descuento es $" + cos);
        if (form.equalsIgnoreCase("credito")) {
            System.out.println("Pago mensual por " + (mens) + " meses $" + cosT);
        } else {
            System.out.println("Total a pagar en contado $" + cosT);
        }
    }
    //Robles Picazo Grecia Genesis
}


