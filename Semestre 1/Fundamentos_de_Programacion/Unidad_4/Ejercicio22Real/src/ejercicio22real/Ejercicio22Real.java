/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22real;

import java.util.Random;

/**
 *
 * @author trcuser
 */
public class Ejercicio22Real {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int [][] matriz=new int[5][7];
       Random num= new Random();
       for(int fila=0; fila<5;fila++)
       {
           System.out.println("");
           for(int columna=0; columna<7;columna++)
           {
               matriz[fila][columna]=num.nextInt(100);
                 System.out.print("Matriz[ "+matriz[fila][columna]+" ]");   
           }
                      int sumf=0;
                      int sumc=0;
           for(int i=0;i<5;i++){
               sumf=0;
           for(int j=0; j<7;j++){
               sumf+=matriz[i][j];
                              System.out.print("[ "+matriz[i][j]+" ]");
           }
                                         System.out.print("["+sumf+"]");

       }
           System.out.println();
             for(int k=0;k<7;k++){
                 sumc=0;
           for(int h=0; h<5;h++){
               sumc+=matriz[h][k];
                                             System.out.print("[ "+matriz[k][h]+" ]");

           }
                                                    System.out.print("[ "+sumc+" ]");
       }
             System.out.println();
           
       }
       
    }
    
}
