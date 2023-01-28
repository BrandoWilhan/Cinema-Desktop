
package cinema_cliente;

/**
 *
 * @author mugen
 */
public class Cartao {
    private String numero;
    private String cpf;
    private short cvc;

    public Cartao(String numero, String cpf, short cvc) {
        this.numero = numero;
        this.cpf = cpf;
        this.cvc = cvc;
    }

    public Cartao() {
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public short getCvc() {
        return cvc;
    }

    public void setCvc(short cvc) {
        this.cvc = cvc;
    }

    
}
