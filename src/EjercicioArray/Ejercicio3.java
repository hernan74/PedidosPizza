
package EjercicioArray;


public class Ejercicio3 {

    public static void main(String[] args) {
        
        int array1[]= new int[12];
        int array2[]= new int[12];
        int arrayMescla[]= new int[24];
        System.out.println("Primer Array");
        for (int i = 0; i < 12; i++) {
            array1[i]=(int)(Math.random()*101);
            System.out.print(array1[i]+" |");
        }
        System.out.println("");
        System.out.println("Segundo Array");
        for (int i = 0; i < 12; i++) {
            array2[i]=(int)(Math.random()*101);
            System.out.print(array2[i]+" |");
        }
        int e=0;
        for(int i=0;i<12;i++){
            arrayMescla[e]=array1[i];
            arrayMescla[e+1]=array1[i+1];
            arrayMescla[e+2]=array1[i+2];
            arrayMescla[e+3]=array2[i];
            arrayMescla[e+4]=array2[i+1];
            arrayMescla[e+5]=array2[i+2];
            i=i+2;
            e=e+6;
        }
        System.out.println("");
        System.out.println("Array mezclado ");
        for(int i=0;i<24;i++)
        {
            System.out.print(arrayMescla[i]+" |");
        }
        System.out.println("");
    }
    
}
