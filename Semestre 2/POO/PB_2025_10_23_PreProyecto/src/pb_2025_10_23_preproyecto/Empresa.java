/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb_2025_10_23_preproyecto;

/**
 *
 * @author trcuser
 */
public class Empresa {
    private Empleado [] lista;

    public Empresa() {
        lista = new Empleado[5];
    }
    public Empresa(int n){
        if(n>0){
            lista=new Empleado[n]; 
        }
        else{
            lista=new Empleado[5];
        }
    }
    public void setEmpleado(Empleado e, int indice){
        if(indice>=0 && indice<lista.length){
            lista[indice]=e;
        }
    }
    public Empleado getEmpleado(int indice){
         if(indice>=0 && indice<lista.length){
             return lista[indice];
        }
         else{
             return new Empleado();
         }
    }
    public int getNumeroEmpleados(){
        return lista.length;
    }
    public void ordenar(){
         for(int i=0; i<lista.length-1;i++){
            for(int j=i+1;j<lista.length;j++){
                if(lista[i].tiempoTrabajado().mayor(lista[j].tiempoTrabajado())){
                    Empleado aux = lista[i];
                    lista[i]=lista[j];
                    lista[j]=aux;
                }
            }
        }
    }
    
    
}
