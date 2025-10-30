/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb_09_10_2025_arreglo;

import java.util.Arrays;

/**
 *
 * @author trcuser
 */
public class Arreglo {
    private double [] datos;
    
    public Arreglo(){
    datos = new double [10];
}
    public Arreglo(int n){
        if(n<=0){
            datos = new double[10];
        }
        else{
            datos = new double[n];
        }
    }
    public Arreglo (double [] d){
        datos = new double[d.length];
        for(int i=0; i<datos.length;i++){
            datos[i]=d[i];
        }
    }
    public void setValor(double valor, int index){
        if(index>=0 && index<datos.length){
            datos[index]=valor;
        }
    }
    
    public double getValor(int index){
        if(index>=0 && index<datos.length){
            return datos[index];
        }
        else {
            return 0.0;
        }
    }
    public int getTama(){
        return datos.length;
    }
    
    public String toString(){
        String cad= "";
        for(int i=0; i<datos.length; i++){
              cad+= "datos [ " +i+"] = "+datos [i]+"\n";
        }
       return cad;   
    }
    public void ordenar(){
        Arrays.sort(datos);
    }
    public double []  obtenerOrdenados(){
        double [] copia =  new double [datos.length];
        for(int i =0; i<copia.length; i++){
            copia[i]= datos[i];
        }
        Arrays.sort(copia);
        return copia;
    }
    //este metodo implica 2 objetos de la clase arreglo
    // el q manda llamar al metodo
    // el que se crea al multiplicar this * escalar(nuevo)
    public Arreglo  Multiplicar(double escalar){
        Arreglo nuevo = new Arreglo(getTama());
        for(int i=0; i<getTama();i++){
            nuevo.setValor(getValor(i)*escalar, i);
            
        }
        return nuevo;
    }
    // este metodo implica 3 objetos de la clase arreglo
    // 1.- el q manda a  llamar al metodo(this)
    // 2.- el que llega como parametro(a)
    //3.- el q se crea al  sumar this + a(nuevo)
    public Arreglo suma(Arreglo a)
    {
        // no se pueden sumar
        if(getTama() != a.getTama())
            return null;
            //si se pueden sumar
            Arreglo nuevo = new Arreglo(getTama());
            for(int i=0; i<getTama();i++){
                nuevo.setValor(getValor(i)+a.getValor(i), i);
            }
            return nuevo;
    }
    // este metodo implica 3 objetos de la clase arreglo
    // 1.- el q manda a  llamar al metodo(this)
    // 2.- el que llega como parametro(a)
    //3.- el q se crea al restar this - a (nuevo)
    public Arreglo Restar(Arreglo a)
    {
        // return this + a*-(-1)
        return suma(a.Multiplicar(-1));
       
    }
      // este metodo implica 3 objetos de la clase arreglo
    // 1.- el q manda a  llamar al metodo(this)
    // 2.- el que llega como parametro(a)
    //3.- el q se crea al concatenar  this con a (nuevo)
    public Arreglo Agregar(Arreglo a){
        Arreglo nuevo = new Arreglo(getTama()+a.getTama());
        //copiamos los elementos de this
        for(int i =0; i<getTama();i++){
            nuevo.setValor(getValor(i), i);
            //ahora copiamos los valores de a a  nuevo
        }
        for(int i=0; i<a.getTama();i++){
            nuevo.setValor(a.getValor(i), i+getTama());
        }
        return nuevo;
    }
   
        
    
}
