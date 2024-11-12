/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import DAO.*;
import Entidades.Cliente;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcelo
 */
public class ClienteController {
    
    private final ClienteDAO clienteDAO = new ClienteDAO();
    
    public int cadastroCliente(Cliente cliente){
        try {
            clienteDAO.create(cliente);
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
        
    }
    
    public List<Cliente> listarClientes (){
        
        List<Cliente> lista;
        try {
            lista = clienteDAO.readAll();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public int alterarCliente(Cliente cliente){
        try {
            clienteDAO.update(cliente.getId(), cliente);
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(ClienteController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 1;
    }
}
