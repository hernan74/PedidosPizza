
package Animales;

public abstract class Animal {
    
    
    private Sexo _sexo;
    
    public Animal(){
        _sexo=Sexo.MACHO;
    }

    public Animal(Sexo sexo) {
        this._sexo = sexo;
    }

    public Sexo getSexo() {
        return _sexo;
    }

    public void setSexo(Sexo _sexo) {
        this._sexo = _sexo;
    }
    
    @Override
    public String toString(){
        return "el sexo del animal es: "+_sexo;
    }
}
