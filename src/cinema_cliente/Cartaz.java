
package cinema_cliente;

import java.util.ArrayList;

/**
 *
 * @author joaou
 */
public class Cartaz {
    
    private float dataModificacao;
    private int numeroOpcoes;
    
    private Cinema cinema;
    
    ArrayList<Filme> filmes;

    public Cartaz() {
    }

    public Cartaz(float dataModificacao, int numeroOpcoes) {
        this.dataModificacao = dataModificacao;
        this.numeroOpcoes = numeroOpcoes;
    }

    public float getDataModificacao() {
        return dataModificacao;
    }

    public int getNumeroOpcoes() {
        return numeroOpcoes;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public ArrayList<Filme> getFilmes() {
        return filmes;
    }

    public void setDataModificacao(float dataModificacao) {
        this.dataModificacao = dataModificacao;
    }

    public void setNumeroOpcoes(int numeroOpcoes) {
        this.numeroOpcoes = numeroOpcoes;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }
    
    public void setFilmes(ArrayList<Filme> filmes) {
        this.filmes = filmes;
    }
    
    
    
    
    
    
    
}
