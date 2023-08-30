package com.unifacisa.application;

import java.awt.Container;
import java.awt.FlowLayout;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CriarTable extends JFrame {
	private Connection con;
	private Statement st;

	public CriarTable() {
		String driver = "com.mysql.cj.jdbc.Driver";
		String jdbcUser = "root";
		String jdbcPassword = "759522";
		String url = "jdbc:mysql://localhost:3306/nome";

		try {

			Class.forName(driver);
			con = DriverManager.getConnection(url, jdbcUser, jdbcPassword);
			JOptionPane.showMessageDialog(this, "Sucesso", "mensagemm", JOptionPane.WARNING_MESSAGE);
		} catch (SQLException eSQl) {
			eSQl.printStackTrace();
			JOptionPane.showMessageDialog(this, "faha" + "mensagem" + eSQl.getMessage(), "erro",
					JOptionPane.ERROR_MESSAGE);
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(this, "falha" + "mensagem" + e.getMessage(), "erro",
					JOptionPane.ERROR_MESSAGE);
		}

		String setencaSql = "CREATE TABLE primeira (codigo integer PRIMARY KEY, nome VARCHAR(50))";
		try {
			st = con.createStatement();
			st.executeUpdate(setencaSql);
			JOptionPane.showMessageDialog(this, "Sucesso", "mensagemm", JOptionPane.WARNING_MESSAGE);
		} catch (SQLException eSQL) {
			eSQL.printStackTrace();
			JOptionPane.showMessageDialog(this, "falha" + "mensagem" + eSQL.getMessage(), "erro",
					JOptionPane.ERROR_MESSAGE);
			System.exit(2);
		}

		try {
			st.close();
			con.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.exit(3);
		}
		Container P = getContentPane();
		P.setLayout(new FlowLayout());
		JLabel mensagem = new JLabel("Testou exemplo create");

		P.add(mensagem);

	}

	public static void main(String[] args) {
		CriarTable ex = new CriarTable();
		ex.setDefaultCloseOperation(EXIT_ON_CLOSE);
		ex.setTitle("usando create table");
		ex.setVisible(true);
		ex.setSize(400, 300);
	}
}