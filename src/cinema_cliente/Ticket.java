
package cinema_cliente;

/**
 *
 * @author joaou
 */
public class Ticket {
    
    private int id;

    private int quantidadeInteira;
    private int quantidadeMeia;
    private int quantidadeTotal;
    private Filme filme;
    

    public Ticket(){
        
    }


    public Ticket(int quantidadeInteira, int quantidadeMeia, int quantidadeTotal, Filme filme) {
        this.quantidadeInteira = quantidadeInteira;
        this.quantidadeMeia = quantidadeMeia;
        this.quantidadeTotal = quantidadeTotal;
        this.filme = filme;
    }

    public int getQuantidadeTotal() {
        return quantidadeTotal;
    }

    public void setQuantidadeTotal(int quantidadeTotal) {
        this.quantidadeTotal = quantidadeTotal;
    }
    
    

    public int getId() {
        return id;
    }


    public int getQuantidadeInteira() {
        return quantidadeInteira;
    }

    public int getQuantidadeMeia() {
        return quantidadeMeia;
    }

    public void setId(int id) {
        this.id = id;
    }


    public void setQuantidadeInteira(int quantidadeInteira) {
        this.quantidadeInteira = quantidadeInteira;
    }

    public void setQuantidadeMeia(int quantidadeMeia) {
        this.quantidadeMeia = quantidadeMeia;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
    
    
    
   
    
    
}
