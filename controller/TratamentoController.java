/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.TratamentoDAO;
import Entidades.Tratamento;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcelo
 */
public class TratamentoController {
    
    private TratamentoDAO dao = new TratamentoDAO();
    
    public int cadastrarTratamento(Tratamento tratamento){
        try {
            dao.create(tratamento);
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(TratamentoController.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }
    
    public List<Tratamento> consultaTratamentosPorAnimal(int id_animal){List<Tratamento> lista = new ArrayList<>();
        try {
            lista = dao.readPerAnimal(id_animal);
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(TratamentoController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int atualizarTratamento(Tratamento tratamento){
        try {
            dao.updateFinal(tratamento);
            return 0;
        } catch (SQLException ex) {
            return 1;
        }
    }
    
}
