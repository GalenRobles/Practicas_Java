/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotarea2;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class EjercicioTarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String nom, anot;
        int  puntos, totap=0;
        System.out.println("cuantos jugadores");
        int juga=input.nextInt();
        for(int i=1; i<=juga;i++){
            System.out.println("dame tu nombre");
            nom=input.next();
            for(int j=1; j<=3;j++){
                System.out.println("dame la cantidad de puntos que anotaste en el juego "+j);
                puntos=input.nextInt();
                totap+=puntos;
            }
            if(totap>40){
             anot ="Excelente";
        }
        else if(totap<40 && totap<20){
           anot="Bueno";
        }
        else{
            anot="Deficiente";
        }
        System.out.println("Nombre: "+nom);
            System.out.println("Total de puntos: "+totap);
            System.out.println("Nivel de anotacion "+anot);
            totap=0;
            System.out.println("Robles Picazo Grecia Genesis");
        }
        
    }
    
}
