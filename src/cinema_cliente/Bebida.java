/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema_cliente;

/**
 *
 * @author breno
 */
public class Bebida {
    private char tipo, tamanho;
    private String sabor;
    private float preco;
    private int quantidade;

    public Bebida(char tipo, char tamanho, String sabor, float preco, int quantidadeSuco, int quantidadeRefrigerante) {
        this.tipo = tipo;
        this.tamanho = tamanho;
        this.sabor = sabor;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }




    public Bebida() {
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

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    
    
}
