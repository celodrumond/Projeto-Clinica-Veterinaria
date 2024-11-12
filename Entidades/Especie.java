/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author marcelo
 */
public class Especie {
    private String nome;
    private int id;

    public Especie(String nome, int id) {
        this.id = id;
        this.nome = nome;
    }

    public String getNome() { return nome; }
    public int getId(){return id;}

}
