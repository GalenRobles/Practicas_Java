/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb_2025_10_23_preproyecto;

/**
 *
 * @author trcuser
 */
public class Horario {
    private int horas;
    private int minutos;
    private int segundos;

        public Horario(int horas, int minutos, int segundos) {
            this.horas = horas;
            this.minutos = minutos;
            this.segundos = segundos;
        }

    public Horario() {
        horas=0;
        minutos=0;
        segundos=0;
    }
        

   
    public Horario(Horario h){
        horas=h.horas;
        minutos=h.minutos;
        segundos=h.segundos;
    }
    
    public Horario(int totalSegundos){
        horas=totalSegundos/3600;
     int restoSeg=totalSegundos%3600;
      minutos=restoSeg/60;
     segundos=restoSeg%60;
    }

        public int getHoras() {
            return horas;
        }

        public void setHoras(int horas) {
            this.horas = horas;
        }
 

        public int getMinutos() {
            return minutos;
        }

        public void setMinutos(int minutos) {
            this.minutos = minutos;
        }

        public int getSegundos() {
            return segundos;
        }

        public void setSegundos(int segundos) {
            this.segundos = segundos;
        }

 
    public Horario resta(Horario h){
        //vamos a restar this - h

     int restaSeg=this.segundosTotales()-h.segundosTotales();

    int hor=restaSeg/3600;
     int restoSeg=restaSeg%3600;
     int min=restoSeg/60;
     int seg=restoSeg%60;
     
        return new Horario(hor,min,seg);

    }
    public int segundosTotales(){
        return horas*3600+minutos*60+segundos;
    }
    
    public Horario suma(Horario horario){
        return new Horario(this.segundosTotales()+horario.segundosTotales());
    }
    public boolean mayor(Horario h){
        //define si this es mayor que h
        return segundosTotales()>h.segundosTotales();
    }
    

    @Override
    public String toString() {
return horas+"h: "+minutos+"m: "+segundos+"s";
    }
}
    
    
    
    

