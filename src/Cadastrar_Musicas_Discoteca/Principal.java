package Cadastrar_Musicas_Discoteca;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Principal {

	public static void main(String[] args) {
            String nome;
            int nota,duracao,ano;

		Genero r = new Genero ("Rock");
		if(Conexaobd.inserirGenero(r)!=0) {
			System.out.println("Genero inserido sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                Genero s = new Genero ("Sertanejo");
		if(Conexaobd.inserirGenero(s)!=0) {
			System.out.println("Genero inserido sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
		
                Genero re = new Genero ("Reggae");
		if(Conexaobd.inserirGenero(re)!=0) {
			System.out.println("Genero inserido sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
		nome = ("daniel");
		Artista m = new Artista(nome,1);
		if(Conexaobd.inserirArtista(m)!=0) {
			System.out.println("Artista  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                nome =("Henriqueo");
                Artista n = new Artista(nome,2);
		if(Conexaobd.inserirArtista(n)!=0) {
			System.out.println("Artista  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                nome =("jads");
                Artista n1 = new Artista(nome,3);
		if(Conexaobd.inserirArtista(n1)!=0) {
			System.out.println("Artista  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                nome = ("mil e uma noite");
                Album j = new Album(nome,5,1);
		if(Conexaobd.inserirAlbum(j)!=0) {
			System.out.println("Album  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                 nome = ("estrelas");
                Album j1 = new Album(nome,5,1);
		if(Conexaobd.inserirAlbum(j1)!=0) {
			System.out.println("Album  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                 nome = ("para sempre");
                Album j2 = new Album(nome,5,1);
		if(Conexaobd.inserirAlbum(j2)!=0) {
			System.out.println("Album  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                Musica c = new Musica ("amor",12,12,1);
		if(Conexaobd.inserirMusica(c)!=0) {
			System.out.println("Musica inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                
                Musica c1 = new Musica ("lepo lepo",12,12,1);
		if(Conexaobd.inserirMusica(c)!=0) {
			System.out.println("Musica  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
                Musica c2 = new Musica ("sofrencia",12,12,1);
		if(Conexaobd.inserirMusica(c)!=0) {
			System.out.println("Musica  inserida com sucesso no banco!");
		} else {
			System.out.println("Erro na inserção!");
		}
		
		ResultSet res = Conexaobd.relatorio();
		if(res!=null) {
			try {
				while(res.next()) {
					System.out.println("genero: "+res.getString("nome"));
					System.out.println("==========");
				}
			} catch (SQLException e) {
				System.out.println("Problema para exibir registros!");
			}
		} else {
			System.out.println("A pesquisa não retornou nenhum registro!");
		}
		
		
	}

}

