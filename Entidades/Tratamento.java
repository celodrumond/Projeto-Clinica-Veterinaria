/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author marcelo
 */
import java.util.Date;

public class Tratamento {
    private int id;
    private Date dataInicio;
    private Date dataFim;
    private String nome;
    private String descricaoInicio;
    private String descricaoFim;
    private int id_animal;
    private int status;

    
    @Override
    public String toString() {
        return nome;
    }
    
    public void setId(int id) {
        this.id = id;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricaoInicio(String descricaoInicio) {
        this.descricaoInicio = descricaoInicio;
    }

    public void setDescricaoFim(String descricaoFim) {
        this.descricaoFim = descricaoFim;
    }

    public void setId_animal(int id_animal) {
        this.id_animal = id_animal;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getDescricaoInicio() {return descricaoInicio;}

    public String getDescricaoFim() {return descricaoFim;}

    public int getId_animal() {return id_animal;}
    
    public int getStatus(){return status;}
    public int getId(){return id;}


    public Tratamento(int id, String nome, Date dataInicio, Date dataFim,String descricaoInicio, String descricaoFim, int status,int id_animal) {
        this.id = id;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.nome = nome;
        this.id_animal = id_animal;
        this.descricaoFim = descricaoFim;
        this.descricaoInicio = descricaoInicio;
        this.status = status;
    }

    public Date getDataInicio() { return dataInicio; }
    public Date getDataFim() { return dataFim; }
    public String getNome() {return nome;}
}

