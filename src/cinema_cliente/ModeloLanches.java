/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema_cliente;

/**
 *
 * @author breno
 */
public class ModeloLanches {
    float precoPeq, precoMed, precoGnd;
    int quantidadePeq, quantidadeMed, quantidadeGnd, quantidadeLeite, quantidadeMeioAmargo;

    
    public ModeloLanches(int quantidadePeq, int quantidadeMed, int quantidadeGnd){
        this.quantidadePeq = quantidadePeq;
        this.quantidadeMed = quantidadeMed;
        this.quantidadeGnd = quantidadeGnd;
    }
    
    public ModeloLanches(int quantidadeLeite, int quantidadeMeioAmargo){
        this.quantidadeLeite = quantidadeLeite;
        this.quantidadeMeioAmargo = quantidadeMeioAmargo;
//        this.quantidadeMed = 0;
//        this.quantidadeGnd = 0;
//        this.precoGnd = 0;
//        this.precoMed = 0;
    }
    

    public float getPrecoPeq() {
        return precoPeq;
    }

    public void setPrecoPeq(float precoPeq) {
        this.precoPeq = precoPeq;
    }

    public float getPrecoMed() {
        return precoMed;
    }

    public void setPrecoMed(float precoMed) {
        this.precoMed = precoMed;
    }

    public float getPrecoGnd() {
        return precoGnd;
    }

    public void setPrecoGnd(float precoGnd) {
        this.precoGnd = precoGnd;
    }
    
    


    public int getQuantidadePeq() {
        return quantidadePeq;
    }

    public void setQuantidadePeq(int quantidadePeq) {
        this.quantidadePeq = quantidadePeq;
    }

    public int getQuantidadeMed() {
        return quantidadeMed;
    }

    public void setQuantidadeMed(int quantidadeMed) {
        this.quantidadeMed = quantidadeMed;
    }

    public int getQuantidadeGnd() {
        return quantidadeGnd;
    }

    public void setQuantidadeGnd(int quantidadeGnd) {
        this.quantidadeGnd = quantidadeGnd;
    }


    
    
    
    
    
}
