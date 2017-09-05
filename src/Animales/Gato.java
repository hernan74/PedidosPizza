
package Animales;

public class Gato  extends Animal{
    
   private String raza;

    public Gato(String raza) {
        this.raza = raza;
    }

    public Gato(Sexo sexo) {
        super(sexo);
        this.raza="sin especificar";
    }

    public Gato(String raza, Sexo sexo) {
        super(sexo);
        this.raza = raza;
    }

    public Gato() {
        super();
        this.raza="Sin especificar";
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    public String toString(){
        return super.toString()+" Raza: "+raza.toUpperCase();
    }
    public void comer(String comida){
        if(comida.toUpperCase().equals("PESCADO")){
            System.out.println("El gato se comio el pescado");
        }
        else{
            System.out.println("El gato no se comio la comida");
        }
    }
    public void pelearCon(Gato gato2){
       if(super.getSexo()==gato2.getSexo()){
           if(super.getSexo()==Sexo.HEMBRA){
               System.out.println("Las gatas pelean");
           }
           else{
               System.out.println("los gatos se insultan");
           }
       }
       else{
           System.out.println("los gatos son de distinto sexo se rechaza la pelea");
       }
    }
}