
package holamundo;


public class EjemploNumerosAleatorios {
    public static void main(String[] args) {
         
      
/*1=piedra
  2=papel     
  3=tijera      
 */
    int aux=0;
    int jug1,jug2;
    jug1=0;
    jug2=0;
  do
    {
        int jugador1=(int)(Math.random()*3+1);
        int jugador2=(int)(Math.random()*3+1);
      
       if(jugador1==1)
       {
           if(jugador2==1)
           {
               System.out.println("jugador1 hizo  piedra y jugador2 hizo piedra \t empate");
           }
           if(jugador2==2)
           {
               System.out.println("jugador1 hizo piedra y jugador2 hizo papel \t gano jugador2");
               jug2=jug2+1;
               aux=aux+1;
           }
           if(jugador2==3)
           {
               System.out.println("jugador1 hizo piedra y jugador2 hizo tijera \t gano jugador1");
               jug1=jug1+1;
               aux=aux+1;
           }
       }
       if(jugador1==2)
       {
           
           if(jugador2==1)
           {
               System.out.println("jugador1 hizo papel y jugador2 hizo piedra \t gano jugador1");
               jug1=jug1+1;
               aux=aux+1;
           }
           if(jugador2==2)
           {
               System.out.println("jugador1 hizo papel y jugador2 hizo papel \t empate");
               
           }
           if(jugador2==3)
           {
               System.out.println("jugador1 hizo papel y jugador2 hizo tijera \t gano jugador2");
               jug2=jug2+1;
               aux=aux+1;
           }
       }
       if(jugador1==3)
       {
           
           if(jugador2==1)
           {
               System.out.println("jugador1 hizo tijera y jugador2 jugo piedra \t hizo jugador2");
               jug2=jug2+1;
                aux=aux+1;
           }
           if(jugador2==2)
           {
               System.out.println("jugador1 hizo tijera y jugador2 hizo papel \t gano jugador1");
               jug1=jug1+1;
               aux=aux+1;
           }
           if(jugador2==3)
           {
               System.out.println("jugador1 hizo tijera y jugador2 hizo tijera \t empate");
              
           }
       }
      
    }while (aux<3); 
    
    if(jug1>jug2)
    {
        System.out.println("GANO JUGADOR1");
    }
    else
    {
        System.out.println("GANO JUGADOR2");
    }
  
    }
   
}
