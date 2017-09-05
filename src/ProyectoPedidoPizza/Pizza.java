/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoPedidoPizza;

/**
 *
 * @author Hernan Lopez
 */
public class Pizza {
    
    private  TamañoPizza _tamañoPizza;
    private  TipoPizza _tipoPizza;
    private  String _estado;
    private  static final TamañoPizza  _TAMAÑODEF=TamañoPizza.MEDIANA;
    private static final TipoPizza _TIPODEF=TipoPizza.CUATRO_QUESOS;
    
    public Pizza() {
        _tamañoPizza=_TAMAÑODEF;
        _tipoPizza=_TIPODEF;
        this._estado="PEDIDO";
    }

    
    public Pizza(TamañoPizza _tamañoPizza, TipoPizza _tipoPizza) {
        this._tamañoPizza = _tamañoPizza;
        this._tipoPizza = _tipoPizza;
        this._estado = "PEDIDO";
        
    }

    public TamañoPizza getTamañoPizza() {
        return _tamañoPizza;
    }

    public void setTamañoPizza(TamañoPizza _tamañoPizza) {
        this._tamañoPizza = _tamañoPizza;
    }

    public TipoPizza getTipoPizza() {
        return _tipoPizza;
    }

    public void setTipoPizza(TipoPizza _tipoPizza) {
        this._tipoPizza = _tipoPizza;
    }

    public String getEstado() {
        return _estado;
    }

    public void setEstado(String _estado) {
        this._estado = _estado;
    }
    
    public void sirve(){
        if(_estado.equals("PEDIDO"))
        _estado="SERVIDO";
        else 
            System.out.println("La pizza ya fue  servida");
    }
}
