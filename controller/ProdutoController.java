
package controller;

import DAO.ProdutoDAO;
import Entidades.Produto;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ProdutoController {
    
    private final ProdutoDAO dao = new ProdutoDAO();
    
    public int cadastrarProduto(Produto produto){
        
        try {
            dao.create(produto);
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }
    
    public List<Produto> readProdutos (){
        try {
            List<Produto> lista = new ArrayList<>();
            lista = dao.readAll();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    
    }
    
    public int updateEstoque(Produto produto){
        try {
            dao.update(produto);
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoController.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }
    
}
