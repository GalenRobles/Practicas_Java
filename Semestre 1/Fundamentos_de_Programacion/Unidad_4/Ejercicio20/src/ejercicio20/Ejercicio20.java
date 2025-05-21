/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio20 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int []num1;
        int []num2;
        int []res;
        int rand;
        
        int longitud;
          Random random = new Random();
          Scanner input = new Scanner(System.in);
          System.out.println("dame la longitud de los vectores");
          longitud=input.nextInt();
                  num1 = new int[longitud];
               num2 = new int[longitud];
               res = new int[longitud];
          for(int i=0; i <num1.length;i++){
              rand=random.nextInt(100);
              if(rand%2==0){
                  num1[i]=rand;
                  System.out.println("vector 1 "+num1[i]);
              }
              else{
             num2[i]=rand;
                  System.out.println("vector 2 "+num2[i]);
          }
                     res[i]=num1[i]+num2[i];
                    System.out.println(res[i]+" resultado ");

              }
          
    }
          
    
}
