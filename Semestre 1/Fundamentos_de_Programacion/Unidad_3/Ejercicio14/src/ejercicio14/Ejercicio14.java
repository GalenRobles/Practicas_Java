/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio14;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int sum=0,opc=0,cont=0;
        double sue, sueT;
        do{
            System.out.println("ingresa tu sueldo");
            sue=input.nextInt();
            if(sue<1000){
                sueT=sue*1.15;
            }
            else{
                sueT=sue*1.12;
            }
            sum+=sueT;
            cont++;
            System.out.println("el sueldo de "+cont+" trabajador es de "+sueT);
            System.out.println("desea ingresar otro trabajador 1 si 2 no");
            opc=input.nextInt();
        }while(opc==1);
        System.out.println("el total de nomina fue de "+sum);
    }
    
}
