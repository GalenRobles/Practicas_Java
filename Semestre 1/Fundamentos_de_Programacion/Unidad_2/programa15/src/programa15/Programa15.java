/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa15;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   Scanner input = new Scanner(System.in);
   double n1,n2,n3;
        System.out.println("dame un numero");
        n1=input.nextDouble();
        System.out.println("dame otro numero");
        n2=input.nextDouble();
        System.out.println("dame un numero mas");
        n3=input.nextDouble();
        if(n1<n2 && n2<n3){
            System.out.println("los numeros estan de forma creciente "+n1+" "+n2+" "+n3);
        }
        else{
            System.out.println("no estan en forma creciente");
        }
    }
    //Robles Picazo Grecia Genesis
}
