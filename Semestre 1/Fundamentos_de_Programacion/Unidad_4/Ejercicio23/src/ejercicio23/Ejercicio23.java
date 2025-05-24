/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio23;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                        Random random = new Random();
                          Scanner input= new Scanner(System.in);
                        String []nom;
                        int sumc=0;
        double [][]produccion;
        int cant;
        System.out.println("ingresa la cantidad de empleados");
        cant=input.nextInt();
                    nom=new String [cant];
                     produccion = new double[cant][6];
                     
        for(int i=0;i<nom.length;i++){
           input.nextLine();
            System.out.println("dame el nombre del obrero");
            nom[i]=input.nextLine();
            
            for(int j=0; j<6;j++){
             produccion[i][j]=random.nextInt(999);
              System.out.println("Nombre obrero "+nom[i]);
            System.out.println("Produccion mes "+j+" "+produccion[i][j]);
            }
            
    }
                                                     System.out.println("Reporte Semestral de Produccion");

          for(int x=0;x<nom.length;x++){
                 sumc=0;
                                                              System.out.print("[ "+nom[x]+" ]");

           for(int y=0; y<6;y++){
               sumc+=produccion[x][y];

                                             System.out.print("[ "+produccion[x][y]+" ]");
           }
                                                    System.out.println("[ "+sumc+" ]");
       }
        
    }
    
}
