/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pb_23_09_2025_aplicacionproductos_poo;

/**
 *
 * @author trcuser
 */
public class PB_23_09_2025_AplicacionProductos_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Producto mouse = new Producto();
          mouse.setDescripcion("Logitech USB");
        mouse.setCosto(190);
        mouse.setMargenUtilidad(20);
        mouse.setPorcentajeDescuento(5);
        System.out.println(mouse);
        System.out.println(" ");
        System.out.println(" Precio de "+mouse.getDescripcion()+" $ "+mouse.precio());
        
      
    }
    
}
