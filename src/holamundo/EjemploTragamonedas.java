
package holamundo;

import java.util.Scanner;

public class EjemploTragamonedas {
    public static void main(String[] args) {
        String e="S";
        while(e.equals("S"))
        {
        int i=0;
        // corazones=1,diamante=2,herradura=3,capina=4,limon=5
        int corazon=0,diamante=0,herradura=0,copina=0,limon=0;
        while(i<=2)
        {
            Integer resultado=(int)(Math.random()*100000000+10000000);
            switch(resultado)
            {
                case 1:
                    System.out.print("corazon \t");
                    corazon++;
                    i++;
                    break;
                case 2:
                     System.out.print("diamante \t");
                     diamante++;
                     i++;
                    break;
                case 3:
                     System.out.print("herradura \t");
                     herradura++;
                     i++;
                    break;
                case 4:
                     System.out.print("capina \t");
                     copina++;
                     i++;
                    break;
                case 5: 
                     System.out.print("limon \t");
                     limon++;
                     i++;
                    break;
            }
            
        }
        if(corazon==2||diamante==2||herradura==2||copina==2||limon==2)
            {
                System.out.println("");
                System.out.println("Recupero su dinero");
            }else if(corazon==3||diamante==3||herradura==3||copina==3||limon==3)
            {
                System.out.println("");
                System.out.println("GANO");
            }else
            {
                System.out.println("");
                System.out.println("Lo siento, ha perdido!"); 
            }
            System.out.println("¿Desea seguir jugando? S/N");
        Scanner sc= new Scanner(System.in);
        e=sc.nextLine().toUpperCase();
        }
    }
}
