/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemploarrreglos;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class EjemploArrreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int[] num;
        int totaln=0,cant=0;
        double prom;
        Scanner input = new Scanner(System.in);
        num= new int[10];
        for(int i=0; i<num.length;i++){
            System.out.println("dame un numero");
            num[i]=input.nextInt();
            totaln+=num[i];
               }
         prom=totaln/num.length;  
         System.out.println("Promedio "+prom);
            for(int j=0; j<num.length;j++){
                if(num[j]>prom){
                cant++;
                  System.out.println("numero : "+num[j]);
            }
                System.out.println("Numeros arriba del promedio "+cant);
            }
        
    }
    
}
