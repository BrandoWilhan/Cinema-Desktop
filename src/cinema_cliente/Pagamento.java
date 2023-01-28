
package cinema_cliente;

/**
 *
 * @author mugen
 */
public class Pagamento {
    
    private float valor;
    //cliente
    private Cliente cliente;
    private Compra compra;

    public Pagamento(float valor, Cliente cliente) {
        this.valor = valor;
        this.cliente = cliente;
    }
    
    public boolean validar() {
        return true;
    }
}
