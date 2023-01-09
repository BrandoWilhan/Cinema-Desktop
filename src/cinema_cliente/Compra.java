package cinema_cliente;


import java.util.ArrayList;
import java.util.Date;


// @author mugen

public class Compra
{
    private int idCompra;
    private float valorTotal;
    private Date data;
    ArrayList<Item> itens;
    
    
    public Compra(int idCompra, float valorTotal, Date data)
    {
        this.itens = new ArrayList();
        this.idCompra = idCompra;
        this.valorTotal = valorTotal;
        this.data = data;
    }

    public int getIdCompra()
    {
        return idCompra;
    }

    public void setIdCompra(int idCompra)
    {
        this.idCompra = idCompra;
    }

    public float getValorTotal()
    {
        return valorTotal;
    }

    public void setValorTotal(float valorTotal)
    {
        this.valorTotal = valorTotal;
    }

    public Date getData()
    {
        return data;
    }

    public void setData(Date data)
    {
        this.data = data;
    }
    
    public void calcularValorTotal()
    {
        
    }


}
