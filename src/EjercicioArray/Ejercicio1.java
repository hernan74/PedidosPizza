/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioArray;

/**
 *
 * @author Hernan Lopez
 */
public class Ejercicio1 {
    
    public static void main(String[] args) {
        
        int array[]=new int[10];
        
        for (int i = 0; i < 10; i++) {
            array[i]=(int)(Math.random()*10+1);
            System.out.print(array[i]+"\t");
        }
        System.out.println("");
        for (int i = 0; i < 5; i++) {
            System.out.print(array[i]+"\t");
            System.out.print(array[9-i]+"\t");
        }
        System.out.println("");
    }
}
