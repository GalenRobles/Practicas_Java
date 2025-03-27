/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa21;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char Enf;
        int dias;
        double edad, precio = 0, total;

        System.out.println("Ingresa tu tipo de enfermedad (A, B, C, D):");
        Enf = input.next().charAt(0);
        
        System.out.println("Ingresa el numero de dias en el hospital:");
        dias = input.nextInt();
        
        System.out.println("Ingresa tu edad:");
        edad = input.nextDouble();

        switch (Enf) {
            case 'A':
                precio = 2500;
                break;
            case 'B':
                precio = 1600;
                break;
            case 'C':
                precio = 2000;
                break;
            case 'D':
                precio = 3200;
                break;
            default:
                System.out.println("No existe esa categoria, lea bien.");
        }

        total = precio * dias;

        if (edad >= 14 && edad <= 22) {
            total = total * 1.10; 
        }

        System.out.println("Pagara un total de: $" + total);
    }
    //Robles Picazo Grecia Genesis
}




