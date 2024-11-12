package DAO;

import Entidades.Tratamento;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class TratamentoDAO {

    public void create(Tratamento tratamento) throws SQLException {
        String sql = "INSERT INTO tratamentos (nome, data_inicio, data_final, descricao_inicio, descricao_fim, status, id_animal) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tratamento.getNome());
            stmt.setDate(2, (Date) tratamento.getDataInicio());
            stmt.setDate(3, (Date) tratamento.getDataFim());
            stmt.setString(4, tratamento.getDescricaoInicio());
            stmt.setString(5, tratamento.getDescricaoFim());
            stmt.setInt(6, 0);
            stmt.setInt(7, tratamento.getId_animal());
            stmt.executeUpdate();
        }
    }

    public Tratamento read(int id) throws SQLException {
        String sql = "SELECT * FROM tratamentos WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Tratamento(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getDate("data_inicio"),
                    rs.getDate("data_fim"),
                    rs.getString("descricao_inicio"),
                    rs.getString("descricao_fim"),
                    rs.getInt("status"),
                    rs.getInt("id_animal")
                );
            }
        }
        return null;
    }
    
    
    public List<Tratamento> readAll() throws SQLException {
        List<Tratamento> tratamentos = new ArrayList<>();
        String sql = "SELECT * FROM tratamentos";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                tratamentos.add(new Tratamento(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getDate("data_inicio"),
                    rs.getDate("data_fim"),
                    rs.getString("descricao_inicio"),
                    rs.getString("descricaoFim"),
                    rs.getInt("status"),
                    rs.getInt("id_animal")
                ));
            }
        }
        return tratamentos;
    }

    public List<Tratamento> readPerAnimal(int id_animal) throws SQLException {
    List<Tratamento> tratamentos = new ArrayList<>();
    String sql = "SELECT * FROM tratamentos WHERE id_animal = ? AND status = 0";

    try (Connection conn = ConexaoDAO.getConnection(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {
         stmt.setInt(1, id_animal);
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                tratamentos.add(new Tratamento(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getDate("data_inicio"),
                    rs.getDate("data_final"),
                    rs.getString("descricao_inicio"),
                    rs.getString("descricao_fim"),
                    rs.getInt("status"),
                    rs.getInt("id_animal")
                ));
            }
        }
    }
    return tratamentos;
}
    
    public List<Tratamento> readPerAnimalAllStatus(int id_animal) throws SQLException {
    List<Tratamento> tratamentos = new ArrayList<>();
    String sql = "SELECT * FROM tratamentos WHERE id_animal = ?";

    try (Connection conn = ConexaoDAO.getConnection(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {
         stmt.setInt(1, id_animal);
        try (ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                tratamentos.add(new Tratamento(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getDate("data_inicio"),
                    rs.getDate("data_final"),
                    rs.getString("descricao_inicio"),
                    rs.getString("descricao_fim"),
                    rs.getInt("status"),
                    rs.getInt("id_animal")
                ));
            }
        }
    }
    return tratamentos;
}


    public void updateFinal(Tratamento tratamento) throws SQLException {
        String sql = "UPDATE tratamentos SET descricao_fim = ?, data_final = ?, status = 1 WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, tratamento.getDescricaoFim());
            stmt.setDate(2, (Date) tratamento.getDataFim());
            stmt.setInt(3, tratamento.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM tratamentos WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}

