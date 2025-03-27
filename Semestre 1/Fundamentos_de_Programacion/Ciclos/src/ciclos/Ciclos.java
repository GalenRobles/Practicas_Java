/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ciclos;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ciclos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input= new Scanner(System.in);
        System.out.println("ingresa un numero que vamos a multiplicar");
        int num=input.nextInt();
        for(int i=0; i<=10; i++){
            int mul=num*i;
            System.out.println(mul);
    }
    }
    
}
