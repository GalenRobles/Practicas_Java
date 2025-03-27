/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa8;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double L1,L2,L3,S,area;
        System.out.println("dame el primer lado");
        L1=input.nextDouble();
        System.out.println("dame el segundo lado");
        L2=input.nextDouble();
        System.out.println("dame el tercer lado");
        L3=input.nextDouble();
        S=(L1+L2+L3)/2;
        area=Math.sqrt((S*(S-L1)*(S-L2)*(S-L3)));
        System.out.println("tu area es "+area);
        //Robles Picazo Grecia Genesis
        
    }
    
}
