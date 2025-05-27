/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio20;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio20 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Dame la longitud de los vectores:");
        int longitud = input.nextInt();

        int[] num1 = new int[longitud];  
        int[] num2 = new int[longitud];  
        int[] res = new int[longitud];  

        for (int i = 0; i < longitud; i++) {
            num1[i] = random.nextInt(50) * 2 + 2; 
            num2[i] = random.nextInt(50) * 2 + 1;
            res[i] = num1[i] + num2[i];
        }

        for (int i = 0; i < longitud; i++) {
            System.out.println("[" + num1[i] + "] + [" + num2[i] + "] = " + res[i]);
        }
    }
}

