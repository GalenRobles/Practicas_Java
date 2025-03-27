/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa18;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner input = new Scanner(System.in);
            double num, r;
           
            System.out.println("dame un numero");
            num=input.nextDouble();
            r=num%2;
            if(r==0){
                System.out.println("tu numero es par "+num);
            }
            else{
                System.out.println("tu numero es impar "+num);
            }
    }
        //Robles Picazo Grecia Genesis
}
