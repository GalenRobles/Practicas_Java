/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa10;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double sue,nueSue;
        System.out.println("dame el sueldo ");
        sue=input.nextDouble();
        if(sue<5000){
            nueSue=sue*1.15;
            System.out.println("tu nuevo sueldo es "+nueSue);
        }
        else{
        System.out.println("no tiene aumento "+sue);
    }
        //Robles Picazo Grecia Genesis 
    } 
}
