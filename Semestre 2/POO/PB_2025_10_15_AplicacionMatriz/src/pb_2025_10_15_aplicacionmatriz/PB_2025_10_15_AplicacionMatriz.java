/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pb_2025_10_15_aplicacionmatriz;

/**
 *
 * @author trcuser
 */
public class PB_2025_10_15_AplicacionMatriz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matriz A = new Matriz(3,4);
        A.setValor(4, 0, 0);
        A.setValor(2, 0, 1);
        A.setValor(0, 0, 2);
        A.setValor(8, 0, 3);
        
        
        A.setValor(9, 1, 0);
        A.setValor(5, 1, 1);
        A.setValor(3, 1, 2);
        A.setValor(1, 1, 3);
        
        
       A.setValor(5, 2, 0);
        A.setValor(6, 2, 1);
        A.setValor(7, 2, 2);
        A.setValor(4, 2, 3);
        
        A.setValor(-3, 2, 4);
        
        System.out.println(A);
        double [][] valores= {
                                             {7,2,0,-1},
                                              {4,5,9,6},
                                              {1,3,2,4}
                                        };   
        Matriz B= new Matriz(valores);
        System.out.println(B);
        
        Matriz C= A.Sumar(B);
        System.out.println(C);
        
        Matriz D=B.MultiplicarEscalar(5);
        System.out.println(D);
        Matriz E=C.Restar(A);
        System.out.println(E);
    }
    
}
