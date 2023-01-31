package cinema_cliente;


import java.util.ArrayList;
import java.util.Date;


// @author mugen

public class Compra {
    private int idCompra;
    private float valorTotal;
    private String data;
    ArrayList<Ingresso> ingressos;
    ArrayList<Lanche> lanches;

    public Compra(int idCompra, float valorTotal, String data) {
        this.idCompra = idCompra;
        this.valorTotal = valorTotal;
        this.data = data;
        this.lanches = new ArrayList<Lanche>();
        this.ingressos = new ArrayList<Ingresso>();
    }

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(ArrayList<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public ArrayList<Lanche> getLanches() {
        return lanches;
    }

    public void setLanches(ArrayList<Lanche> lanches) {
        this.lanches = lanches;
    }
    
    public Ingresso getIngresso(int index) {
        return ingressos.get(index);
    }

    public void setIngresso(Ingresso ingresso) {
        this.ingressos.add(ingresso);    
    }

    public Lanche getLanche(int index) {
        return lanches.get(index);
    }

    public void setLanche(Lanche lanche) {
        this.lanches.add(lanche);
    }

    public int getIdCompra() {
        return idCompra;
    }

    public void setIdCompra(int idCompra) {
        this.idCompra = idCompra;
    }

    public float getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal) {
        this.valorTotal = valorTotal;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
        
    public void calcularValorTotal() {
        
    }


}
