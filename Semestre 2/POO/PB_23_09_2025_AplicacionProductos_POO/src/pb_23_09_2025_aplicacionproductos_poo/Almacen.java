/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb_23_09_2025_aplicacionproductos_poo;

import javax.swing.JTable;

/**
 *
 * @author trcuser
 */
public class Almacen {
    private Producto [] lista;
    
public Almacen(JTable tabla){
    lista = new Producto[tabla.getRowCount()];
    for(int r=0; r<tabla.getRowCount(); r++){
        Producto prod = new Producto();
        prod.setDescripcion(tabla.getValueAt(r, 0)+"");
        prod.setCosto(Double.parseDouble(tabla.getValueAt(r, 1)+""));
        prod.setMargenUtilidad(Double.parseDouble(tabla.getValueAt(r, 2)+""));
        prod.setPorcentajeImpuesto(Double.parseDouble(tabla.getValueAt(r, 3)+""));
        
        
    }
}
    public Almacen(){
        //creamos un arreglo de 5 referencias nulas
        lista = new Producto[5];
    }
    public Almacen(int n){
        // creamos un arreglo de  n referencias nulas
          lista = new Producto[n];
    }
    
    //similar al getValueAt()

    public  Producto getProducto(int posicion){
        if(posicion >=0 && posicion < lista.length){
             return lista[posicion];
        }
        else{
            return null;
        }  
    } 
    //similar al metodo setValueAt
       public void setProducto(Producto p, int posicion){
           if(posicion >=0 && posicion <lista.length){
               lista[posicion]=p;
           }
           
       }
       public void ordenarPrecio(){
           for(int i=0; i<lista.length-1;i++){
               for(int j=i+1; j<lista.length;j++){
                   if(lista[i].precio()<lista[j].precio()){
                       
                   }
               }
           }
       }
       public Producto mayor(){
           Producto may=lista[0];
           for(int i=1; i<lista.length;i++)
           if(lista[i].precio()>may.precio()){
                return may=lista[i];
           }  
        return may;
          
       }
       
       public Producto menor(){
           Producto men=lista[0];
           for(int i=1;i<lista.length;i++)
               if(lista[i].precio()<men.precio())
                   return men=lista[i];
        return men;
       }
       
       public int getNumeroProductos(){
           return lista.length;
       }
       public void mostrar(JTable tabla){
           double total;
            
           for(int r=0; r<lista.length;r++){
               tabla.setValueAt(lista[r].getDescripcion(),r,0);
               tabla.setValueAt(lista[r].getCosto(), r, 1);
               tabla.setValueAt(lista[r].getMargenUtilidad(), r, 2);
               tabla.setValueAt(lista[r].getPorcentajeDescuento(), r, 3);
               tabla.setValueAt(lista[r].getPorcentajeImpuesto(), r, 4);
               
               tabla.setValueAt(formato.format(lista.length[r].importeUtilidad()), r, 5);
               tabla.setValueAt(formato.format(lista.length[r].importeDescuento()), r, 6);
               tabla.setValueAt(formato.format(lista.length[r].importeUtilidad()), r, 7);
               tabla.setValueAt(formato.format(lista.length[r].precio()), r, 8);
               
               total+=
           }
       }
       
       }

