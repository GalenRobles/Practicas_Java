/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa16;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Programa16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner input = new Scanner(System.in);
            double cal1,cal2,cal3,prom;
            String mat;
            System.out.println("dame tu matricula ");
            mat=input.nextLine();
            System.out.println("dame tu primera calificacion ");
            cal1=input.nextDouble();
            System.out.println("dame tu segunda calificacion");
            cal2=input.nextDouble();
            System.out.println("dame tu tercera calificacion");
            cal3=input.nextDouble();
            prom=(cal1+cal2+cal3)/3;
            if(prom>=70){
                System.out.println(mat+" Aprobaste "+prom);
            }
            else{
                System.out.println("Reprobado"+prom);
            }
            //Robles Picazo Grecia Genesis
    }
    
}
