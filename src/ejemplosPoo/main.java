
package ejemplosPoo;

import java.util.Scanner;



public class main {
   
    
    public static void main(String[] args) {
     
     Electrodomesticos nuevo[] = new Electrodomesticos[5];
     
     nuevo[0]= new Electrodomesticos(1000, "rojo", 'b', 100);
        System.out.println(nuevo[0].precioFinal());
    }
}
