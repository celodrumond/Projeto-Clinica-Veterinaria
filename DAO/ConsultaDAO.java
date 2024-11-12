/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;


import Entidades.Consulta;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class ConsultaDAO {

    public void create(Consulta consulta) throws SQLException {
        String sql = "INSERT INTO consultas (data, horario, relatorio, id_veterinario, id_animal) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, new Date(consulta.getData().getTime()));
            stmt.setString(2, consulta.getHorario());
            stmt.setString(3, consulta.getRelatorio());
            stmt.setInt(4,consulta.getVeterinario());
            stmt.setInt(5,consulta.getAnimal());
            stmt.executeUpdate();
        }
    }
    
public List<String> consultaHorarios(int id, Date data) throws SQLException {
    String sql = "SELECT horario FROM consultas WHERE id_veterinario = ? AND data = ?";
    List<String> lista = new ArrayList<>();
    
    try (Connection conn = ConexaoDAO.getConnection(); 
        PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, id);
        stmt.setDate(2, data);
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            lista.add(rs.getString("horario"));
            System.out.println("while");
        }
    }
    return lista;
}


public List<Consulta> readPerAnimal(int id_animal) throws SQLException {
    String sql = "SELECT * FROM consultas WHERE id_animal = ?";
    List<Consulta> consultas = new ArrayList<>();
    try (Connection conn = ConexaoDAO.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, id_animal);
        ResultSet rs = stmt.executeQuery();
        while (rs.next()) {
            Consulta consulta = new Consulta(
                rs.getDate("data"),
                rs.getString("horario"),
                rs.getString("relatorio"),
                rs.getInt("id_veterinario"),
                rs.getInt("id_animal")
            );
            consultas.add(consulta);
        }
    }
    return consultas;
}

public List<Consulta> readConsultasPerAnimalAndDate(String nome_animal, Date data_consulta) throws SQLException {
    String sql = "SELECT consultas.* FROM consultas "
               + "JOIN animais ON consultas.id_animal = animais.id "
               + "WHERE animais.nome = ? AND consultas.data = ?";
    
    List<Consulta> consultas = new ArrayList<>();
    
    try (Connection conn = ConexaoDAO.getConnection();
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        
        stmt.setString(1, nome_animal);
        stmt.setDate(2, data_consulta);
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {
            Consulta consulta = new Consulta(
                rs.getDate("data"),
                rs.getString("horario"),
                rs.getString("relatorio"),
                rs.getInt("id_veterinario"),
                rs.getInt("id_animal")
            );
            consultas.add(consulta);
        }
    }
    
    return consultas;
}

public List<Consulta> readByDateAndVeterinario(Date dataConsulta, int id_veterinario) throws SQLException {
        List<Consulta> consultas = new ArrayList<>();
        String sql = "SELECT * FROM consultas WHERE data = ? AND id_veterinario= ? ORDER BY horario";
        
        try (Connection conn = ConexaoDAO.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, new java.sql.Date(dataConsulta.getTime()));
            stmt.setInt(2, id_veterinario);
           
            try (ResultSet rs = stmt.executeQuery()) {
                while (rs.next()) {
                    consultas.add(new Consulta(
                        rs.getDate("data"),
                        rs.getString("horario"),
                        rs.getString("relatorio"),
                        rs.getInt("id_veterinario"),
                        rs.getInt("id_animal")
                    ));
                }
            }
        }
        return consultas;
    }


    public List<Consulta> readAll() throws SQLException {
        List<Consulta> consultas = new ArrayList<>();
        String sql = "SELECT * FROM consultas";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                consultas.add(new Consulta(
                    rs.getDate("data"),
                    rs.getString("horario"),
                    rs.getString("relatorio"),
                    rs.getInt("id_veterinario"),
                    rs.getInt("id_animal")
                ));
            }
        }
        return consultas;
    }

    public void update(int id, Consulta consulta) throws SQLException {
        String sql = "UPDATE consultas SET data = ?, relatorio = ? WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setDate(1, new Date(consulta.getData().getTime()));
            stmt.setString(2, consulta.getRelatorio());
            stmt.setInt(3, id);
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM consultas WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
