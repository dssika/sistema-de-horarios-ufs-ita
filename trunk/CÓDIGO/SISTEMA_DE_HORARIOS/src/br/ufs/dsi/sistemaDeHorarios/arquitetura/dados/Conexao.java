package br.ufs.dsi.sistemaDeHorarios.arquitetura.dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	private static String DRIVER="com.mysql.jdbc.Driver";
	private static String URL="jdbc:mysql://localhost:3306/SISTEMA_DE_HORARIOS";
	private static String USUARIO="root";
	private static String SENHA="igorpos";
	
	public static Connection getConexao() throws SQLException{
		try{
			Class.forName(DRIVER);
			return DriverManager.getConnection(URL, USUARIO, SENHA);
		}catch (ClassNotFoundException e){
			throw new SQLException(e.getMessage());
		}
	}
}
