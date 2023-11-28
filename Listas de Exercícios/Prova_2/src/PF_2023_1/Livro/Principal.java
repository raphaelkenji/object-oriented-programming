package PF_2023_1.Livro;
import java.util.ArrayList;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Instituicao instituicao = new Instituicao();
        LivroDeBiblioteca livro1 = new LivroDeBiblioteca(2001, true);
        LivroDeBiblioteca livro2 = new LivroDeBiblioteca(1999, false);
        LivroDeLivraria livro3 = new LivroDeLivraria(2010, true);
        LivroDeLivraria livro4 = new LivroDeLivraria(2005, false);
        instituicao.adicionarLivro(livro1);
        instituicao.adicionarLivro(livro2);
        instituicao.adicionarLivro(livro3);
        instituicao.adicionarLivro(livro4);
        imprimeRelatorioGeral(instituicao.getListaDeLivros());
        Scanner scanner = new Scanner(System.in);
        String ISBN = scanner.nextLine();
    }

    public static void imprimeRelatorioGeral(ArrayList listaDeLivros) {
        for (int i = 0; i < listaDeLivros.size(); i++) {
            Livro livro = (Livro) listaDeLivros.get(i);
            if (livro instanceof LivroDeBiblioteca x) {
                System.out.println("Nome: " + x.getNome()+ " - Ano: " + x.getAno() + " - Alugado: " + x.isAlugado());
            }
            if (livro instanceof LivroDeLivraria x) {
                System.out.println("Nome: " + x.getNome()+ " - Ano: " + x.getAno() + " - Vendido: " + x.isVendido());
            }
        }
    }

}
