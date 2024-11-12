/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author marcelo
 */
public class Animal {
    private int id;
    private String nome;
    private int idade;
    private String sexo;
    private double peso;
    private Especie especie;

    public Animal(int id, String nome, int idade, String sexo, double peso, Especie especie) {
        this.id = id;
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
        this.peso = peso;
        this.especie = especie;
    }
    
    @Override
    public String toString() {
        return this.getNome();
    }

    public int getId() { return id; }
    public String getNome() { return nome; }
    public int getIdade() { return idade; }
    public String getSexo() { return sexo; }
    public double getPeso() { return peso; }
    public Especie getEspecie() { return especie; }
    
    public void setId(int id) {this.id = id;}
    public void setNome(String nome) {this.nome = nome;}
    public void setIdade(int idade) {this.idade = idade;}
    public void setSexo(String sexo) {this.sexo = sexo;}
    public void setPeso(double peso) {this.peso = peso;}
    public void setEspecie(Especie especie) {this.especie = especie;}

}

