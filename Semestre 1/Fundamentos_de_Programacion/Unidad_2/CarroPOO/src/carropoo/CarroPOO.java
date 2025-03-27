/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package carropoo;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class CarroPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
         int idCarro; //camelCase
     String Matricula;
     int an;
    String Marca;
    double Precio;
        //ClaseCarro carro = new ClaseCarro(1,"ABC123",2020,"Ford",50000);
        System.out.println("dame tu matricula");
        Matricula=input.nextLine();
        System.out.println("dame el ano de tu carro");
        an=input.nextInt();
        System.out.println("dame la marca del carro");
        input.nextLine();
        Marca=input.nextLine();
        System.out.println("dame el precio");
        Precio=input.nextDouble();
       ClaseCarro carro = new ClaseCarro(1,Matricula,an,Marca,Precio);
        System.out.println("tu matricula es "+carro.getMatricula());
        System.out.println("tu ano de carro es "+carro.getAn());
        System.out.println("tu marca es "+carro.getMarca());
        System.out.println("tu precio del carro es "+carro.getPrecio());
        carro.arrancar();
       // carro.setMarca("nissan");
        
          //  System.out.println("El carro es marca "+carro.getMarca());

    }
    
}
