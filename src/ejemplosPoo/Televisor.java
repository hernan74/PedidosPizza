package ejemplosPoo;

public class Televisor extends Electrodomesticos {

    private int resolucion;

    private boolean TDT;

    public Televisor(int resolucion, boolean TDT, double precioBase, String color, char consumoEnergetico, double peso) {
        super(precioBase, color, consumoEnergetico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(int resolucion, boolean TDT, double precioBase, double peso) {
        super(precioBase, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(int resolucion, boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    
    
    public double precioFinal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
