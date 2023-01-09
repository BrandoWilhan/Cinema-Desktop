
package cinema_cliente;

/**
 *
 * @author joaou
 */
public class Sala {
    
    private int numeroSala;
    private int capacidade;
    private boolean TresD;
    private float horarioAbertura;
    private float horarioFecha;
    
    private Cinema cinema;
    private Filme filme;

    public Sala() {
    }

    public Sala(int numeroSala, int capacidade, boolean TresD, float horarioAbertura, float horarioFecha) {
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;
        this.TresD = TresD;
        this.horarioAbertura = horarioAbertura;
        this.horarioFecha = horarioFecha;
    }

    public Sala(int numeroSala, int capacidade, boolean TresD, float horarioAbertura, float horarioFecha, Cinema cinema) {
        this.numeroSala = numeroSala;
        this.capacidade = capacidade;
        this.TresD = TresD;
        this.horarioAbertura = horarioAbertura;
        this.horarioFecha = horarioFecha;
        this.cinema = cinema;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public boolean isTresD() {
        return TresD;
    }

    public float getHorarioAbertura() {
        return horarioAbertura;
    }

    public float getHorarioFecha() {
        return horarioFecha;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public void setTresD(boolean TresD) {
        this.TresD = TresD;
    }

    public void setHorarioAbertura(float horarioAbertura) {
        this.horarioAbertura = horarioAbertura;
    }

    public void setHorarioFecha(float horarioFecha) {
        this.horarioFecha = horarioFecha;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }


    
    
    
}
