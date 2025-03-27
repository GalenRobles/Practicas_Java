/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Examen {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double monto=0,descuento=0,total;
        char tipo;
        System.out.println("que tipo de membresia tienes tipo A, tipo B tipo C");
        tipo=input.next().charAt(0);
        System.out.println("dame el monto de compra");
        monto=input.nextDouble();
        switch(tipo){
            case'A' -> {
                if(monto<1000){
                    descuento=0.15;
                }
                else if(monto>=1000){
                    descuento=0.20;
                }
            }
                case 'B' -> {
                    if(monto<1500){
                        descuento=0.12;
                    }
                    else if(monto>=1500){
                        descuento=0.15;
                    }
            }
                case 'C' -> {
                    if(monto<500){
                        descuento=0.10;
                    }
                    else if(monto>=500){
                        descuento=0.15;
                    }
            }
                default -> System.out.println("no existe ese tipo de membresia");
        }
        total=monto-(monto*descuento);
        descuento=descuento*100;
        System.out.println("Tipo de membresia "+tipo);
        System.out.println("monto a pagar "+monto);
        System.out.println("Descuento "+descuento);
        System.out.println("total con descuento "+total);
    }
    //Robles Picazo Grecia Genesis
}
