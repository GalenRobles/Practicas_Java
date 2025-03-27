/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa24;

import java.util.Scanner;

/**
 *
 * @author aa509
 */
public class Programa24 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double cost=0;
        int hr,tipo,cant=0,costEx=0;
        double sue=1000;
        
        Scanner input = new Scanner(System.in);
        System.out.println("cual es el tipo de camion que manejas ? tipo 1 Camion de pasajeros tipo 2 Camion de mercancia tipo 3 Camion de productos quimicos");
        tipo= input.nextInt();
        System.out.println("cuantas horas conducidas hiciste");
        hr=input.nextInt();
        switch(tipo){
        case 1: System.out.println("cuantas personas extras llevas? ");
         cant = input.nextInt();
         costEx=120;
        break;
        case 2: System.out.println("cuantas toneladas llevas");
       cant = input.nextInt();
       costEx=400;
       break;
        case 3:System.out.println("cuantas toneladas llevas");
       cant = input.nextInt();
       costEx=500;
        default:System.out.println("no existe ese tipo");
    }
             cost=sue+(cant*costEx)+(hr*150);
             System.out.println("tu costo por el viaje es de "+cost);
   
    }
    //Robles Picazo Grecia Genesis
}
