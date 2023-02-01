/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema_cliente;

import java.util.ArrayList;

/**
 *
 * @author breno
 */
public class LancheItens {
    
    private float precoTotal;
    Pipoca pipoca;
    Bebida bebida;
    Chocolate chocolate;
    ArrayList<ModeloLanches> lanches;

    public LancheItens(Pipoca pipoca, Bebida bebida, Chocolate chocolate) {
        this.pipoca = pipoca;
        this.bebida = bebida;
        this.chocolate = chocolate;
    }
    
    public LancheItens() {
        
    }
    
    public LancheItens(ArrayList<ModeloLanches> lanches) {
        this.lanches = lanches;
    }

    public ArrayList<ModeloLanches> getLanches() {
        return lanches;
    }

    public void setLanches(ArrayList<ModeloLanches> lanches) {
        this.lanches = lanches;
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
        
        precoTotal = 0;
        for (int i=0; i < lanches.size();i++){
            if (lanches.get(i) instanceof Pipoca){
                
                pipoca = (Pipoca) lanches.get(i);
                precoTotal = precoTotal + pipoca.calculoPreco();
                
            }else if (lanches.get(i) instanceof Bebida){
                
                bebida = (Bebida) lanches.get(i);
                precoTotal = precoTotal + bebida.calculoPreco();
                
            }else if (lanches.get(i) instanceof Chocolate){
                chocolate = (Chocolate) lanches.get(i);
                precoTotal = precoTotal + chocolate.calculoPreco();
            }
        }
        
        return precoTotal;
    }
    
}
