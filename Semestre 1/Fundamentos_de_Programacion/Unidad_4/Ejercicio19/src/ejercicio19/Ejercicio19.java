/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio19;

import java.util.Random;

/**
 *
 * @author trcuser
 */
public class Ejercicio19 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int []num1;
        int []num2;
        int []res;
                Random random = new Random();
        num1 = new int[10];
        num2= new int[10];
        res=new int[10];
        for(int i=0; i< num2.length; i++){
            num2[i]=random.nextInt(100);
            System.out.print(" [ "+num2[i]+" ]");
            num1[i]=random.nextInt(100);
             System.out.print("[ "+num1[i]+" ]");
                    res[i]= num1[i]+num2[i];
             System.out.println(" = [ "+res[i]+" ]");
        }
    
    }
}
