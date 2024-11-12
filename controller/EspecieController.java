/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.EspecieDAO;
import Entidades.Especie;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcelo
 */
public class EspecieController {
    
    private final EspecieDAO dao = new EspecieDAO();
    
    public int cadastrarEspecie(Especie especie){
        
        try {
            dao.create(especie);
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(EspecieController.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }
    
    public List<Especie> listarEspecie(){
        List<Especie> lista;
        try {
            lista = dao.readAll();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(EspecieController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
    }
    
}
