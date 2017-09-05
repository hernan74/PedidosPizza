
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Hernan Lopez
 */
public class HolaMundo {

    public static void main(String[] args) {
      String Nombre="";
      int veces=5;
      Scanner scaner= new Scanner(System.in);
        System.out.println("Ingrese su nombre: ");
        Nombre=scaner.nextLine();
        for(int i=0;i<veces;i++)
        {
            System.out.println("Hola mundo "+Nombre+"!");
        }
        System.out.println("Ingrese cuantas veces quiere saludar ");
        veces=scaner.nextInt();
           for(int i=0;i<veces;i++)
        {
            System.out.println("Hola mundo "+Nombre+"!");
        }
    }
    
}
