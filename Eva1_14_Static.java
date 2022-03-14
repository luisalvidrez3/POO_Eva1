/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_14_static;

/**
 *
 * @author luisa
 */
public class Eva1_14_Static {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
       double area = FormulasMatematicas.calcularAreaCirculo(100);
        System.out.println("Area: " + area );
        double areaT = FormulasMatematicas.calcularAreaTriangulo(100, 50);
        System.out.println("Area de trangulo: " + areaT);
        FormulasMatematicas miObj = new FormulasMatematicas();
        miObj.imprimirMensaje();
        
    }
    }
    class FormulasMatematicas{
        
        public static double calcularAreaCirculo(double radio){
            double area;
            area = 3.1416 * radio * radio;
            return area;
            
        }
        public static double calcularAreaTriangulo(double base, double altura){
        double area;
        area = (base* altura )/2.0;
        return area;
    }
        public void imprimirMensaje(){
            System.out.println("hola mundo");
            
        }
    }

