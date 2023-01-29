/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema_cliente;

/**
 *
 * @author breno
 */
public class Pipoca extends ModeloLanches implements InterfaceValorLanche{
    private char tamanho;
    

    public Pipoca(char tamanho, int quantidadePeq, int quantidadeMed, int quantidadeGnd) {
        super(quantidadePeq, quantidadeMed, quantidadeGnd);
        this.tamanho = tamanho;
        this.precoPeq = 14.0f;
        this.precoMed = 18.0f;
        this.precoGnd = 22.0f;
    }    


    
    public char getTamanho() {
        return tamanho;
    }

    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
    
    @Override
    public float calculoPreco(){
        return quantidadePeq*precoPeq+quantidadeMed*precoMed+quantidadeGnd+precoGnd;
    }
}
