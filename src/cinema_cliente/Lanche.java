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
    Pipoca pipoca = new Pipoca();
    Bebida bebida = new Bebida();
    Chocolate chocolate = new Chocolate();

    public Lanche() {
    }
    
    public float calculoPrecoTotal(){
        precoTotal = pipoca.getQuantidade()*pipoca.getPreco() + bebida.getQuantidade()*bebida.getPreco() + chocolate.getQuantidade()*chocolate.getPreco();
        return precoTotal;
    }
    
}
