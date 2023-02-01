
package cinema_cliente;

/**
 *
 * @author breno
 */
public class Filme {
 
    private String titulo, classificacao;
    private String[] elenco;
    private Sala sala;
    Genero genero = new Genero();

    public Filme() {
    }

    public Filme(String titulo, String classificacao, Sala sala) {
        this.titulo = titulo;
        this.classificacao = classificacao;
        this.sala = sala;
    }
   

    public String getTitulo() {
        return titulo;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public String[] getElenco() {
        return elenco;
    }

    public Sala getSala() {
        return sala;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setClassificacao(String classificacao) {
        this.classificacao = classificacao;
    }

    public void setElenco(String[] elenco) {
        this.elenco = elenco;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }
    
    

    


    
    
    
    
}
