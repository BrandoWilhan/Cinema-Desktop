
package cinema_cliente;

/**
 *
 * @author joaou
 */
public class Sala {
    
    private String numeroSala;
    
    private Cinema cinema;
    private Filme filme;

    public Sala() {
    }

    public Sala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

    public String getNumeroSala() {
        return numeroSala;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setNumeroSala(String numeroSala) {
        this.numeroSala = numeroSala;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    
    
}
