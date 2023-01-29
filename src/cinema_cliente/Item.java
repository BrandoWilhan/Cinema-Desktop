
package cinema_cliente;

// @author mugen

import java.util.ArrayList;


public class Item {
    
    private int idItem;
    private int quantidade = 0;
    // Lanche compõe Item
    ArrayList<Lanche> lanches;
    // Ingresso compõe Item
    ArrayList<Ingresso> ingressos;

    public Item(int idItem) {
        this.idItem = idItem;
        this.quantidade++;
    }
    
    public Item(int idItem, ArrayList<Lanche> lanches, ArrayList<Ingresso> ingressos) {
        this.idItem = idItem;
        this.lanches = lanches;
        this.ingressos = ingressos;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    
    public ArrayList<Lanche> getLanches() {
        return lanches;
    }

    public void setLanches(ArrayList<Lanche> lanches) {
        this.lanches = lanches;
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(ArrayList<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }
    
    public Lanche getLanche(int index) {
        return this.lanches.get(index);
    }

    public void setLanches(Lanche lanche) {
        this.lanches.add(lanche);
    }

    public Ingresso getIngressos(int index) {
        return this.ingressos.get(index);
    }

    public void setIngressos(Ingresso ingresso) {
        this.ingressos.add(ingresso);
    }
    

}
