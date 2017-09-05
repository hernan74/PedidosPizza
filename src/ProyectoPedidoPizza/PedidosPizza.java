
package ProyectoPedidoPizza;

import java.util.ArrayList;
import java.util.Scanner;


public class PedidosPizza {

    public static void main(String[] args) {
        
        ArrayList<Pizza> _listaPizza= new ArrayList<>();
        int i=0;
        int accion =0;
        System.out.println("¿que desea hacer?");
        while (i==0) {  
            System.out.println("1) pedir pizza.");
            System.out.println("2) servir pizza.");
            System.out.println("3 )ventas.");
            System.out.println("4) salir.");
           Scanner sc= new Scanner(System.in);
           accion=sc.nextInt();
           switch(accion){
               case 1: 
                    Pizza pizza1= new Pizza();
                    Scanner sc1= new Scanner(System.in);
                    System.out.println("¿que tamaño de pizza desea?");
                    System.out.println("1) mediano.");
                    System.out.println("2) familiar.");
                    accion=sc1.nextInt();
                    switch(accion){
                        case 1:
                            pizza1.setTamañoPizza(TamañoPizza.MEDIANA);
                            break;
                        case 2: 
                            pizza1.setTamañoPizza(TamañoPizza.FAMILIAR);
                            break;
                        default:
                           pizza1.setTamañoPizza(TamañoPizza.MEDIANA);
                           break;
                    }
                    Scanner sc2= new Scanner(System.in);
                    System.out.println("¿que tipo de pizza desea?");
                    System.out.println("1) margarita.");
                    System.out.println("2) cuatro quesos.");
                    System.out.println("3) funghi.");
                    accion=sc2.nextInt();
                    switch(accion){
                        case 1:
                            pizza1.setTipoPizza(TipoPizza.MARGARITA);
                            break;
                        case 2: 
                            pizza1.setTipoPizza(TipoPizza.CUATRO_QUESOS);
                            break;
                        case 3:
                            pizza1.setTipoPizza(TipoPizza.FUNGHI);
                            break;
                            default:
                                pizza1.setTipoPizza(TipoPizza.CUATRO_QUESOS);
                                break;
                    }
                    pizza1.setEstado("PEDIDO");
                    _listaPizza.add(pizza1);
                    break;
               case 2:
                   if(_listaPizza.isEmpty())
                   {
                       System.out.println("no hay pizzas ");
                       break;
                   }
                   else{
                       System.out.println("Lista de pizzas. Indique el numero de la pizza que desea servir");
                   int o=1;
                   for(Pizza e: _listaPizza){
                       System.out.print(o+") "+e.getTipoPizza());
                       System.out.print(" "+e.getTamañoPizza());
                       System.out.println(" "+e.getEstado());
                       o++;
                   }
                     Scanner sc3= new Scanner(System.in);
                     accion=sc3.nextInt();
                     _listaPizza.get(accion-1).sirve();
               break;
                   }
                   
               case 3:
                    int servidas=0, pedidas=0;
                    for(Pizza u:_listaPizza){
                        if(u.getEstado().equals("PEDIDO")){
                            pedidas=pedidas+1;
                        }
                        else{
                            servidas=servidas+1;
                        }
                    }
                    System.out.println("Pizzas pedidas: "+pedidas);
                    System.out.println("Pizzas servidas "+servidas);
                   break;
                   default:
                       i=1;
                       break;
             }
        }
    }
    
}
