/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa23;

import java.util.Scanner;

/**
 *
 * @author aa509
 */
public class Programa23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double a=0;
        int tipo;
        System.out.println("ingresa el tipo de figura que deseas calcular el area 1 Circulo 2 Cuadrado 3 Triangulo");
        tipo = input.nextInt();
        switch(tipo){
        case 1: System.out.println("dame el radio del circulo");
        double r= input.nextDouble();
        a= 3.1416*Math.pow(r, 2);
        break;
        case 2: System.out.println("dame la longitud del cuadrado");
        double l=input.nextDouble();
        a=Math.pow(l, 2);
        break;
        case 3:System.out.println("dame la base");
        double b= input.nextDouble();
            System.out.println("dame la altura");
        double h= input.nextDouble();
        a=(b*h)/2;
        break;
        default:System.out.println("ese tipo no existe");
        break;
       
}
        System.out.println("tu area es "+a);
    }
    //Robles Picazo Grecia Genesis
}
