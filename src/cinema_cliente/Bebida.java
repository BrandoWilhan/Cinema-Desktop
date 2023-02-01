/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema_cliente;

/**
 *
 * @author breno
 */
public class Bebida extends ModeloLanches implements InterfaceValorLanche{
    String tipo;

    public Bebida(String tipo, int quantidadePeq, int quantidadeMed, int quantidadeGnd) {
        super(quantidadePeq, quantidadeMed, quantidadeGnd);
        this.precoPeq = 4.50f;
        this.precoMed = 6.50f;
        this.precoGnd = 8.50f;
        this.tipo = tipo;
        
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    
    @Override
    public float calculoPreco(){
        return quantidadePeq*precoPeq+quantidadeMed*precoMed+quantidadeGnd+precoGnd;
    }
}
