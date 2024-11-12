/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author marcelo
 */
public class Exame {
    private String nome;
    private String resultado;

    public Exame(String nome, String resultado) {
        this.nome = nome;
        this.resultado = resultado;
    }

    public String getNome() { return nome; }
    public String getResultado() { return resultado; }
}

