package cinema_cliente;


import java.util.ArrayList;



// @author mugen

public class Compra {
    private int idCompra;
    private float valorTotal;
    private String data;
    ArrayList<Ingresso> ingressos;
    LancheItens lancheItens;


    public Compra() {
    }

    public Compra(int idCompra, float valorTotal, String data) {
        this.idCompra = idCompra;
        this.valorTotal = valorTotal;
        this.data = data;
        this.ingressos = ingressos;
        this.lancheItens = lancheItens;
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

    public ArrayList<Ingresso> getIngressos() {
        return ingressos;
    }

    public void setIngressos(ArrayList<Ingresso> ingressos) {
        this.ingressos = ingressos;
    }

    public LancheItens getLancheItens() {
        return lancheItens;
    }

    public void setLancheItens(LancheItens lancheItens) {
        this.lancheItens = lancheItens;
    }
    

    
        
    public void calcularValorTotal() {
        
    }


}
