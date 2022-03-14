/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_18_sobrecarga;

/**
 *
 * @author luisa
 */
public class Eva1_18_Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("hola mundo");
        prueba obj = new prueba();
        System.out.println(obj);
        System.out.println(100);
        System.out.println("area de un rectangulo 15 x 20 " + calcularArea(15,20));
         System.out.println("area de un circulo de radio de 100 " + calcularArea(100.0));
         System.out.println("area de un circulo de radio de 100 " + calcularArea(100));
         System.out.println("area de un triangulo 15 x 20 " + calcularArea(15.0,20.0,1));
         
    }
    public static double calcularArea(double base,double altura){
        return base* altura;
    }
    public static double calcularArea(double base,double altura,int esTriangulo){
        return (base* altura)/2;
    }

     public static double calcularArea(double radio){
        return Math.PI* Math.pow(radio, 2);
     }
      public static double calcularArea(int radio){
          System.out.println("entero");
        return Math.PI* Math.pow(radio, 2);
     }
}
class prueba{
    
}