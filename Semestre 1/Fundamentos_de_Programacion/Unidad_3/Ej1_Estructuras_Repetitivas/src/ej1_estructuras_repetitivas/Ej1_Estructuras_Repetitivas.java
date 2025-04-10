/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej1_estructuras_repetitivas;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ej1_Estructuras_Repetitivas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double num;
        double res=0;
        Scanner input = new Scanner(System.in);
        for( int i=1; i<=10;i++){
            System.out.println("dame un numero "+i);
            num=input.nextDouble();
            if(num>0){
                            res+=num;
            }
        }
        System.out.println("tu resultado es "+res);
    }
    
}
