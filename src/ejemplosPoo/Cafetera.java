package ejemplosPoo;

public class Cafetera {

    private int capacidadMaxima;
    private int cantidadActual;

    public Cafetera() {
        capacidadMaxima=1000;
        cantidadActual=0;
    }
    
    public Cafetera(int capacidadMaxima){
        this.capacidadMaxima=capacidadMaxima;
        this.cantidadActual=capacidadMaxima;
    }
    
    public Cafetera(int capacidadMax,int cantidadActual){
        this.capacidadMaxima=capacidadMax;
        if(cantidadActual>capacidadMax){
            this.cantidadActual=capacidadMax; 
        }
        else{
            this.cantidadActual=cantidadActual;
        }
    }
    
    public void llenarCafetera() {
        this.cantidadActual=capacidadMaxima;
        System.out.println("Cafetera llena");
    }

    public void servirTaza(int capacidadTaza) {

        if(cantidadActual>capacidadTaza){
            cantidadActual=cantidadActual-capacidadTaza;
            System.out.println("taza servida quedo "+cantidadActual+" cc. de cafe");
           
        }
        else if(cantidadActual<capacidadTaza){
            System.out.println("no se lleno la taza solo se sirvio "+cantidadActual+" cc. de cafe ");
            cantidadActual=0;
            System.out.println("sobro "+ cantidadActual+ "cc. de cafe");
        }
    }

    public void vaciarCafetera() {
        cantidadActual=0;
        System.out.println("se vacio la cafetera");
    }

    public void agregarCafe(int cantidadCafe) {
        int cantidadParaLlenar=capacidadMaxima-cantidadActual;
        if(cantidadParaLlenar>=cantidadCafe){
            cantidadActual=cantidadActual+cantidadCafe;
            System.out.println("cafetera cargada ahora tiene: "+cantidadActual+" cc. de cafe");
        }
        else if(cantidadParaLlenar<cantidadCafe){
            cantidadActual=capacidadMaxima;
            int sobro=cantidadCafe-cantidadParaLlenar;
            System.out.println("cafetera llena, sobro "+sobro+" cc. de cafe que no fue cargado");
        }
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
}
