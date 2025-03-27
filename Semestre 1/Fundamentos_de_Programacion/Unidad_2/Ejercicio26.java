/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercio26;

import java.util.Scanner;

/**
 *
 * @author aa509
 */
public class Ejercicio26 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner input = new Scanner(System.in);
        int tipo,descAd,mens,inter=0;
        double cosT=0,mont=0,Descuento,cos,cost=0,desc=0;
        String form;
        System.out.println("ingresa el tipo de cliente: 1) Normal 2) Plus 3) Platino ");
        tipo=input.nextInt();
        System.out.println("ingresa el monto de la compra");
        mont=input.nextDouble();
        switch(tipo){
            case 1:
                desc=0;
                break;
            case 2:
                if(mont>1000){
                    desc=5;
                }
                if (mont>3000){
                desc=10;
            }
                if (mont>5000){
                desc=15;
            }
                else{
                    desc=0;
                }
                break;
            case 3:
                if(mont>1000){
                    desc=10;
                 }
                if(mont>3000){
                    desc=15;
                }
                if(mont>5000){
                    desc=20;
                }
                else{
                    desc=0;
                }
                break;
            default:
                System.out.println("no existe ese tipo");
    }
        System.out.println("tu forma de pago es al contado o a credito? ");
        form=input.next();
        Descuento=mont*(desc/100);
        cos=mont-Descuento;
        System.out.println(cos);
        if(form.equalsIgnoreCase("contado")){
            cosT=cos*(10/100);
        }
        if(form.equalsIgnoreCase("credito")){
            if(mont>1000){
                System.out.println("elige tus mensualidades 3,6,9,12 meses ingresa el numero de mes");
                mens=input.nextInt();
                switch(mens){
                case 3 -> cosT=mont/3;
                case 6 -> {
                    cosT=mont/6;
                    inter=5;
                    cost=cosT*0.05;
                    }
                    case 9 -> cosT=mont/9;
                    case 12 -> cosT=mont/12;
            }
                
            }
        }
               System.out.println("tu monto total de compra es "+mont+" tu monto por parcialidades es de "+cosT);

  }
}
    

