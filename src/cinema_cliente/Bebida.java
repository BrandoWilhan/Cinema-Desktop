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
    private char tipo, tamanho;
    private String sabor;

    public Bebida(char tipo, char tamanho, String sabor, int quantidadePeq, int quantidadeMed, int quantidadeGnd) {
        super(quantidadePeq, quantidadeMed, quantidadeGnd);
        this.precoPeq = 4.50f;
        this.precoMed = 6.50f;
        this.precoGnd = 8.50f;
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.sabor = sabor;
        
    }

    public Bebida(int quantidadePeq, int quantidadeMed, int quantidadeGnd) {
        super(quantidadePeq, quantidadeMed, quantidadeGnd);
        this.precoPeq = 4.50f;
        this.precoMed = 6.50f;
        this.precoGnd = 8.50f;
    }
   
   
    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    
    @Override
    public float calculoPreco(){
        return quantidadePeq*precoPeq+quantidadeMed*precoMed+quantidadeGnd+precoGnd;
    }
}
