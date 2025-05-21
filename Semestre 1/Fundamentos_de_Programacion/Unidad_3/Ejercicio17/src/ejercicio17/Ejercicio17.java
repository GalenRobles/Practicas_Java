/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio17;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int tipo, min,llam=0, cant=0, cantI=0,cantN=0,cantL=0, salida=0;
        double costo=0.0, costoT=0.0,costoN=0.0, costoI=0.0,costoL=0.0;
        do{
             System.out.println("Ingresa el tipo de llamada a realizar");
        System.out.println("1-. Internacional");
        System.out.println("2.- Nacional");
        System.out.println("3.- Local");
        System.out.println("4.- Salir");
        tipo=input.nextInt();
        if(tipo==4){
            System.out.println("chao");
            break;
        }
            System.out.println("ingresa los minutos");
            min=input.nextInt();
            switch(tipo){
                case 1 -> {
                    costo = min * 7.59;
                if(min > 3) {
                    costo = costo + (min * 3.03);
                                }
                    costoI+=costo;
                    cantI++;
                    cant++;
                }
                case 2 -> {
                    costo=min*1.20;
                    if(min>3){
                        costo=costo+(min*.48);
                    }
                    System.out.println("Costo de la llamada Nacional "+costo);
                    cant++;
                    cantN++;
                    costoN+=costo;
                }
                case 3 -> {
                    llam++;
                    if(llam>10){
                        costo=0.60;
                    }
                    else{
                        costo=0.0;
                    }
                    System.out.println("Costo de la llamada local es de "+costo);
                    cant++;
                    cantL++;
                    costoL+=costo;
                }
                case 4 -> System.out.println("chao");
                default ->System.out.println("opcion invalida");
                
        }
            costoT=costoI+costoN+costoL;
        }while(salida!=4);
        System.out.println("Recibo");
                System.out.println("Cantidad de llamadas"+cant);
        System.out.println("Costo por llamada internacional "+costoI);
        System.out.println("Costo por llamada nacional "+costoN);
        System.out.println("Costo por llamada local "+costoL);
        System.out.println("Costo total"+costoT);
        System.out.println("Robles Picazo Grecia Genesis");
  
    }
    
}
