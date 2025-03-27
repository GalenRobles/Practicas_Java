/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programa3;
import java.util.Scanner;
/**
 *
 * @author DELL
 */
public class Programa3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       int n1,n2;
       double x1,x2,x3,x4,x5,x6;
       String nom;
       n1=45;
       x1=5.6;
       x2= n1+x1;
       x3= x2*n1;
       n2=n1%4;
       x4=n1/x1;
       x5=Math.pow(n1,2);
       x6= Math.sqrt(n1);
       System.out.println("n1 "+n1);
        System.out.println("el mod de "+n1+" y 4 fue de "+n2);
        System.out.println("x1 "+x1);
        System.out.println("la suma de "+n1+" + "+x1+" fue "+x2);
        System.out.println("la multiplicacion de "+x2+ " y "+n1+" fue "+x3);
        System.out.println(n1+" / "+x1+" = "+x4);
        System.out.println(n1+" elevado al cuadrado es "+x5);
        System.out.println("La raiz cuadrada de "+n1+ " es "+x6);
    }
    
}
