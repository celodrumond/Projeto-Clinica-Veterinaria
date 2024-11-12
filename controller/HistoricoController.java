/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.ConsultaDAO;
import DAO.TratamentoDAO;
import Entidades.Animal;
import Entidades.Consulta;
import Entidades.Tratamento;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;

public class HistoricoController {
    
    private final ConsultaDAO consultaDAO = new ConsultaDAO();
    private final TratamentoDAO tratamentoDAO = new TratamentoDAO();
    
    
    public DefaultMutableTreeNode getDados(Animal animal) throws SQLException{
        List<Consulta> listaConsulta = new ArrayList<>();
        List<Tratamento> listaTratamento = new ArrayList<>();
        listaConsulta = consultaDAO.readPerAnimal(animal.getId());
        listaTratamento = tratamentoDAO.readPerAnimalAllStatus(animal.getId());
        
        DefaultMutableTreeNode raiz = new DefaultMutableTreeNode(animal.getNome());
        DefaultMutableTreeNode consultas = new DefaultMutableTreeNode("Consultas");
        DefaultMutableTreeNode tratamentos = new DefaultMutableTreeNode("Tratamentos");
        
        if(!listaConsulta.isEmpty()){
            for (Consulta consulta : listaConsulta) {
                DefaultMutableTreeNode consultaNode = new DefaultMutableTreeNode(consulta);
                    consultas.add(consultaNode);
            }
            raiz.add(consultas);
        }
        
        
        if(!listaTratamento.isEmpty()) {
            for (Tratamento tratamento : listaTratamento) {
                DefaultMutableTreeNode tratamentoNode = new DefaultMutableTreeNode(tratamento);
                tratamentos.add(tratamentoNode);
            }
            raiz.add(tratamentos);
        }
        
        return raiz;   
    }
    
    public Consulta getConsultaPerAnimalAndDate(Animal animal, Date date){
        
//      Consulta consulta = consultaDAO.readConsultasPerAnimalAndDate(animal.getNome(), date);
        return null;
    }
    
}
