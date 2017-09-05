
package EjercicioArray;
public class Ejercicio4 {
    public static void main(String[] args) {
        int array1[]= new int[10];
        int array2[]= new int[10];
        System.out.println("Array cargado");
        for (int i = 0; i < 10; i++) {
            array1[i]=(int)(Math.random()*21);
            System.out.print(array1[i]+",");
        }
        System.out.println("");
        System.out.println("Array ordenado por valores");
        int e=0;
        for (int i = 0; i < 10; i++) {
            if(array1[i]%2==0){
                array2[e]=array1[i];
                  e++;
            }  }
        int i=0;
       while(e<10)
        {
             if(array1[i]%2==1){
                 array2[e]=array1[i];
                e++;
              } 
             i++;
        }
        for (int j = 0; j < 10; j++) {
            System.out.print(array2[j]+",");
        }
}}
