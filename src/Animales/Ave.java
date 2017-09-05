
package Animales;


public class Ave extends Animal{

    public Ave() {
    }

    public Ave(Sexo sexo) {
        super(sexo);
    }
    
    public void asearse(){
        System.out.println("Me estoy limpiando las plumas");
    }
    
    public void volar(){
        System.out.println("Estoy volando");
    }
}
