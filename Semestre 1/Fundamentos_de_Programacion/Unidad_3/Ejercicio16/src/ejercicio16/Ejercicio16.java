/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio16;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        int num;
        System.out.println("dame un numero entero");
            num=input.nextInt();
        do{
            if(num%2==0){
                num=num/2;
            }
            else{
                num=3*num+1;
            }
            System.out.println(num); 
        }while(num!=1);
        System.out.println(num);
    }
    
}
