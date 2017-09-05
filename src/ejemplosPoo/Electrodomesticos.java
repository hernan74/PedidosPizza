package ejemplosPoo;

public  class Electrodomesticos {

    protected double precioBase;

    protected String color;

    protected char consumoEnergetico;

    protected double peso;

    protected static final String COLOR_DEF="blanco";

    protected static final char CONSUMO_DEF='f';

    protected static final double PRECIO_BASE_DEF=10000;

    protected static final double PESO_DEF=5;

    public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso) {
        this.precioBase = precioBase;
        comprobarColor(color);
        comprobarConsumoEnergetico(consumoEnergetico);
        this.peso = peso;
    }

    public Electrodomesticos(double precioBase, double peso) {
        this.precioBase = precioBase;
        this.peso = peso;
        this.color =COLOR_DEF;
        this.consumoEnergetico=CONSUMO_DEF;
    }

    public Electrodomesticos() {
        this.precioBase=PRECIO_BASE_DEF;
        this.peso=PESO_DEF;
        this.color =COLOR_DEF;
        this.consumoEnergetico=CONSUMO_DEF;
    }
    
    public void comprobarConsumoEnergetico(char letra) {
        switch(letra){
            case 'a':
                this.consumoEnergetico=letra;
                break;
            case 'b':
                 this.consumoEnergetico=letra;
                break;
            case 'c':
                 this.consumoEnergetico=letra;
                break;
            case 'd':
                 this.consumoEnergetico=letra;
                break;
            case 'e':
                 this.consumoEnergetico=letra;
                break;
            case 'f':
                 this.consumoEnergetico=letra;
                break;
            default:
                 this.consumoEnergetico=CONSUMO_DEF;
                break;
        }
    }

    public void comprobarColor(String color) {
        switch(color){
            case "blanco":
                this.color=color;
                break;
            case "negro":
                   this.color=color;
                break;
            case "rojo":
                   this.color=color;
                break;
            case "azul":
                   this.color=color;
                break;
            case "gris":
                   this.color=color;
                break;
             default:
                 this.color=COLOR_DEF;
                break;
        }
    }

    public double precioFinal() {
     double precioFinal=0;
     switch(consumoEnergetico){
            case 'a':
              precioFinal=1000;
                break;
            case 'b':
                precioFinal=800;
                break;
            case 'c':
                precioFinal=600;
                break;
            case 'd':
                 precioFinal=500;
                break;
            case 'e':
                precioFinal=300;
                break;
            case 'f':
                 precioFinal=100;
                break;
     }
     precioFinal=precioFinal+precioBase;
     return precioFinal;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public void setPrecioBase(double precioBase) {
        this.precioBase = precioBase;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public char getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public void setConsumoEnergetico(char consumoEnergetico) {
        this.consumoEnergetico = consumoEnergetico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
}
