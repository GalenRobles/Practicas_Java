/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio22;

import java.util.Random;

/**
 *
 * @author trcuser
 */
public class Ejercicio22 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int [][] matriz=new int[5][5];
       Random num= new Random();
       for(int fila=0; fila<matriz.length;fila++)
       {
           System.out.println("");
           for(int columna=0; columna<matriz.length;columna++)
           {
               matriz[fila][columna]=num.nextInt(100);
                 System.out.print("[ "+matriz[fila][columna]+" ]");   
           }
       }
              for(int x=0; x<matriz.length;x++)
       {
           System.out.println("");
           for(int y=0; y<matriz.length;y++)
           {
               matriz[x][y]=num.nextInt(100);
                 System.out.print("[ "+matriz[x][y]+" ]");   
           }
       }
      
    }
    
}
