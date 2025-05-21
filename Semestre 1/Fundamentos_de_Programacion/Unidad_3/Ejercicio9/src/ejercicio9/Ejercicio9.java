/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio9;

/**
 *
 * @author trcuser
 */
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
      int suma = 0;
        int incremento = 3;

        for (int i = 2; i <= 1800; ) {
            System.out.println(i);   
            suma += i;               

            i += incremento;     
            
            if(incremento==3){
                incremento=2;
            }
            else{
                incremento=3;
            }
        }

        System.out.println("Suma total: " + suma);
        System.out.println("Robles Picazo Grecia Genesis");
    }
    
}
