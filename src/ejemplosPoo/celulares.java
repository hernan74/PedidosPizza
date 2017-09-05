
package ejemplosPoo;

public class celulares {
    
    
    
    private String marca;
    private String modelo;
    private int pulgadas;
    private String color;
    private int capacidad;
    
      
    private static final String MARCA_DEF="sin marca";
    private static final String MODELO_DEF="sin modelo";
    private static final int PULGADAS_DEF=0;
    private static final String COLOR_DEF="sin color";
    private static final  int CAPACIDAD_DEF=0;

    public celulares() {
        this.marca = MARCA_DEF;
        this.modelo = MODELO_DEF;
        this.pulgadas = PULGADAS_DEF;
        this.color = COLOR_DEF;
        this.capacidad = CAPACIDAD_DEF;
    }
    
  
}
