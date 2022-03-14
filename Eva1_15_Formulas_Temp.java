/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_15_formulas_temp;

import java.util.Scanner;

/**
 *
 * @author luisa
 */
public class Eva1_15_Formulas_Temp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
      System.out.println("introduce los grados centigrados");
      double celcius = input.nextDouble();
      double fahrenheit = Conversion.CalcularCaF(celcius);
      double kelvin = Conversion.CalcularCaK(celcius);
      System.out.println(celcius + "c" + fahrenheit + "f");
        System.out.println(celcius + "c" + kelvin + "k");
        System.out.println(kelvin + "k" + fahrenheit + "g");
      
      
    }
    
}
class Conversion{
    
    public static double CalcularCaF(double celcius){
        return celcius * 1.8 + 32.0;
    }
     public static double CalcularCaK(double celcius){
        return celcius + 273.0;
     }
      public static double CalcularFaC(double fahrenheit){
        return (fahrenheit - 32.0)/1.8;
     }
       public static double CalcularFak(double fahrenheit){
        return 5/9 * (fahrenheit - 32.0) + 273.0;
     }
        public static double CalcularKaF(double kelvin){
        return 1.8 * (kelvin-273) +32.0;
     }
         public static double CalcularKaC(double kelvin){
        return kelvin -273.0;
     }
         
     }
    
    

}

