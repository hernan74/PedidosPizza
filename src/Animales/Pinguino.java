
package Animales;


public class Pinguino extends Ave{

    public Pinguino() {
    }

    public Pinguino(Sexo sexo) {
        super(sexo);
    }
    
    @Override
    public void volar(){
        System.out.println("El pinguino no puede volar");
    }
}
