package cinema_cliente;


import java.util.ArrayList;



// @author mugen

public class Compra {
    private int idCompra;
    private float valorTotal;
    private String data;
    ArrayList<Ticket> ingressos;
    ArrayList<LancheItens> lanches;
    LancheItens lancheItens;


    public Compra() {
    }

    
    public Compra(int idCompra, float valorTotal, String data) {
        this.idCompra = idCompra;
        this.valorTotal = valorTotal;
        this.data = data;
        
        this.lanches = new ArrayList<LancheItens>();
        this.ingressos = new ArrayList<Ticket>();
    }

    public ArrayList<Ticket> getIngressos() {
        return ingressos;
    }

    public void setIngressos(ArrayList<Ticket> ingressos) {
        this.ingressos = ingressos;
    }

    public ArrayList<LancheItens> getLanches() {
        return lanches;
    }

    
    public Ticket getIngresso(int index) {
        return ingressos.get(index);
    }

    public void setIngresso(Ticket ingresso) {
        this.ingressos.add(ingresso);    
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


    public LancheItens getLancheItens() {
        return lancheItens;
    }

    public void setLancheItens(LancheItens lancheItens) {
        this.lancheItens = lancheItens;
    }
    

        
    public void calcularValorTotal() {
        
    }


}
