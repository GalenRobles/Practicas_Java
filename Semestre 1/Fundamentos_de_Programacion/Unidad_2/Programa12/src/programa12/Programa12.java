/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa12;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double cost,precio;
        System.out.println("dame el costo del articulo ");
        cost=input.nextDouble();
       if(cost<1500){
           precio=cost-(cost*0.15);
       }
       else{
           precio=cost-(cost*0.12);
       }
        System.out.println("su nuevo precio es de "+precio);
    }
    //Robles Picazo Grecia Genesis
}
