
package EjercicioArray;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        int array1[]= new int[10];
        int array2[]= new int[10];
        int arraymezclar[]= new int[20];
        System.out.println("Primer array");
        for (int i = 0; i < 10; i++) {
            array1[i]=(int)(Math.random()*51);
            System.out.print(array1[i]+" | ");
        }
        System.out.println("");
        System.out.println("Segundo Array");
        for (int i = 0; i < 10; i++) {
            array2[i]=(int)(Math.random()*51);
            System.out.print(array2[i]+" | ");
        }
        System.out.println("");
        System.out.println("Mezcla del primer array y el segundo");
        int e=0;
        for (int i = 0; i < 10; i++) {
            arraymezclar[e]=array1[i];
           
            arraymezclar[e+1]=array2[i];
           e=e+2;
           
        }
        for (int i = 0; i < 20; i++) {
            System.out.print(arraymezclar[i]+" |");
        }
    }
}
