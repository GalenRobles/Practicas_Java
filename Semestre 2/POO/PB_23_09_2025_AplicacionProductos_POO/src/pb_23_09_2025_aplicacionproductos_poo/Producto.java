/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb_23_09_2025_aplicacionproductos_poo;

/**
 *
 * @author trcuser
 */
public class Producto {
    private String descripcion;
    private double costo;
    private double margenUtilidad;
    private int porcentajeDescuento;
     private double porcentajeImpuesto;
     
     public Producto(){
         descripcion="Nold";
         costo=0.0;
         margenUtilidad=0.0;
         porcentajeDescuento=0;
         porcentajeImpuesto=16;
     }

    public Producto(String descripcion, double costo, double margenUtilidad, int porcentajeDescuento, double porcentajeImpuesto) {
        this.descripcion = descripcion;
        this.costo = costo;
        this.margenUtilidad = margenUtilidad;
        this.porcentajeDescuento = porcentajeDescuento;
        this.porcentajeImpuesto = porcentajeImpuesto;
    }

    public double getPorcentajeImpuesto() {
        return porcentajeImpuesto;
    }

    public void setPorcentajeImpuesto(double porcentajeImpuesto) {
        this.porcentajeImpuesto = porcentajeImpuesto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public double getMargenUtilidad() {
        return margenUtilidad;
    }

    public void setMargenUtilidad(double margenUtilidad) {
        this.margenUtilidad = margenUtilidad;
    }

    public int getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(int porcentajeDescuento) {
        this.porcentajeDescuento = porcentajeDescuento;
    }

    @Override
    public String toString() {
        return descripcion + " Costo $ "+costo+
                                        " MargenUt: "+margenUtilidad+" % "+
                                        " Descto: "+porcentajeDescuento+
                                         "% Impto: "+porcentajeImpuesto;
    }
    public double importeUtilidad(){
        return costo*margenUtilidad/100;
    }
    public double subTotal1(){
        return costo+importeUtilidad();
    }
    public double importeDescuento(){
        return subTotal1()* porcentajeDescuento/100;
    }
    public double subTotal2(){
        return subTotal1() -importeDescuento();
    }
    public double importeImpuesto(){
        return subTotal2()*porcentajeImpuesto/100;
    }
    public double precio(){
        
        return subTotal2()+importeImpuesto();
    }
    
     
    
    
    
    
}
