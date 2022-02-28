/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_2_clase_persona;

/**
 *
 * @author luisa
 */
public class Eva1_2_clase_persona {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Persona estudiante = new Persona();
        estudiante.id = "00112233";
        estudiante.nombre = "Juan Perez Jolote";
        estudiante.edad = 10;
        estudiante.imprimirDatos();
        System.out.println("Año de nacimiento:" + estudiante.calcularAñoNacimiento());
         
        Persona estudiante2 = new Persona();
        estudiante2.id = "11111";
        estudiante2.nombre = "Ruben";
        estudiante2.edad = 40;
        estudiante2.imprimirDatos();
        System.out.println("Año de nacimiento:" + estudiante2.calcularAñoNacimiento());
       
        
         Persona estudiante3 = new Persona();
        estudiante3.id = "654654";
        estudiante3.nombre = "Pedro";
        estudiante3.edad = 50;
        estudiante3.imprimirDatos();
        System.out.println("Año de nacimiento:" + estudiante3.calcularAñoNacimiento());
    }
    
}
 class Persona{
    String id;
    String nombre;
    int edad;
    
    void imprimirDatos(){
        
        System.out.println("El nombre es " + nombre);
        System.out.println("Su id es " + id);
        System.out.println("Su edad es " + edad);
        
    }
    
    //Calculo año de nacimiento
    int calcularAñoNacimiento(){
        int añoNac = 2022 - edad;
        return  añoNac;
        
        
    
    
    
     }
    
 }