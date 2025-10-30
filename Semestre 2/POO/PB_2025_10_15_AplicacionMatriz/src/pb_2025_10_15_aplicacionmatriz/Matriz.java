/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb_2025_10_15_aplicacionmatriz;

/**
 *
 * @author trcuser
 */
public class Matriz {
    private double [] [] datos;
    
    public Matriz(){
        datos = new double [1] [1];
        
    }
    public Matriz( double[][] d){
        datos = new double[d.length] [d[0].length];
        
        for(int r=0; r<datos.length;r++){
            for(int c=0; c<datos[0].length;c++){
                datos[r][c]=d[r][c];
            }
        }
    }

    public Matriz(int ren, int col) {
      if(ren>=0 && col>=0){
          datos = new double[ren][col];
      }
      else{
        datos= new double[1][1];
      }
    }
    
    public void setValor(double valor, int ren, int col){
        // para obtener las columnas o el numero de columnas es con datos[0].lenght
        if(ren >=0 && ren< datos.length && col >= 0 && col < datos[0].length){
            datos[ren][col]= valor;
            
        }
    }
    public double GetValor( int ren, int col){
          if(ren >=0 && ren< datos.length && col >= 0 && col < datos[0].length){
          return datos[ren][col];
            
        }
          else{
              return 0.0;
          }
    }
    public int getNumeroRenglones(){
        return datos.length;
    }
    public int getNumeroColumnas(){
        return datos[0].length;
    }
    public String toString(){
        String cad= "";
        for(int r=0; r<datos.length;r++){
            for(int c=0; c<datos[0].length;c++){
                cad+=datos[r][c]+"\t";
            }
                cad+="\n";    
        }
       return cad; 
    }
    //este metodo implica 3 objetos de la clase matriz
    // 1.- el q manda a llamar el metodo es (this)
    // 2.-el que llega como parametro (m)
    //3.- el que se crea con la suma de this+m es la matriz nueva
    public Matriz Sumar(Matriz m){
        // no se pueden sumar
        if(getNumeroColumnas()!= m.getNumeroColumnas() || getNumeroRenglones() != m.getNumeroRenglones()){
            return null;
        }
        Matriz nueva = new Matriz(this.getNumeroRenglones(),this.getNumeroColumnas());
        for(int r=0; r<this.getNumeroRenglones();r++){
        for(int c=0; c<this.getNumeroColumnas();c++){
            nueva.setValor(this.GetValor(r, c)+m.GetValor(r, c),r,c);
        }
    }
        return nueva;
    }
   //este metodo implica 2 objetos de la clase matriz
    // 1.- el q manda a llamar el metodo es (this)
    // 2.-el que llega como parametro (m)
    //3.- el que se crea con la multiplicacion de this*e es la matriz nueva
    public Matriz MultiplicarEscalar(double escalar){
        Matriz nueva = new Matriz(getNumeroRenglones(),getNumeroColumnas());
         for(int r=0; r<this.getNumeroRenglones();r++){
        for(int c=0; c<this.getNumeroColumnas();c++){
            nueva.setValor(this.GetValor(r, c)*escalar,r,c);
        }
    }
         return nueva;
    }
    public Matriz Restar(Matriz m){
        return this.Sumar(m.MultiplicarEscalar(-1));
    }
      //este metodo implica 2 objetos de la clase matriz
    // 1.- el q manda a llamar el metodo es (this)
    // 2.-el que llega como parametro (m)
    //3.- el que se crea con la multiplicacion de this*m nueva
    
    public Matriz MultiplicarMatriz(Matriz m){
        // no se pueden sumar
        if(getNumeroColumnas()!= m.getNumeroColumnas()){
            return null;
        }
        Matriz nueva = new Matriz(this.getNumeroRenglones(),m.getNumeroColumnas());
        
        double suma;
        
        for(int r=0; r<nueva.getNumeroRenglones();r++){
        for(int c=0; c<nueva.getNumeroColumnas();c++){
           suma=0;
           for(int k=0; k<this.getNumeroColumnas();k++){
               suma+=this.GetValor(r, k)*m.GetValor(k, c);
               nueva.setValor(suma, r, c);
           }
        }
    }
        return nueva;
    }
    public Matriz transpuesta(){
        Matriz nueva = new Matriz(this.getNumeroColumnas(),this.getNumeroRenglones());
        for(int r=0; r<nueva.getNumeroRenglones();r++){
            for(int c=0;c<nueva.getNumeroColumnas();r++){
                nueva.setValor(this.GetValor(c, r), r, c);
            }
        }
        return nueva;
    }
    
    
}
