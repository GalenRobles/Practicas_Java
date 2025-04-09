/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio8;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double sm=0;
        String nem=null, ne;
       int ce=0;
        System.out.println("Ingresa el numero de empleados");
        int n=input.nextInt();
        for( int i=1; i<=n;i++){
            input.nextLine();
            System.out.println("dame el numero de empleado"+i);
            ne=input.nextLine();
            System.out.println("dame el sueldo");
            double s = input.nextDouble();
            if(s>=sm){
              sm=s;
              nem=ne;
            }
        }
        System.out.println(sm+" "+nem);
    }
}
