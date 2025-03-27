/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;

public class p5rograma20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("ingresa el sueldo ");
        double sue = input.nextDouble();
        
        System.out.print("Ingrese la categoria (1-4) ");
        int cat = input.nextInt();
        
        System.out.print("Ingresa tus horas extras ");
        int hr = input.nextInt();
        
        if (hr > 30) {
            hr = 30;
        }
        int phr;
        switch (cat) {
            case 1:
                phr = 180;
                break;
            case 2:
                phr = 100;
                break;
            case 3:
                phr = 120;
                break;
            case 4:
                phr = 150;
                break;
            default:
                phr = 0; 
        }
        
        double r = hr * phr;
        double total = sue + r;
        //Robles Picazo Grecia Genesis
        System.out.println("El sueldo total es: " + total);
    }
}
