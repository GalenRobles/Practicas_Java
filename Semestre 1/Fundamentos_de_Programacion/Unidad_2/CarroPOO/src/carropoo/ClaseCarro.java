/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carropoo;

/**
 *
 * @author DELL
 */
public class ClaseCarro {
    //atributos privados
    private int idCarro; //camelCase
    private String Matricula;
    private int an;
    private String Marca;
    private double Precio;
    //constructor por defecto
    public ClaseCarro(){
        this.idCarro = 0;
        this.Matricula = "";
        this.an=0;
        this.Marca="";
        this.Precio=0.0;
    }
    //constructor con atributos
    public ClaseCarro(int idCarro, String Matricula, int An,String Marca, double Precio){
        this.idCarro = idCarro;
        this.Matricula = Matricula;
        this.an=An;
        this.Marca=Marca;
        this.Precio=Precio;
    }
    //constructor copia
    public ClaseCarro(ClaseCarro objeto){
        this.idCarro = objeto.idCarro;
        this.Matricula = objeto.Matricula;
        this.an=objeto.an;
        this.Marca=objeto.Marca;
        this.Precio=objeto.Precio;
    }

    public int getIdCarro() {
        return idCarro;
    }

    public void setIdCarro(int idCarro) {
        this.idCarro = idCarro;
    }

    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String Matricula) {
        this.Matricula = Matricula;
    }

    public int getAn() {
        return an;
    }

    public void setAn(int an) {
        this.an = an;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String Marca) {
        this.Marca = Marca;
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double Precio) {
        this.Precio = Precio;
    }
    //metodo no regresa valores sin parametros
    public static void arrancar(){
        System.out.println("ya arranco el auto");        
    }
}

    
   
