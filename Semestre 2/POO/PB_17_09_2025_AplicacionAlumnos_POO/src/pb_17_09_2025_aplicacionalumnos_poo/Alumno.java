/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb_17_09_2025_aplicacionalumnos_poo;

/**
 *
 * @author trcuser
 */
public class Alumno {
   private  double asistencias;
   private double tareas;
   private double proyectos;
   private double examen;
   private String nombre;
   
   public Alumno(){
       nombre="NoId";
       asistencias =0.0;
       tareas=0.0;
       proyectos=0.0;
       examen=0.0;
   }
   public Alumno(String nom, double asis, double tar, double proy, double exa){
       nombre= nom;
       asistencias= asis;
       tareas=tar;
       proyectos=proy;
       examen=exa;
   }
   public double califAsistencias(){
       return asistencias *0.05;
   }
   public double califTareas(){
       return tareas*0.18;
   }
   public double califProyectos(){
       return proyectos*0.25;
   }
   public double califExamen(){
       return examen*0.52;
   }
   public double Calificacion(){
   return califAsistencias()+califTareas()+califProyectos()+califExamen();
   }
    
}
