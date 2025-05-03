/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio15;

import java.util.Scanner;

/**
 *
 * @author trcuser
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int voto, contv=0,cont1=0,cont2=0,cont3=0,cont4=0;
        double porc1,porc2,porc3,porc4;
        do{
            System.out.println("ingresa tu voto");
            voto=input.nextInt();
            switch(voto){
                case 1 -> {
                    cont1++;
                    contv++;
                }
                case 2 -> {
                    cont2++;
                    contv++;
                }
                case 3 -> {
                    cont3++;
                    contv++;
                }
                case 4 -> {
                    cont4++;
                    contv++;
                }
                case 0 -> System.out.println("Fin de la votacion");
                default ->  System.out.println("Voto invalido, ingrese otro");
            }
           
       
        }while(voto!=0);
       
            porc1=(cont1*100)/contv;
            porc2=(cont2*100)/contv;
            porc3=(cont3*100)/contv;
            porc4=(cont4*100)/contv;
            
              System.out.println("el total de votos de cada candidato fue de "+contv);
        System.out.println("Candidato 1 fue "+cont1+" porcentaje "+porc1);
        System.out.println("Candidato 2 fue "+cont2+" porcentaje "+porc2);
        System.out.println("Candidato 3 fue "+cont3+" porcentaje "+porc3);
        System.out.println("Candidato 4 fue "+cont4+" porcentaje "+porc4);
        }
       
        
    }
    

