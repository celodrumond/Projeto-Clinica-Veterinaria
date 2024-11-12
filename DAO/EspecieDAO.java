/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author marcelo
 */
import Entidades.Especie;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class EspecieDAO {

    public void create(Especie especie) throws SQLException {
        String sql = "INSERT INTO especies (nome) VALUES (?)";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, especie.getNome());
            stmt.executeUpdate();
        }
    }

    public Especie read(int id) throws SQLException {
        String sql = "SELECT * FROM especies WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Especie(
                    rs.getString("nome"),
                    rs.getInt("id")
                );
            }
        }
        return null;
    }

    public List<Especie> readAll() throws SQLException {
        List<Especie> especies = new ArrayList<>();
        String sql = "SELECT * FROM especies";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                especies.add(new Especie(
                    rs.getString("nome"),
                    rs.getInt("id")
                ));
            }
        }
        return especies;
    }

    public void update(int id, Especie especie) throws SQLException {
        String sql = "UPDATE especies SET nome = ? WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, especie.getNome());
            stmt.setInt(2, id);
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM especies WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}
