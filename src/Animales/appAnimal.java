
package Animales;


public class appAnimal {
    public static void main(String[] args) {
        
        Gato gato1= new Gato();
        Gato gato2= new Gato("Siames", Sexo.HEMBRA);
        gato1.comer("comida para gatos");
        gato1.comer("pescado");
        gato1.pelearCon(gato2);
    }
}
