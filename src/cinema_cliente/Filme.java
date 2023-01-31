
package cinema_cliente;

/**
 *
 * @author breno
 */
public class Filme {
 
    private String titulo, diretor, duracao, sinopse;
    private String[] elenco;
    Genero genero = new Genero();

    public Filme(String titulo, String diretor, String duracao, String sinopse, String[] elenco) {
        this.titulo = titulo;
        this.diretor = diretor;
        this.duracao = duracao;
        this.sinopse = sinopse;
        this.elenco = elenco;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public String[] getElenco() {
        return elenco;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }
    
    
    
    
}
