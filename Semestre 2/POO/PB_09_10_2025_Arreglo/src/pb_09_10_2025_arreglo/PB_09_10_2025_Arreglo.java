/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pb_09_10_2025_arreglo;

import java.util.Random;

/**
 *
 * @author trcuser
 */
public class PB_09_10_2025_Arreglo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Arreglo cero = new Arreglo();
        Arreglo uno = new Arreglo(5);
        
        double [] x ={9.5,7.1,5.3,1.2};
        Arreglo dos=  new Arreglo(x);
                    Random random = new Random();

        for(int i=0;i<cero.getTama();i++){
            cero.setValor(random.nextInt(100), i);
        }
        
         uno.setValor(7.9, 0);
         uno.setValor(8.0, 1);
         uno.setValor(1.7, 2);
         uno.setValor(4.5, 3);
         uno.setValor(3.3, 4);
         uno.setValor(1000, 8);

        
        System.out.println(cero);
        System.out.println(uno);
        System.out.println(dos);
        
       //dos.ordenar();
        
        System.out.println(dos);
        
        double [] y = uno.obtenerOrdenados();
        
        Arreglo tres = new Arreglo (y);
        
        System.out.println(uno);
        System.out.println(tres);
        
        Arreglo cuatro = dos.Multiplicar(10);
        Arreglo cinco= dos.suma(cuatro);
        System.out.println(cinco);
        Arreglo seis = dos.suma(tres);
        System.out.println(seis);
        
       // seis.setValor(5, 0); seis es nulo
        Arreglo siete= cinco.Restar(dos);
        System.out.println(siete);
        Arreglo ocho = dos.Agregar(tres);
        System.out.println(ocho);
        Arreglo nueve = tres.Agregar(dos);
        System.out.println(nueve);
    }
    
}
