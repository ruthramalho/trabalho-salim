package Cadastrar_Musicas_Discoteca;

import java.sql.*;

public class Conexaobd {
	
	public static Connection conectar() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection c = DriverManager.getConnection("jdbc:mysql://localhost/bibliotecamusical", "root", "");
			return(c);
		} catch (ClassNotFoundException e) {
			System.out.println("Problema na configuração do Driver do MySQL!");
		} catch (SQLException e) {
			System.out.println("Problema na conexão com o banco de dados!");
		}
		return(null);
	}
	
	public static ResultSet relatorio() {
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeQuery("SELECT * FROM genero;"));
		} catch (SQLException e) {
			System.out.println("Problema na consulta à tabela genero!");
		}
		return(null);
	}
	
	public static int inserirGenero(Genero g) {
		String insercao = "INSERT INTO `genero` (`nome`) VALUES ('"+g.getNome()+"');";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(insercao));
		} catch (SQLException e) {
			System.out.println("Problema na inserção da genero!, ou ja existe");
		}
		return(0);
	}
	public static int inserirArtista(Artista a) {
		String insercao = "INSERT INTO artista(nome,genero_id ) VALUES ('"+a.getNome()+"','"+a.getId()+"');";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(insercao));
		} catch (SQLException e) {
			System.out.println("Problema na inserção da artista!, ou ja existe");
		}
		return(0);
	}
        
         public static int inserirAlbum(Album j) {
		String insercao = "INSERT INTO album (nome, ano, artista_id ) VALUES ('"+j.getNome()+"','"+j.getAno()+"','"+j.getId()+"');";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(insercao));
		} catch (SQLException e) {
			System.out.println("Problema na inserção da artista!");
		}
		return(0);
	}
        public static int inserirMusica(Musica l) {
		String insercao = "INSERT INTO musica (nome, nota, duracao, album_id ) VALUES ('"+l.getNome()+"','"+l.getNota()+"','"+l.getDuracao()+"','"+l.getId()+"');";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(insercao));
		} catch (SQLException e) {
			System.out.println("Problema na inserção da Musica!, ou ja existe");
		}
		return(0);
	}

	public static int atualizar(Genero g, String n) {
		String atualizacao = "UPDATE `genero` SET `nome` = '"+g.getNome()+"' WHERE `nome` = '"+n+"';";
		Connection con = conectar();
		Statement st;
		try {
			st = con.createStatement();
			return(st.executeUpdate(atualizacao));
		} catch (SQLException e) {
			System.out.println("Problema na atualização da genero!");
		}
		return(0);
	}

    
	
}

