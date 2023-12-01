package P2_2018_1.Livro.HashSet;

public class Principal {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionaLivro(new Livro("123"));
        carrinho.adicionaLivro(new Livro("123"));
        carrinho.adicionaLivro(new Livro("333"));
        carrinho.adicionaLivro(new Livro("123"));
        carrinho.adicionaLivro(new Livro("123"));
        carrinho.adicionaLivro(new Livro("123"));
        carrinho.adicionaLivro(new Livro("123"));
        carrinho.adicionaLivro(new Livro("123"));
        carrinho.adicionaLivro(new Livro("123"));

        Utils.imprimeFrequencia(carrinho);
    }
}