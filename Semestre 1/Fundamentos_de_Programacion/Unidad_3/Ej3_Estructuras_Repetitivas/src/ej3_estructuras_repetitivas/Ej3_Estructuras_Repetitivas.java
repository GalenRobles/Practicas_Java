/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej3_estructuras_repetitivas;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ej3_Estructuras_Repetitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int num;
        do{
            System.out.println("dame un numero");
            num=input.nextInt();
        }
        while(num!=0);
    }
    
}
