/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa7;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double r,a,area,vol,pi;
        pi=3.1416;
        System.out.println("dame el radio del cilindro ");
        r=input.nextDouble();
        System.out.println("dame la altura ");
        a=input.nextDouble();
        area=2*pi*r*a;
        vol=pi*(Math.pow(r,2)*a);
        System.out.println("tu area es de "+area+" tu volumen es de "+vol);
        //Robles Picazo Grecia Genesis
        
    }
    
}
