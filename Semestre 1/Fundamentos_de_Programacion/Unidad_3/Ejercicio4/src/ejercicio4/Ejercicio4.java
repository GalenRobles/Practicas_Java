/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio4;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        double vent,total=0, vch=0,vm=0,vg=0;
        int j=0, g=0,h=0;
        System.out.println("ingresa la cantidad de ventas que vas a registrar");
        int n=input.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("ingresa el monto de tu venta");
            vent=input.nextDouble();
            if(vent<=200){
                vch+=vent;
                 j++;
            }
           else if(vent<=400){
                vm+=vent;
                g++;
            }
            else{
                vg+=vent;
                h++;
            }
            total=vg+vch+vm;
            }
            System.out.println("-------------Reporte de ventas---------------");
            System.out.println("Tu cantidad de ventas chicas fue de "+j);
            System.out.println("Total de $ "+vch);
            System.out.println("Tu cantidad de ventas medianas fue de "+g);
            System.out.println("Total de $ "+vm);
            System.out.println("Tu cantidad de ventas grandes fue de "+h);
            System.out.println("Total de $ "+vg);
            System.out.println("El total de ventas fue "+total);
            System.out.println("ROBLES PICAZO GRECIA GENESIS");
    }
    }
    

