
package cinema_cliente;

/**
 *
 * @author joaou
 */
public class Ingresso {
    
    private int id;
    private boolean meiaEntrada;
    private double valorIngresso;
    private float horarioSessao;

    public Ingresso(){
        
    }
    
    public Ingresso(int id, boolean meiaEntrada, double valorIngresso, float horarioSessao) {
        this.id = id;
        this.meiaEntrada = meiaEntrada;
        this.valorIngresso = valorIngresso;
        this.horarioSessao = horarioSessao;
    }

    public int getId() {
        return id;
    }

    public boolean isMeiaEntrada() {
        return meiaEntrada;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public float getHorarioSessao() {
        return horarioSessao;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMeiaEntrada(boolean meiaEntrada) {
        this.meiaEntrada = meiaEntrada;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public void setHorarioSessao(float horarioSessao) {
        this.horarioSessao = horarioSessao;
    }
    
    
    
    
}
