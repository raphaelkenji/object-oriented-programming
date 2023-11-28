package PF_2023_1.Livro;
import java.util.ArrayList;

public class Instituicao {
    String nome;
    ArrayList listaDeLivros = new ArrayList();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public ArrayList getListaDeLivros() {
        return listaDeLivros;
    }

    public void adicionarLivro(Livro livro) {
        listaDeLivros.add(livro);
    }

    public void removerLivro(Livro livro) {
        listaDeLivros.remove(livro);
    }

    public void setListaDeLivros(ArrayList listaDeLivros) {
        this.listaDeLivros = listaDeLivros;
    }

}
