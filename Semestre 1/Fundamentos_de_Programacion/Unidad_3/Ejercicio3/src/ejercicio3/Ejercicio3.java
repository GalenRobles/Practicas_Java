/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio3;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int n,res;
        
        System.out.println("dame el numero q sacare la tabla de multiplicar");
        n=input.nextInt();
        for( int i=1; i<=10;i++){
            res=n*i;
                   System.out.println(n + " x " + i + " = " + res);
        }
        }
    
}
