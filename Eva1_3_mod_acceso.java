/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_3_mod_acceso;

/**
 *
 * @author luisa
 */
public class Eva1_3_mod_acceso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona per1 = new Persona();
        per1.setId("00112233");
        per1.setNombre("Ruben");
        per1.setEdad(40);
        
    }
    
}
     class Persona{
    private String id;
    private String nombre;
    private int edad;
   
     
     public String getId(){
         return id;
     }
     public String getNombre(){
         return nombre;
     }
     public int getEdad(){
         return edad;
     }
     
     public void setId(String valor){
         id = valor;
     }
     public void setNombre(String valor){
         nombre = valor;
     }
     public void setEdad(int valor){
         edad = valor;
     }


 }