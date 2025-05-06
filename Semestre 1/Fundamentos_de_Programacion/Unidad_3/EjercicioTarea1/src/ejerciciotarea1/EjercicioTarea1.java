/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotarea1;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class EjercicioTarea1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int lim, res;
        Scanner input = new Scanner(System.in);

        System.out.println("Dame el limite:");
        lim = input.nextInt();

        for (int i = 1; i < lim; i++) {
            if (i % 2 == 0) {
                res = i + 1;
                System.out.println(i+ " + 1 = " +res);
            } else {
                res = i - 1;
                System.out.println(i +" - 1 = "+ res);
            }
        }
    }
}

