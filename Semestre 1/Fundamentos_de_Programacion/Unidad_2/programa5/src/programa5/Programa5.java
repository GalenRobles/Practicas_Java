/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double gal,lt,precio;
        System.out.println("dame los galones");
        gal=input.nextDouble();
        lt=gal*3.785;
        precio=lt*20.20;
        System.out.println("su precio sera de "+precio);
        
    }
    
}
