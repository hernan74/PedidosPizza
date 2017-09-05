
package holamundo;

import java.util.Scanner;

/**
 *
 * @author Hernan Lopez
 */
public class CuatroOperaciones {
    public static void main(String[] args) {
        
        Integer x,y,operacion,resultado;
      
        Scanner sc= new Scanner(System.in);
        System.out.println("Ingrese 2 numeros enteros "+ "(separado por espacios)");
        x= sc.nextInt();
        y=sc.nextInt();
        System.out.println("Que operacion quiere hacer: \n1: suma \n2: resta \n3: multiplicacion \n4: division");
        operacion=sc.nextInt();
        switch (operacion)
                {
                    case 1: 
                        resultado=x+y;
                        System.out.println("El resultado de la suma entre "+x+ " y "+y+"es igual a: "+resultado);
                        break;
                    case 2:
                        resultado=x-y;
                        System.out.println("El resultado de la resta entre "+x+ " y "+y+"es igual a: "+resultado);
                        break;
                    case 3:
                        resultado=x*y;
                        System.out.println("El resultado de la multiplicacion entre "+x+ " y "+y+"es igual a: "+resultado);
                        break;
                    case 4:
                       Double  division= (double) x / (double) y;
                        System.out.println("El resultado de la division entre "+x+ " y "+y+" es igual a: "+division);
                        break;
                }
        
    }
}
