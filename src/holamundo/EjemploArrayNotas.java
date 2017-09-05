
package holamundo;

import java.util.Scanner;


public class EjemploArrayNotas {
    
    public static void main(String[] args) {
        int numeroNotas,i=0,nota,sumaNotas=0;
        
        System.out.println("Cuantas notas desea ingresar");
        Scanner sc= new Scanner(System.in);
        numeroNotas=sc.nextInt();
         int notas[]= new int[numeroNotas];
        while(i<numeroNotas)
        {
        System.out.println("Ingrese la nota");
         sc=new Scanner(System.in);
         nota=sc.nextInt();
         notas[i]=nota;
         i++;
        }
        i=0;
          System.out.print("Las notas ingresadas fueron: ");
        while(i<numeroNotas)
        {
            sumaNotas=sumaNotas+notas[i];
            System.out.print(notas[i]+" ");
            i++;
        }
        System.out.println("");
        Double promedio=(double)(sumaNotas)/(double)(numeroNotas);
        System.out.printf("El promedio es: %.2f  ",promedio);
    }
}
