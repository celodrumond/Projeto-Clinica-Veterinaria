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

public class Consulta {
    private  Date data;
    private  int id_veterinario;
    private  int id_animal;
    private  String relatorio;
    private  String horario;

    public Consulta(Date data,String horario, String relatorio, int id_veterinario, int id_animal) {
        this.data = data;
        this.id_veterinario = id_veterinario;
        this.id_animal = id_animal;
        this.relatorio = relatorio;
        this.horario = horario;
    }

    public Consulta() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    @Override
    public String toString() {
        return data.toString();
    }

    public Date getData() { return data; }
    public String getRelatorio() { return relatorio; }
    public String getHorario() { return horario; }
    public int getVeterinario(){return id_veterinario;}
    public int getAnimal(){return id_animal;}
    
}

