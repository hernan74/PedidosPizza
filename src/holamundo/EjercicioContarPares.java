
package holamundo;

import java.util.Scanner;

public class EjercicioContarPares {
    
    public static void main(String[] args) {

      
        int numero,pares=0,impares=0;
        String respuesta="s";
     
        
        do{
              System.out.println("Ingrese un numero");
              Scanner sc= new Scanner(System.in);
              numero=sc.nextInt();
            if(numero%2==0)
            {
                pares=pares+1;
            }
            if(numero%2==1)
            {
                impares=impares+1;
            }
            System.out.println("¿Seguir ingresando?  S/N");
             Scanner ss= new Scanner(System.in);
            respuesta=ss.nextLine().toUpperCase();
        }while(respuesta.equals("S"));
        
        System.out.println("Se ingreso un total de "+pares+" numeros pares");
        System.out.println("Se ingreso un total de "+impares+" numeros impares");
        
    }    }