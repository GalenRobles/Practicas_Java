/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa14;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        double p,q,r;
        System.out.println("dame el primer numero");
        p= input.nextDouble();
        System.out.println("dame el segundo numero");
        q= input.nextDouble();
        r=Math.pow(p,3)+Math.pow(q,4)-2*Math.pow(p, 2);
        if(r<680){
            System.out.println("si cumple "+p+""+q);
        }
        else{
            System.out.println("no cumple");
        }
    }
    //Robles Picazo Grecia Genesis
}
