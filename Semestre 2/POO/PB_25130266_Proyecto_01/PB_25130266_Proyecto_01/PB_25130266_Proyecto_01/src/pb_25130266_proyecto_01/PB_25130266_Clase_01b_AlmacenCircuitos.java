/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb_25130266_proyecto_01;

import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JTable;

class AlmacenCircuitos {
    private Circuito[] lista;
    
    public AlmacenCircuitos() {
        //creamos un arreglo de 5 referencias nulas
        lista = new Circuito[5];
    }
    public AlmacenCircuitos(int n) { 
        lista = new Circuito[n]; 
    }

   
    
    public int getNumeroCircuito() { 
        return lista.length; 
    }
    public AlmacenCircuitos(JTable tabla) {
        
        //Contar cuantas filas tienen datos validos no vacios
        int filasConDatos = 0;
        for (int r = 0; r < tabla.getRowCount(); r++) {
            String identificador = tabla.getValueAt(r, 0).toString().trim();
            if (identificador.isEmpty()) {
                break; // Parar al encontrar la primera celda vacia
            }
            filasConDatos++;
        }
        
        this.lista = new Circuito[filasConDatos];
        
        for (int r = 0; r < lista.length; r++) { 
            Circuito circuito = new Circuito();
            
              circuito.setIdentificador(tabla.getValueAt(r, 0).toString());
            
            String sVb = tabla.getValueAt(r, 1).toString().trim();
            if (sVb.isEmpty()) {
                circuito.setVb(0.0);
            } else {
                circuito.setVb(Double.parseDouble(sVb));
            }
            
            String sIg = tabla.getValueAt(r, 2).toString().trim();
            if (sIg.isEmpty()) {
                circuito.setIg(0.0);
            } else {
                circuito.setIg(Double.parseDouble(sIg));
            }
            
            String sRg = tabla.getValueAt(r, 3).toString().trim();
            if (sRg.isEmpty()) {
                circuito.setRg(0.0);
            } else {
                circuito.setRg(Double.parseDouble(sRg));
            }
            this.lista[r] = circuito;
        }
    }
    public Circuito getCircuito(int posicion) 
    { 
        if(posicion >=0 && posicion < lista.length){
                    return lista[posicion]; 
        }
        else{
            return null;
        }
    }
    
    public void setCircuito(Circuito p, int posicion) { 
        if (posicion >= 0 && posicion < lista.length) 
            lista[posicion] = p; 
    }
    
    public void ordenarRm() {
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i].CalcularRm() < lista[j].CalcularRm()) {
                    Circuito aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }
    }

    public void ordenarAlfab() {
        for (int i = 0; i < lista.length - 1; i++) {
            for (int j = i + 1; j < lista.length; j++) {
                if (lista[i].getIdentificador().compareToIgnoreCase(lista[j].getIdentificador()) > 0) {
                    Circuito aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }
            }
        }
    }
    
    public Circuito mayor() {
        if (lista.length == 0) return null;
        Circuito may = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i].CalcularRm() > may.CalcularRm()) 
                may = lista[i];
        }
        return may;
    }

    public Circuito menor() {
        if (lista.length == 0) return null;
        Circuito men = lista[0];
        for (int i = 1; i < lista.length; i++) {
            if (lista[i].CalcularRm() < men.CalcularRm()) men = lista[i];
        }
        return men;
    }

    public void mostrar(JTable tabla,JLabel eti) {
        DecimalFormat formato = new DecimalFormat("###,##0.00");
        double sumaRm = 0;
                
        //mostrar y sumar los circuitos válidos
        for (int r = 0; r < lista.length; r++) {
            tabla.setValueAt(lista[r].getIdentificador(),r, 0);
            tabla.setValueAt(lista[r].getVb(), r, 1);
            tabla.setValueAt(lista[r].getIg(), r, 2);
             tabla.setValueAt(lista[r].getRg(), r, 3);
             tabla.setValueAt(formato.format(lista[r].CalcularRm()), r, 4);
             sumaRm+=lista[r].CalcularRm();
        }
        eti.setText(formato.format(sumaRm));
    }
}