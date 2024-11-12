package controller;

import DAO.VeterinarioDAO;
import Entidades.Veterinario;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author marcelo
 */
public class VeterinarioController {
    
    private VeterinarioDAO dao  = new VeterinarioDAO();
    
    public int cadastroVeterinario(Veterinario veterinario){
        try {
            dao.create(veterinario);
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(VeterinarioController.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }
    }
    
    public List<Veterinario> listarVeterinarios(){
        try {
            List<Veterinario> lista = dao.readAll();
            return lista;
        } catch (SQLException ex) {
            Logger.getLogger(VeterinarioController.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int alterarVeterinario(Veterinario veterinario){
        try {
            dao.update(veterinario);
            return 0;
        } catch (SQLException ex) {
            Logger.getLogger(VeterinarioController.class.getName()).log(Level.SEVERE, null, ex);
            return 1;
        }    
    }
    
}

