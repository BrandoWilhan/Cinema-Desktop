/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema_cliente;

/**
 *
 * @author breno
 */
public class Chocolate extends ModeloLanches implements InterfaceValorLanche{

    private float preco;
    private int quantidadeLeite, quantidadeMeioAmargo;

    public Chocolate(int quantidadeLeite, int quantidadeMeioAmargo) {
        super(quantidadeLeite, quantidadeMeioAmargo);
        this.preco = 4.0f;
//        this.quantidadeLeite = quantidadeLeite;
//        this.quantidadeMeioAmargo = quantidadeMeioAmargo;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getQuantidadeLeite() {
        return quantidadeLeite;
    }

    public void setQuantidadeLeite(int quantidadeLeite) {
        this.quantidadeLeite = quantidadeLeite;
    }

    public int getQuantidadeMeioAmargo() {
        return quantidadeMeioAmargo;
    }

    public void setQuantidadeMeioAmargo(int quantidadeMeioAmargo) {
        this.quantidadeMeioAmargo = quantidadeMeioAmargo;
    }

    @Override
    public float calculoPreco(){
        return (quantidadeLeite+quantidadeMeioAmargo)*preco;
    }
    
}
