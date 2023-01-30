package cinema_cliente;

import java.util.ArrayList;

// @author mugen
 
public class Cliente {
//    private boolean estudante;
    private String nome;
    private String cpfCliente;
    private short idade;
    // cartao
    ArrayList<Cartao> cartoes;

    public Cliente(String nome, String cpfCliente, short idade, ArrayList<Cartao> cartoes) {
        this.nome = nome;
        this.cpfCliente = cpfCliente;
        this.idade = idade;
        this.cartoes = cartoes;
    }
    
    public Cliente(String nome, String cpfCliente, short idade, Cartao cartao) {
        this.nome = nome;
        this.cpfCliente = cpfCliente;
        this.idade = idade;
        this.setCartoes(cartoes);
    }

    public Cliente() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpfCliente() {
        return cpfCliente;
    }

    public void setCpfCliente(String cpfCliente) {
        this.cpfCliente = cpfCliente;
    }

    public short getIdade() {
        return idade;
    }

    public void setIdade(short idade) {
        this.idade = idade;
    }

    public ArrayList<Cartao> getCartoes() {
        return cartoes;
    }

    public void setCartoes(ArrayList<Cartao> cartoes) {
        this.cartoes = cartoes;
    }
    
    public Cartao getCartoes(int index) {
        return cartoes.get(index);
    }

    public void setCartoes(Cartao cartao) {
        this.cartoes.add(cartao);
    }

    
    
}
