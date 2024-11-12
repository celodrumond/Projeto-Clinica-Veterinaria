/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author marcelo
 */
import Entidades.Exame;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ExameDAO {

    public void create(Exame exame) throws SQLException {
        String sql = "INSERT INTO exames (nome, resultado) VALUES (?, ?)";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, exame.getNome());
            stmt.setString(2, exame.getResultado());
            stmt.executeUpdate();
        }
    }

    public Exame read(int id) throws SQLException {
        String sql = "SELECT * FROM exames WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Exame(
                    rs.getString("nome"),
                    rs.getString("resultado")
                );
            }
        }
        return null;
    }

    public List<Exame> readAll() throws SQLException {
        List<Exame> exames = new ArrayList<>();
        String sql = "SELECT * FROM exames";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                exames.add(new Exame(
                    rs.getString("nome"),
                    rs.getString("resultado")
                ));
            }
        }
        return exames;
    }

    public void update(int id, Exame exame) throws SQLException {
        String sql = "UPDATE exames SET nome = ?, resultado = ? WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, exame.getNome());
            stmt.setString(2, exame.getResultado());
            stmt.setInt(3, id);
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM exames WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
