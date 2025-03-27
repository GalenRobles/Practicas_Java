/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa13;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double lad,rad,pi,areaCir,areaCua,areaFinal;
        pi=3.1416;
        System.out.println("dame el lado");
        lad=input.nextDouble();
        System.out.println("dame el radio");
        rad=input.nextDouble();
        areaCir=pi*Math.pow(rad,2);
        areaCua=Math.pow(lad, 2);
        if(2*rad>lad){
            System.out.println("error");
        }
        else{
            areaFinal=areaCua-areaCir;
            System.out.println("tu area es "+areaFinal); 
        }
        
        //Robles Picazo Grecia Genesis
    }
    
}
