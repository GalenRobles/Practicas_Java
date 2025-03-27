/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
                System.out.println("Dame un numero");
                double num =input.nextDouble();
                double c2= Math.pow(num,2);
                double c3 = Math.pow(num,3);
                System.out.println("tu numero en cuadrado es "+c2+" tu numero en cubo es "+c3);

    }
    
}
