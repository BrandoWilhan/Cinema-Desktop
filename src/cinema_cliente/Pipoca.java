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
//    private char tamanho;
    

    public Pipoca(int quantidadePeq, int quantidadeMed, int quantidadeGnd) {
        super(quantidadePeq, quantidadeMed, quantidadeGnd);
        this.precoPeq = 14.0f;
        this.precoMed = 18.0f;
        this.precoGnd = 22.0f;
    }    
    
    @Override
    public float calculoPreco(){
        return ((quantidadePeq*precoPeq)+(quantidadeMed*precoMed)+(quantidadeGnd+precoGnd));
    }
}
