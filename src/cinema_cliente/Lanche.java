/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema_cliente;

/**
 *
 * @author breno
 */
public class Lanche {
    
    private float precoTotal;
    Pipoca pipoca;
    Bebida bebida;
    Chocolate chocolate;

    public Lanche(Pipoca pipoca, Bebida bebida, Chocolate chocolate) {
        this.pipoca = pipoca;
        this.bebida = bebida;
        this.chocolate = chocolate;
    }
    

    public float getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(float precoTotal) {
        this.precoTotal = precoTotal;
    }

    public Pipoca getPipoca() {
        return pipoca;
    }

    public void setPipoca(Pipoca pipoca) {
        this.pipoca = pipoca;
    }

    public Bebida getBebida() {
        return bebida;
    }

    public void setBebida(Bebida bebida) {
        this.bebida = bebida;
    }

    public Chocolate getChocolate() {
        return chocolate;
    }

    public void setChocolate(Chocolate chocolate) {
        this.chocolate = chocolate;
    }   
    
    public float calculoPrecoTotal(){
        precoTotal = pipoca.calculoPreco() + bebida.calculoPreco() + chocolate.calculoPreco();
        return precoTotal;
    }
    
}
