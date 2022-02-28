/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_4_clase_auto;

/**
 *
 * @author luisa
 */
public class Eva1_4_clase_auto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Automovil miAuto = new Automovil();
        miAuto.setMarca("Ford");
        miAuto.setModelo("Mustang");
        miAuto.setTipo("Sedan");
        miAuto.setAño(2022);
        miAuto.setColor("Rojo");
        miAuto.setPrecio(1167000.00);
        miAuto.imprimirDatos();
        
         
          
    }
    
    
}
class Automovil{
    
    private String marca;
    private String modelo;
    private String tipo;
    private int año;
    private String color;
    private double precio;
    
    public void setMarca (String Valor){
    
    marca= Valor;
    }
    public String getMarca(){
        return marca;
                }
    
    public void setModelo (String Valor){
    
    modelo= Valor;
    }
    public String getModelo(){
        return modelo;
                }
    public void setTipo (String Valor){
    
    tipo= Valor;
    }
    public String getTipo(){
        return tipo;
                }
    public void setAño (int Valor){
    
   año = Valor;
    }
    public int getAño(){
        return año;
                }
    public void setColor (String Valor){
    
    color= Valor;
    }
    public String getColor(){
        return color;
                }
    public void setPrecio (double Valor){
    
    precio = Valor;
    }
    public double getPrecio(){
        return precio;
                }
    public void imprimirDatos(){
        System.out.println("Datos del vehiculo:");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
        System.out.println("Color : " + color);
        System.out.println("Año: " + año);
        System.out.println("Precio : " + precio);
        System.out.println("Tipo : " + tipo);




    }
    
    }
    
    
    

