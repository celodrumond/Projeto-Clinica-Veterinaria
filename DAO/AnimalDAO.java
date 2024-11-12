/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

/**
 *
 * @author marcelo
 */

import Entidades.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AnimalDAO {

    public void create(Animal animal, Cliente cliente, Especie especie) throws SQLException {
        String sql = "INSERT INTO animais (cliente_id, nome, idade, sexo, peso, especie_id) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = ConexaoDAO.getConnection(); 
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setInt(1, cliente.getId());
            stmt.setString(2, animal.getNome());
            stmt.setInt(3, animal.getIdade());
            stmt.setString(4, animal.getSexo());
            stmt.setDouble(5, animal.getPeso());
            stmt.setInt(6, animal.getEspecie().getId()); 
            stmt.executeUpdate();
        }
    }

    public Animal read(int id) throws SQLException {
        String sql = "SELECT * FROM animais WHERE id = ?";
       
        try (Connection conn = ConexaoDAO.getConnection(); 
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                Especie especie = new Especie(rs.getString("especie_nome"), rs.getInt("especie_id")); // Adicionando o id
                return new Animal(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getInt("idade"),
                    rs.getString("sexo"),
                    rs.getDouble("peso"),
                    especie
                );
            }
        }
        return null;
    }

    public List<Animal> readAll() throws SQLException {
        List<Animal> animais = new ArrayList<>();
        String sql = "SELECT a.*, e.nome AS especie_nome, e.id AS especie_id FROM animais a " +
                     "JOIN especies e ON a.especie_id = e.id";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Especie especie = new Especie(rs.getString("especie_nome"), rs.getInt("especie_id")); // Adicionando o id
                animais.add(new Animal(
                    rs.getInt("id"),
                    rs.getString("nome"),
                    rs.getInt("idade"),
                    rs.getString("sexo"),
                    rs.getDouble("peso"),
                    especie
                ));
            }
        }
        return animais;
    }
    
public List<Animal> animaisDeUmCliente(int id_cliente) throws SQLException {
    List<Animal> animais = new ArrayList<>();
    String sql = "SELECT a.id, a.nome AS animal_nome, a.idade, a.sexo, a.peso, e.nome AS especie_nome, e.id AS especie_id " +
                 "FROM animais a " +
                 "JOIN especies e ON a.especie_id = e.id " +
                 "WHERE a.cliente_id = ?";

    try (Connection conn = ConexaoDAO.getConnection(); 
         PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setInt(1, id_cliente);  // Definindo o ID do cliente como parâmetro
        
        try (ResultSet rs = stmt.executeQuery()) {  
            while (rs.next()) {
                // Criação do objeto Especie a partir dos resultados da tabela especies
                Especie especie = new Especie(rs.getString("especie_nome"), rs.getInt("especie_id"));
                // Adicionando um novo Animal à lista
                animais.add(new Animal(
                    rs.getInt("id"),
                    rs.getString("animal_nome"),
                    rs.getInt("idade"),
                    rs.getString("sexo"),
                    rs.getDouble("peso"),
                    especie
                ));
            }
        }
    }
    return animais;  // Retornando a lista de animais
}

    public void update(Animal animal, Cliente cliente, Especie especie) throws SQLException {
        String sql = "UPDATE animais SET cliente_id = ?, nome = ?, idade = ?, sexo = ?, peso = ?, especie_id = ? WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, cliente.getId());
            stmt.setString(2, animal.getNome());
            stmt.setInt(3, animal.getIdade());
            stmt.setString(4, animal.getSexo());
            stmt.setDouble(5, animal.getPeso());
            stmt.setInt(6, especie.getId());
            stmt.setInt(7, animal.getId());
            stmt.executeUpdate();
        }
    }

    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM animais WHERE id = ?";
        try (Connection conn = ConexaoDAO.getConnection(); 
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        }
    }
}

