/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author marcelo
 */

import Entidades.Veterinario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class VeterinarioDAO {
    
    public void create(Veterinario veterinario) throws SQLException {
        String sql = "INSERT INTO veterinarios (nome, endereco, cep, telefone, email) VALUES (?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, veterinario.getNome());
            stmt.setString(2, veterinario.getEndereco());
            stmt.setString(3, veterinario.getCep());
            stmt.setString(4, veterinario.getTelefone());
            stmt.setString(5, veterinario.getEmail());
            stmt.executeUpdate();
        }
    }

    public Veterinario read(int id) throws SQLException {
        String sql = "SELECT * FROM veterinarios WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Veterinario(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("cep"),
                    rs.getString("telefone"),
                    rs.getString("email")
                );
            }
        }
        return null;
    }

    public List<Veterinario> readAll() throws SQLException {
        List<Veterinario> veterinarios = new ArrayList<>();
        String sql = "SELECT * FROM veterinarios";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                veterinarios.add(new Veterinario(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getString("endereco"),
                    rs.getString("cep"),
                    rs.getString("telefone"),
                    rs.getString("email")
                ));
            }
        }
        return veterinarios;
    }

    public void update(Veterinario veterinario) throws SQLException {
        String sql = "UPDATE veterinarios SET nome = ?, endereco = ?, cep = ?, telefone = ?, email = ? WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, veterinario.getNome());
            stmt.setString(2, veterinario.getEndereco());
            stmt.setString(3, veterinario.getCep());
            stmt.setString(4, veterinario.getTelefone());
            stmt.setString(5, veterinario.getEmail());
            stmt.setInt(6, veterinario.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM veterinarios WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}

