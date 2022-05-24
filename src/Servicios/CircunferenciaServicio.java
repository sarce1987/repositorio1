
package Servicios;

import Entidades.Circunferencia;
import java.util.Scanner;


public class CircunferenciaServicio {
    //c) Metodo para crear circunferencia
    public Circunferencia crearCircunferencia(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el radio de la circunferencia: ");
        Circunferencia C = new Circunferencia(leer.nextDouble());
       // C.setRadio(leer.nextDouble()); //Eso es otra forma que se podria haber hecho

        return C;
    }
    //d) Metodo area
    
    public void area(Circunferencia C){
        
        double area = Math.PI*Math.pow(C.getRadio(), 2);
        System.out.println("Area = " +area);
    }
    
    public void perimetro(Circunferencia C){
        double perimetro = 2* Math.PI*C.getRadio();
        System.out.println("Perimetro = "+perimetro);
    }
}
