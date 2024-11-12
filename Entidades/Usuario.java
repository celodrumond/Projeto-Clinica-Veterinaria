/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author marcelo
 */
public class Usuario {
    private int id;
    private String nome;
    private String endereco;
    private String cep;
    private String telefone;
    private String email;

    public Usuario(int id, String nome, String endereco, String cep, String telefone, String email) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.cep = cep;
        this.telefone = telefone;
        this.email = email;
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public String getEndereco() { return endereco; }
    public String getCep() { return cep; }
    public String getTelefone() { return telefone; }
    public String getEmail() { return email; }
    public void setId(int id) {this.id = id;}
    public void setNome(String nome) {this.nome = nome;}
    public void setEndereco(String endereco) {this.endereco = endereco;}
    public void setCep(String cep) {this.cep = cep;}
    public void setTelefone(String telefone) {this.telefone = telefone;}
    public void setEmail(String email) {this.email = email;}

}

