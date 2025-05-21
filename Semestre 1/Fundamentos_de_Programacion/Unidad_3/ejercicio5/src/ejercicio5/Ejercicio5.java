/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio5;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double n,pro=0;
        int p=0,ne=0,nu=0;
        for(int i=1; i<=10;i++){
            System.out.println("dame un numero");
            n=input.nextDouble();
            if(n>0){
                p++;
            }
            if(n<0){
                ne++;
            }
            if(n==0){
                nu++;
            }
            pro+=n/10;
        }
        System.out.println("la cantidad de numeros positivos es de "+p) ;
        System.out.println("la cantidad de numeros negativos es de"+ne);
        System.out.println("la cantidad de numeros nulos es de"+nu);
        System.out.println("el promedio es de " +pro);
        System.out.println("ROBLES PICAZO GRECIA GENESIS");
    }
    
}
