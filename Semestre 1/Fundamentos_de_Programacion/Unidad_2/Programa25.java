/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa25;

import java.util.Scanner;

/**
 *
 * @author Picazzo Gym
 */
public class Programa25 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double cont=0,cred=0,pago,art=0,ele=0;
        char tipo;
        String form;
        System.out.println("ingresa el costo del articulo ");
        art=input.nextDouble();
        System.out.println("ingresa el tipo de articulo: A, B, C, D");
        tipo=input.next().charAt(0);
      System.out.println("ingresa el pago");
            pago=input.nextDouble();
        switch(tipo){
            case'A' -> {
                cont=5;
                cred=4;
            }
            case'B' -> {
                cont=10;
                cred=8;
            }
            case 'C' -> {
                cont=15;
                cred=12;
            }
            case'D' -> {
                cont=20;
                cred=17;
            }
            default -> System.out.println("ese tipo no existe ");      
        }
         
        if(art<1000){
            ele=art*(cont/100);
            System.out.println("tu forma de pago es de contado");
        }
        else {
            System.out.println("cual es tu forma de pago?  credito o contado ");
        form=input.next();
            ele=art*(cred/100);
        }
 System.out.println("el costo del articulo fue de "+art+" tu porcentaje de dinero electronico fue de "+ele);

    }
}
        
        
