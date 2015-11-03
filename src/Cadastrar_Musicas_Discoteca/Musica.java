
package Cadastrar_Musicas_Discoteca;


public class Musica {
    private String nome;
    private int nota;
    private int duracao;
    private int id;

    public Musica(String nome, int nota, int duracao, int id) {
        this.nome = nome;
        this.nota = nota;
        this.duracao = duracao;
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

       
    public String getNome(){
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public float getNota(){
        return nota;
    }
     public void setNota(int nota) {
        this.nota = nota;
    }
    public int getDuracao(){
        return duracao;
    }
     public void setDuracao(int duracao) {
        this.duracao = duracao;
    }
}

