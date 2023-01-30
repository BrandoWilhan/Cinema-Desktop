
package cinema_cliente;

/**
 *
 * @author joaou
 */
public class Sala {
    
    private int numeroSala;
    private boolean fileiraA[] = {true, true, true, true, true, true};
    private boolean fileiraB[] = {true, true, true, true, true, true};
    private boolean fileiraC[] = {true, true, true, true, true, true};
    private boolean fileiraD[] = {true, true, true, true};
    
    
    private Cinema cinema;
    private Filme filme;

    public Sala() {
    }

    public Sala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public int getNumeroSala() {
        return numeroSala;
    }

    public boolean[] getFileiraA() {
        return fileiraA;
    }

    public boolean[] getFileiraB() {
        return fileiraB;
    }

    public boolean[] getFileiraC() {
        return fileiraC;
    }

    public boolean[] getFileiraD() {
        return fileiraD;
    }

    public Cinema getCinema() {
        return cinema;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setNumeroSala(int numeroSala) {
        this.numeroSala = numeroSala;
    }

    public void setFileiraA(boolean[] fileiraA) {
        this.fileiraA = fileiraA;
    }

    public void setFileiraB(boolean[] fileiraB) {
        this.fileiraB = fileiraB;
    }

    public void setFileiraC(boolean[] fileiraC) {
        this.fileiraC = fileiraC;
    }

    public void setFileiraD(boolean[] fileiraD) {
        this.fileiraD = fileiraD;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
}
