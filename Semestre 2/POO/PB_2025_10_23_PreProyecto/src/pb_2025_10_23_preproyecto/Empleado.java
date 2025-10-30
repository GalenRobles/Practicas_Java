package pb_2025_10_23_preproyecto;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author trcuser
 */
public class Empleado {
    private String nombre;
    private Horario entrada;
    private Horario salida;

    public Empleado(String nombre, Horario entrada, Horario salida) {
        this.nombre = nombre;
        this.entrada = entrada;
        this.salida = salida;
    }

    public Empleado() {
        nombre="No-id";
        entrada=new Horario();
        salida= new Horario();
    }
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Horario getEntrada() {
        return entrada;
    }

    public void setEntrada(Horario entrada) {
        this.entrada = entrada;
    }

    public Horario getSalida() {
        return salida;
    }

    public void setSalida(Horario salida) {
        this.salida = salida;
    }
    public String toString(){
        return nombre+" Ent->"+entrada+" Sal->"+salida;
    }
    public Horario tiempoTrabajado(){
        return salida.resta(entrada);
    }
    
    
    
}
