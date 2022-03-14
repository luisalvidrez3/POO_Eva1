/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_7_memoria_1;

/**
 *
 * @author luisa
 */
public class Eva1_7_Memoria_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int valor = 5;
       String cadena = "Hola";
       Prueba obj = new Prueba();
       
        System.out.println("Valor = " + valor);
        System.out.println("Cadena = " + cadena);
        System.out.println("Objeto = " + obj);
        
    }
    
}
class Prueba{
    public int x = 100;
    public void saludar(){
        System.out.println("Hola mundo");
      
    }
}