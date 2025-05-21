/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio21;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio21 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input=new Scanner(System.in);
        String []nom;
        double []sue;
       double []Nsue;
        int cant;
        System.out.println("ingresa la cantidad de empleados");
        cant=input.nextInt();
                    nom=new String [cant];
                     sue = new double[cant];
                     
        for(int i=0;i<nom.length;i++){
           input.nextLine();
            System.out.println("Dame nombre del empleado");
            nom[i]=input.nextLine();
            System.out.println("Dame el sueldo del empleado");
            sue[i]=input.nextDouble();
        }
        
        for(int j=0; j<nom.length;j++){
            System.out.println("  "+nom[j]+"  "+sue[j]);
        }
        input.nextLine();
        
        System.out.println("ingresa el nombre del empleado a buscar ");
        String bnom=input.nextLine();
        boolean est=false;
        
        for(int k=0; k<nom.length;k++){
            if(nom[k].equals(bnom)){
                        est=true;
            System.out.println("Nombre "+nom[k]);
            System.out.println("Sueldo "+sue[k]);
        }
        }
        if(!est){
            System.out.println("no se encuentra ");
        }
        System.out.println("ingresa el nombre de la persona a editar ");
        String ne=input.nextLine();
        
        for(int k=0; k<1;k++){
            est=true;
            if(nom[k].equals(ne));
            System.out.println("Nombre "+nom[k]);
            System.out.println("Sueldo "+sue[k]);
            System.out.println("Dame el nuevo sueldo");
             Nsue = new double[cant];
             Nsue[k]=input.nextDouble();
            sue[k]=Nsue[k];
            System.out.println("El nuevo sueldo seria "+Nsue[k]);
            System.out.println("Nombre "+nom[k]);
            System.out.println("Sueldo "+sue[k]);
        }
        
        if(!est){
            System.out.println("no se encuentra ");
        }
        
    }
    
}
