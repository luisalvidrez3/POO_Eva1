/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_17_constructores;

/**
 *
 * @author luisa
 */
public class Eva1_17_Constructores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        persona per1 = new persona();
        System.out.println("nombre " + per1.getNombre());
          System.out.println("edad " + per1.getEdad());
           persona per2 = new persona();
        System.out.println("nombre2 " + per2.getNombre());
          System.out.println("edad2 " + per2.getEdad());
          persona per3 = new persona("RUBEN",40);
        System.out.println("nombre3 " + per3.getNombre());
          System.out.println("edad3 " + per3.getEdad());
           persona per4 = new persona(5.0);
        System.out.println("nombre4" + per4.getNombre());
          System.out.println("edad4 " + per4.getEdad());
        
    }
    
}
class persona{
private String nombre;
private int edad;

public persona(){
    System.out.println("creando el objeto");
    nombre = "juan perez";
    edad = 100;
}
public persona(String nombre,int edad){
    System.out.println("creando el objeto con constructor que acepta valores");
    this.nombre = nombre;
    this.edad = edad;
    
}
        public persona(double valor){
            System.out.println("creando el objeto con constructor que acepta double");
        }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
