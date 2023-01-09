
package cinema_cliente;

import java.util.ArrayList;

/**
 *
 * @author mugen
 */


public class Cinema
{
    private String nome;
    private String shopping;
    //lista de salas
    ArrayList<Sala> salas = new ArrayList();
    private Cartaz cartaz;

    public Cinema(String nome, String shopping, Cartaz cartaz)
    {
        this.nome = nome;
        this.shopping = shopping;
        this.cartaz = cartaz;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public String getShopping()
    {
        return shopping;
    }

    public void setShopping(String shopping)
    {
        this.shopping = shopping;
    }

    public ArrayList<Sala> getSalas()
    {
        return salas;
    }

    public void setSalas(ArrayList<Sala> salas)
    {
        this.salas = salas;
    }

    public Cartaz getCartaz()
    {
        return cartaz;
    }

    public void setCartaz(Cartaz cartaz)
    {
        this.cartaz = cartaz;
    }
    
    
}
