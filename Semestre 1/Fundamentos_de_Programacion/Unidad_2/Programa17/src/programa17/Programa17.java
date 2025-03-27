/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa17;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             Scanner input = new Scanner(System.in);
             int num;
             System.out.println("dame un numero");
             num=input.nextInt();
             if(num==0){
                 System.out.println("tu numero es nulo"+num);
             }
             else{
                 if(num>0){
                     System.out.println("tu numero es positivo");
                 }
                 else{
                     System.out.println("tu numero es negativo");
                 }
             }
    }
    //Robles Picazo Grecia Genesis
    
}
