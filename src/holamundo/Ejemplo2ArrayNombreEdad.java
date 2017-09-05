
package holamundo;

import java.util.Scanner;




public class Ejemplo2ArrayNombreEdad {

    public static void main(String[] args) {
        int edad[]=new int[1];
        String nombre[]=new String[1];
         int mayor=0,menor=0,aux2;
        for (int i = 0; i < 1; i++) {
            System.out.println("Ingrese la edad y el nombre de la persona N° "+i+1);
            Scanner sc= new Scanner(System.in);
            edad[i]=sc.nextInt();
            nombre[i]=sc.nextLine();
        }
        System.out.println("Las edades y los nombres ingresados fueron: ");
        for (int i = 0; i < 1; i++) {
            System.out.print(edad[i]+"\t");
            System.out.println(nombre[i]);
        }
        System.out.println("La persona mas vieja es: ");
       
        for (int i = 0; i < 1; i++) {
            
            if(mayor<edad[i])
            {
                mayor=edad[i];
            }
            if(menor>edad[i])
            {
                menor=edad[i];
            }
        }
        System.out.print(edad[mayor]+"\t"+nombre[mayor]);
        System.out.println("La persona mas joven es: ");
        System.out.println(edad[menor]+"\t"+edad[menor]);
    }
    
}
