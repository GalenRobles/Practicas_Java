/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa2;
import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                Scanner imput=new Scanner(System.in);
               System.out.println("Dame la base");
               double bas =imput.nextDouble();
               System.out.println("Dame la altura");
               double alt = imput.nextDouble();
               double p = 2*(bas+alt);
               double a = bas*alt;
               System.out.println("tu perimetro es "+p+" tu area es "+a);
               //Robles Picazo Grecia Genesis


    }
    
}
