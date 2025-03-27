/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa11;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int cal;
        System.out.println("dame tu calificacion ");
        cal=input.nextInt();
        if(cal>=8){
            System.out.println("Aprobaste");
        }
        else{
            System.out.println("Reprobaste");
        }
        //Robles Picazo Grecia Genesis
    }
}
