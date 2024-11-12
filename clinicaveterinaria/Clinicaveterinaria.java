/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clinicaveterinaria;

import DAO.*;
import Entidades.*;
import controller.AnimalController;
import controller.ClienteController;
import controller.EspecieController;
import controller.HistoricoController;
import controller.TratamentoController;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import view.TelaInicial;


public class Clinicaveterinaria {


    public static void main(String[] args) throws SQLException {
        
        JFrame frame = new JFrame("Clinica Veterinária");

        // Define o comportamento de fechar a janela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        TelaInicial telaInicial = new TelaInicial();


        frame.add(telaInicial);


        frame.pack();


        frame.setVisible(true);
    }
        
}
    
