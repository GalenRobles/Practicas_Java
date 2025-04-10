/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ej2_estructuras_repetititvas;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ej2_Estructuras_Repetititvas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int opor=0, numU,per=0;
        Random random = new Random();
        int numR= random.nextInt(100);
        System.out.println("Programa Adivina el numero");
        System.out.println("solo tienes 5 oportunidades");
        opor=1;
        System.out.println(numR);
        while(opor<=5){
            System.out.println("dame un numero");
            numU=input.nextInt();
            if(numU==numR){
                System.out.println("Haz ganado con "+opor+" intentos");
                opor=5;
                per=opor;
            }
             if(numU<numR){
                System.out.println("tu numero es menor que el numero ganador");
            }
             if(numU>numR){
                System.out.println("tu numero es mayor al numero ganador");
            }
            opor++;
        }
        if(per>5){
                    System.out.println("Perdiste");
        }
    }
    
}
