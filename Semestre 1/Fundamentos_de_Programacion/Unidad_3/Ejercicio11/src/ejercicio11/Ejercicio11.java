/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio11;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("dame un valor positivo y entero");
        int n =input.nextInt();
      
        int fac=1;
        for(int i=1;i<=n;i++){
            fac*=i;
            System.out.println(i);
        }
          if(n==0){
            System.out.println("1");
        }
          else{
          System.out.println(fac);
          }
    }
    
    
}
