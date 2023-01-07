
package cinema;

// @author mugen

public class Item
{
    
    private int idItem;
    private static int quantidade = 0;
    // Lanche compõe Item
    //ArrayList<Lanche> lanches;
    // Ingresso compõe Item
    //ArrayList<Ingresso> ingressos;

    public Item(int idItem)
    {
        this.idItem = idItem;
        this.quantidade++;
    }

    
    public int getIdItem()
    {
        return idItem;
    }

    public void setIdItem(int idItem)
    {
        this.idItem = idItem;
    }

    public static int getQuantidade()
    {
        return quantidade;
    }

    public static void setQuantidade(int quantidade)
    {
        Item.quantidade = quantidade;
    }

}
