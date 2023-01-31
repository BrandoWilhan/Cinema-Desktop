package cinema_cliente;

import java.util.ArrayList;

// @author mugen
 
public class Cliente {
//    private boolean estudante;
    private String nome;
    private String cpfCliente;
    private String dataNascimento;
    // cartao
    ArrayList<Cartao> cartoes;

    public Cliente(String nome, String cpfCliente, String dataNascimento, ArrayList<Cartao> cartoes) {
        this.nome = nome;
        this.cpfCliente = cpfCliente;
        this.dataNascimento = dataNascimento;
        this.cartoes = cartoes;
    }


    public Cliente(String nome, String cpfCliente, String dataNascimento) {
        this.nome = nome;
        this.cpfCliente = cpfCliente;
        this.dataNascimento = dataNascimento;
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

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setIdade(short idade) {
        this.dataNascimento = dataNascimento;
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
