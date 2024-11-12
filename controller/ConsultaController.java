/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.AnimalDAO;
import DAO.ConsultaDAO;
import DAO.VeterinarioDAO;
import Entidades.Animal;
import Entidades.Consulta;
import Entidades.Veterinario;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.tree.DefaultMutableTreeNode;
import java.util.HashMap;
import java.util.Map;
import javax.swing.tree.DefaultMutableTreeNode;

public class ConsultaController {
    
    private final ConsultaDAO dao = new ConsultaDAO();
    private final AnimalDAO daoAnimal = new AnimalDAO();
    private final Map<DefaultMutableTreeNode, Consulta> consultaMap = new HashMap<>();
    
    public int marcaConsulta(Consulta consulta){
        try {
            dao.create(consulta);
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaController.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }
    
    public List<String> consultaHorarios(int id, Date data){
        try {
            List<String> horariosOcupados = dao.consultaHorarios(id,data);
            String[] array = {"08:00", "09:00", "10:00", "11:00", "12:00", "13:00", "14:00", "15:00", "16:00", "17:00"};
            List<String> horariosDisponiveis = new ArrayList<>(Arrays.asList(array));
            horariosDisponiveis.removeAll(horariosOcupados);
            return horariosDisponiveis;
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public DefaultMutableTreeNode visualizaConsultas(Date data, Veterinario veterinario) {
           DefaultMutableTreeNode raiz = new DefaultMutableTreeNode(veterinario.getNome());
           try {
               List<Consulta> consultas = dao.readByDateAndVeterinario(data, veterinario.getId());

               for (Consulta consulta : consultas) {
                   DefaultMutableTreeNode consultaNode = new DefaultMutableTreeNode(consulta.getHorario());
                   consultaMap.put(consultaNode, consulta);
                   raiz.add(consultaNode);
                   Animal animal = retornaAnimal(consulta.getAnimal());
                   if (animal != null) {
                       DefaultMutableTreeNode detalhesNode = new DefaultMutableTreeNode(animal);
                       consultaNode.add(detalhesNode);
                   }
               }
           } catch (SQLException ex) {
               Logger.getLogger(ConsultaController.class.getName()).log(Level.SEVERE, null, ex);
           }
           return raiz;
       }
    
    public Consulta getConsulta(DefaultMutableTreeNode node) {
        return consultaMap.get(node);
    }

    
    public Animal retornaAnimal(int id){
        List<Animal> animais = new ArrayList<>();
        try {
            animais = daoAnimal.readAll();
            for(Animal animal : animais){
                if(animal.getId() == id){return animal;}
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConsultaController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
}
