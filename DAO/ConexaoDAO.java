package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConexaoDAO {
    private static final String URL = "jdbc:mysql://localhost:3306/Projeto";
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; // Senha padrão vazia do mysql

    public static Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
        criarTabela(connection);
        return connection;
    }

    private static void criarTabela(Connection connection) throws SQLException {
        
    String sqlCriarTabelaClientes = "CREATE TABLE IF NOT EXISTS clientes ("
            + "id INT AUTO_INCREMENT PRIMARY KEY, "
            + "nome VARCHAR(100) NOT NULL, "
            + "endereco VARCHAR(200), "
            + "cep VARCHAR(20), "
            + "telefone VARCHAR(20), "
            + "email VARCHAR(100))";
    
    String sqlCriarTabelaVeterinarios = "CREATE TABLE IF NOT EXISTS veterinarios ("
            + "id INT AUTO_INCREMENT PRIMARY KEY, "
            + "nome VARCHAR(100) NOT NULL, "
            + "endereco VARCHAR(200), "
            + "cep VARCHAR(20), "
            + "telefone VARCHAR(20), "
            + "email VARCHAR(100))";

    String sqlCriarTabelaAnimais = "CREATE TABLE IF NOT EXISTS animais ("
            + "id INT AUTO_INCREMENT PRIMARY KEY, "
            + "cliente_id INT, "
            + "nome VARCHAR(100) NOT NULL, "
            + "idade INT, "
            + "sexo VARCHAR(20), "
            + "peso DECIMAL(5,2), "
            + "especie_id INT, "
            + "FOREIGN KEY (cliente_id) REFERENCES clientes(id))";
    
    String sqlCriarTabelaEspecies = "CREATE TABLE IF NOT EXISTS especies ("
            + "id INT AUTO_INCREMENT PRIMARY KEY, "
            + "nome VARCHAR(100) NOT NULL)"; 
    
    String sqlCriarTabelaTratamentos = "CREATE TABLE IF NOT EXISTS tratamentos ("
        + "id INT AUTO_INCREMENT PRIMARY KEY, "
        + "nome VARCHAR(100) NOT NULL, "
        + "data_inicio DATE NOT NULL, "
        + "data_final DATE, "
        + "descricao_inicio VARCHAR(300), "
        + "descricao_fim VARCHAR(300), "
        + "status BOOLEAN, "
        + "id_animal INT, "
        + "FOREIGN KEY (id_animal) REFERENCES animais(id))";
    
   String sqlCriarTabelaConsultas = "CREATE TABLE IF NOT EXISTS consultas ("
           + "id INT AUTO_INCREMENT PRIMARY KEY,"
           + "data DATE NOT NULL, "
           + "horario VARCHAR(5), "
           + "relatorio VARCHAR(700), "
           + "id_veterinario INT, "
           + "id_animal INT, "
           + "FOREIGN KEY (id_veterinario) REFERENCES veterinarios(id),"
           + "FOREIGN KEY (id_animal) REFERENCES animais(id))";

    String sqlCriarTabelaProdutos = "CREATE TABLE IF NOT EXISTS produtos ("
            + "id INT AUTO_INCREMENT PRIMARY KEY, "
            + "nome VARCHAR(100) NOT NULL, "
            + "quantidade INT NOT NULL,"
            + "descricao VARCHAR(300))";
    
    try (Statement stmt = connection.createStatement()) {
        stmt.execute(sqlCriarTabelaClientes);
        stmt.execute(sqlCriarTabelaAnimais);
        stmt.execute(sqlCriarTabelaEspecies);
        stmt.execute(sqlCriarTabelaVeterinarios);
        stmt.execute(sqlCriarTabelaTratamentos);
        stmt.execute(sqlCriarTabelaConsultas);
        stmt.execute(sqlCriarTabelaProdutos);
    }
}

}
