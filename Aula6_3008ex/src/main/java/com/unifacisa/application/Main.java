package com.unifacisa.application;

import java.sql.Connection;
import java.sql.SQLException;

import com.unifacisa.connector.Connector;

public class Main {
	public static void main(String[] args) {
		Connection connection = Connector.getConnection();
		if (connection != null) {
			System.out.println("Conexão com o banco de dados estabelecida com sucesso!");
			// Faça operações no banco de dados aqui
			try {
				connection.close(); // Não esqueça de fechar a conexão quando terminar
			} catch (SQLException e) {
				e.printStackTrace();
			}
		} else {
			System.err.println("Falha ao estabelecer a conexão com o banco de dados.");
		}
	}
}
