/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cinema_cliente;

/**
 *
 * @author breno
 */
public class Genero {
    private String nome;
    private int id;

    public Genero(String nome, int id) {
        this.nome = nome;
        this.id = id;
    }

    public Genero() {
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
  
    
}
