/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio12;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("ingresa la cantidad de asteriscos ");
        int ast=input.nextInt();
        for(int i=1;i<=ast;i++){
           for(int j=1; j<=i;j++){
               System.out.print("*");
           }
            System.out.println("");
        } 
    }
    
}
