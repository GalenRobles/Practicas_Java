/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio10;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double sumaAlu=0,cali=0, proma=0, sumaG=0, promG;
        
        System.out.println("ingresa la cantidad de alumnos");
        int n= input.nextInt();
        
        for(int i =1; i<=n;i++){
            System.out.println("Dame calificaciones del alumno "+i);
            
            sumaAlu=0;
            
            for(int j=1;j<=7;j++){
                System.out.println("Ingresa tu calificacion de la materia "+j);
                cali= input.nextDouble();
                sumaAlu+=cali;
            }
            
             proma=sumaAlu/7;
                 System.out.println("Promedio del alumno "+proma);
          sumaG+=proma;
        }
        
        promG=sumaG/n;
                    System.out.println("Promedio Grupal "+promG);

    }
    
}
