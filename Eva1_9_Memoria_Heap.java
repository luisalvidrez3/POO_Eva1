/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_9_memoria_heap;

/**
 *
 * @author luisa
 */
public class Eva1_9_Memoria_Heap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int i = 5;
       
        prueba obj1 = new prueba();
        System.out.println(obj1);
         System.out.println(obj1.valor);
        prueba obj2 = new prueba();
        System.out.println(obj2);
        System.out.println(obj2.valor);
        obj2 = null;
        System.out.println(obj2.valor);
    }
    
}
class prueba{
    int valor = 100;
}