/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_10_copia_objetos;

/**
 *
 * @author luisa
 */
public class Eva1_10_Copia_Objetos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       prueba obj1 = new prueba();
       obj1.x = 100;
        System.out.println("direccion: " + obj1);
        System.out.println("valor de x = " + obj1.x);
        prueba respaldo = new prueba();
        respaldo.x = obj1.x;
        System.out.println("valor de x en respaldo = " + respaldo.x);
        respaldo.x = 0;
        System.out.println("valor de x en obj1 = " + obj1.x);
        System.out.println("valor de x en respaldo = " + respaldo.x);
        System.out.println("obj1 = " + obj1);
        System.out.println("respaldo = " + respaldo);
        if (obj1 == respaldo)
            System.out.println("son el mismo objeto");
        else
            System.out.println("son objetos diferentes");
    
    }
    
}
class prueba{
    public int x;
}
