package ejercicio22real;

import java.util.Random;

public class Ejercicio22Real {

    public static void main(String[] args) {
        int[][] matriz = new int[5][7];
        Random num = new Random();

        for (int fila = 0; fila < 5; fila++) {
            for (int columna = 0; columna < 7; columna++) {
                matriz[fila][columna] = num.nextInt(100);
            }
        }

        for (int fila = 0; fila < 5; fila++) {
            int sumaFila = 0;
            for (int columna = 0; columna < 7; columna++) {
                System.out.print("[ " + matriz[fila][columna] + " ] ");
                sumaFila += matriz[fila][columna];
            }
            System.out.println("= [ " + sumaFila + " ]"); 
        }
        for (int columna = 0; columna < 7; columna++) {
            int sumaColumna = 0;
            for (int fila = 0; fila < 5; fila++) {
                sumaColumna += matriz[fila][columna];
            }
            System.out.print("[ " + sumaColumna + " ] ");
        }
        System.out.println(); 
    }
}
