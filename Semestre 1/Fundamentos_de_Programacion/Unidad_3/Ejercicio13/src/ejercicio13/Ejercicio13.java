/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio13;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("dame el numero mayor para la serie de numeros");
        int num=input.nextInt();
        double sum=0;
        double pot=0;
        for(int i=1; i<=num;i++){
            pot=Math.pow(i, i);
            sum+=pot;
            System.out.println(i);      
        }
        System.out.println(sum);
    }
    
}
