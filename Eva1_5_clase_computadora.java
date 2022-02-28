/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_clase_computadora;

/**
 *
 * @author luisa
 */
public class Eva1_5_clase_computadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Computadora comp1 = new Computadora();
    comp1.setMarca ("Dell");
    comp1.setRAM (8);
    comp1.setColor ("Azul");
    comp1.setPrecio (15000.00);
    
    System.out.println("Marca:"+ comp1.getMarca());
    System.out.println("RAM en GB:"+ comp1.getRAM());
    System.out.println("Color:"+ comp1.getColor());
    System.out.println("Precio es:"+ comp1.getPrecio());
    double iva = (comp1.getPrecio()* .16) + comp1.getPrecio();
    System.out.println("Precio total mas el iva es:"+ iva);
 }  
}
class Computadora {
 private String marca;
 private int RAM;
 private String color;
 private double precio;

public void setMarca (String valor){
    marca= valor;}
public void setRAM(int valor){
    RAM= valor;}
public void setColor (String valor){
   color= valor;}
public void setPrecio(double valor){
   precio = valor;}

public String getMarca(){
    return marca;
}
public int getRAM(){
    return RAM;
}
public String getColor(){
    return color;
}
public double getPrecio(){
    return precio;
}

}




