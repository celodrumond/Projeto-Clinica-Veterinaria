/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.AnimalDAO;
import Entidades.*;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcelo
 */
public class AnimalController {
    
    private final AnimalDAO dao = new AnimalDAO();
    
    public int cadastrarAnimal(Animal animal, Cliente cliente, Especie especie){
        
        try {
            dao.create(animal, cliente, especie);
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(AnimalController.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    
    }
    
    public int alterarAnimal(Especie especie, Cliente cliente, Animal animal){
        try {
            dao.update(animal, cliente, especie);
            return 1;
        } catch (SQLException ex) {
            Logger.getLogger(AnimalController.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    public List<Animal> listarAnimaisDeUmCliente(int cliente_id){
        try {
            List<Animal> lista = dao.animaisDeUmCliente(cliente_id);
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(AnimalController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
}
