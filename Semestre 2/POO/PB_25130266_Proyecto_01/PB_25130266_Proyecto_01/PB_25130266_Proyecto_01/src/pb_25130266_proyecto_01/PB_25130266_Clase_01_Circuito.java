/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb_25130266_proyecto_01;

/**
 *
 * @author trcuser
 */
 class Circuito {
    private Double Vb;
    private Double Ig;
    private Double Rg;
    private String Identificador;

    public Circuito() {
        Vb=0.0;
        Ig=0.0;
        Rg=0.0;
        Identificador="";
    }

    
    public Circuito(Double Vb, Double Ig, Double Rg,String Identificador) {
        this.Vb = Vb;
        this.Ig = Ig;
        this.Rg = Rg;
        this.Identificador=Identificador;
    }

    public Double getVb() {
        return Vb;
    }

    public void setVb(Double Vb) {
        this.Vb = Vb;
    }

    public Double getIg() {
        return Ig;
    }

    public void setIg(Double Ig) {
        this.Ig = Ig;
    }

    public Double getRg() {
        return Rg;
    }

    public void setRg(Double Rg) {
        this.Rg = Rg;
    }

    public String getIdentificador() {
        return Identificador;
    }

    public void setIdentificador(String Identificador) {
        this.Identificador = Identificador;
    }
    

    @Override
    public String toString() {
        return "Circuito{" + "Vb=" + Vb + ", Ig=" + Ig + ", Rg=" + Rg + ", Identificador=" + Identificador + '}';
    }

    public Double CalcularRm(){
        Double Rm;
        Rm = (Vb-(Ig*Rg))/Ig;
        return Rm;
        
    }

   
    
}
