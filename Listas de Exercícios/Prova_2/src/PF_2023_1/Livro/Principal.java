package PF_2023_1.Livro;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        Instituicao instituicao = new Instituicao();

        LivroDeBiblioteca livro1 = new LivroDeBiblioteca(2001, true);
        livro1.setAutor("Michael Jackson");
        livro1.setNome("A volta dos que não foram");
        livro1.setISBN("123456789");

        LivroDeBiblioteca livro2 = new LivroDeBiblioteca(1999, false);
        livro2.setAutor("Jackson Michael");
        livro2.setNome("A ida dos que não voltaram");
        livro2.setISBN("987654321");

        LivroDeLivraria livro3 = new LivroDeLivraria(2010, true);
        livro3.setAutor("DJ Pereira");
        livro3.setNome("Original");
        livro3.setISBN("9997");

        LivroDeLivraria livro4 = new LivroDeLivraria(2005, false);
        livro4.setAutor("DJ Pereira");
        livro4.setNome("Remix");
        livro4.setISBN("9998");

        instituicao.adicionarLivro(livro1);
        instituicao.adicionarLivro(livro2);
        instituicao.adicionarLivro(livro3);
        instituicao.adicionarLivro(livro4);
        imprimeRelatorioGeral(instituicao.getListaDeLivros());

        Scanner scanner = new Scanner(System.in);
        String ISBN = scanner.nextLine();

        LivroDeBiblioteca livro = new LivroDeBiblioteca(0, false);
        livro.setISBN(ISBN);

        List <Livro> livros = instituicao.getListaDeLivros();
        if (livros.contains(livro)) {
            Livro u = livros.get(livros.indexOf(livro));
            System.out.println("Livro encontrado: " + u.getNome() + " / " + u.getAutor() + " / " + u.getAno() + " / " + u.getISBN());
        } else {
            System.out.println("Livro não encontrado:");
        }
    }

    public static void imprimeRelatorioGeral(ArrayList listaDeLivros) {
        for (int i = 0; i < listaDeLivros.size(); i++) {
            Livro livro = (Livro) listaDeLivros.get(i);
            if (livro instanceof LivroDeBiblioteca x) {
                System.out.println("Nome: " + x.getNome() + " - Ano: " + x.getAno() + " - Alugado: " + x.isAlugado());
            }
            if (livro instanceof LivroDeLivraria x) {
                System.out.println("Nome: " + x.getNome() + " - Ano: " + x.getAno() + " - Vendido: " + x.isVendido());
            }
        }
    }

}
