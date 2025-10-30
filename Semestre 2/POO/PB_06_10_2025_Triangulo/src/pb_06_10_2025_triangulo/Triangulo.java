/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pb_06_10_2025_triangulo;

/**
 *
 * @author trcuser
 */
public class Triangulo {
    private  Punto vertice1;
    private Punto vertice2;
    private Punto vertice3;

    public Triangulo(Punto vertice1, Punto vertice2, Punto vertice3) {
        this.vertice1 = vertice1;
        this.vertice2 = vertice2;
        this.vertice3 = vertice3;
    }

    public Punto getVertice1() {
        return vertice1;
    }

    public void setVertice1(Punto vertice1) {
        this.vertice1 = vertice1;
    }

    public Punto getVertice2() {
        return vertice2;
    }

    public void setVertice2(Punto vertice2) {
        this.vertice2 = vertice2;
    }

    public Punto getVertice3() {
        return vertice3;
    }

    public void setVertice3(Punto vertice3) {
        this.vertice3 = vertice3;
    }
    
    public double perimetro(){
        
    }
            
    public double area(){
        double s= perimetro()/2;
        return Math.sqrt(s*s-lado1()*(s-lado2()));
    }
    public double alpha(){
        return Math.acos(Math.pow(lado2(), 2)+
                Math.pow(lado3(), 2)-
                Math.pow(lado1(), 2))/
                (2* lado2()*lado3())
                ));
    }
      public double beta(){
        return Math.acos(Math.pow(lado1(), 2)+
                Math.pow(lado3(), 2)-
                Math.pow(lado2(), 2))/
                (2* lado1()*lado3())
                ));
    }
        public double gamma(){
        return Math.acos(Math.pow(lado1(), 2)+
                Math.pow(lado2(), 2)-
                Math.pow(lado3(), 2))/
                (2* lado1()*lado2())
                ));
    }
        public double angulo1() // grados
        {
            return alpha()*180/Math.PI;
            
        }
        public double angulo2() // grados
        {
            return beta()*180/Math.PI;
            
        }
        public double angulo3() // grados
        {
            return gamma()*180/Math.PI;
            
        }
        public Triangulo  semejante()
        {
            Punto m1= vertice1.medio(vertice2);
            Punto m2= vertice2.medio(vertice3);
            Punto m3= vertice3.medio(vertice1);
            return new Triangulo(m1,m2,m3);
        }
}
