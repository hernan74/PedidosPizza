
package ejemplosPoo;


public class Estudiantes {
    
    
    private String _nombre;
    private int _edad;
    private Integer _dni;
    private char  _sexo;
    private Double _peso;
    private Double _altura;

    private static final String _NOMBRE_DEF="";
    private static final int _EDAD_DEF=0;
    private static final Integer _DNI_DEF=(int)(Math.random()*90000000+10000000);
    private static final char _SEXO_DEF='M';
    private static final Double _PESO_DEF=0.0;
    private static final Double _ALTURA_DEF=0.0;
    
    public Estudiantes() {
        this._nombre=_NOMBRE_DEF;
        this._edad=_EDAD_DEF;
        this._dni=_DNI_DEF;
        this._sexo=_SEXO_DEF;
        this._peso=_PESO_DEF;
        this._altura=_ALTURA_DEF;
        }

    public Estudiantes(String _nombre, int _edad, char _sexo) {
        this._nombre = _nombre;
        this._edad = _edad;
        this._sexo = _sexo;
        this._dni=_DNI_DEF;
        this._sexo=_SEXO_DEF;
        this._peso=_PESO_DEF;
        this._altura=_ALTURA_DEF;
    }
    
    public Estudiantes(String _nombre, int _edad, Integer _dni, char _sexo, Double _peso, Double _altura) {
        this._nombre = _nombre;
        this._edad = _edad;
        this._dni = _dni;
        this._sexo = _sexo;
        this._peso = _peso;
        this._altura = _altura;
    }
    public String mostrarTodo(){
        return  "el nombre es: "+getNombre()+"  La edad es: "+getEdad()+"  El DNI es: "+getDni()+"  El sexo es: "+getSexo()+"  Su peso es: "+getPeso()+"  su altura es: "+getAltura();
    }
    public String getNombre() {
        return _nombre;
    }

    public void setNombre(String _nombre) {
        this._nombre = _nombre;
    }

    public int getEdad() {
        return _edad;
    }

    public void setEdad(int _edad) {
        this._edad = _edad;
    }

    public Integer getDni() {
        return _dni;
    }

    public void setDni(Integer _dni) {
        this._dni = _dni;
    }

    public char getSexo() {
        return _sexo;
    }

    public void setSexo(char _sexo) {
        this._sexo = _sexo;
    }

    public Double getPeso() {
        return _peso;
    }

    public void setPeso(Double _peso) {
        this._peso = _peso;
    }

    public Double getAltura() {
        return _altura;
    }

    public void setAltura(Double _altura) {
        this._altura = _altura;
    }
        public int calcularIMC(){
            int aux=0;
            Double IMC=_peso/(_altura*_altura);
            if(IMC<20){
                aux=-1;
            }
            else if(IMC>=20&&IMC<=25){
                aux=0;
            }
            else{
                aux=1;
            }
            return aux;
        }
     public   void  calcularIMC(int imc){
     }
}
