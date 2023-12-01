package P2_2018_1.Livro;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        Livro livro1 = new Livro();
        livro1.setId("123");
        carrinho.addLista(livro1);
        Livro livro2 = new Livro();
        livro2.setId("123");
        carrinho.addLista(livro2);
        Livro livro3 = new Livro();
        livro3.setId("343");
        carrinho.addLista(livro3);

        Scanner scanner = new Scanner(System.in);
        Livro livro = new Livro();
        livro.setId(scanner.nextLine());

        int x = Collections.frequency(carrinho.getLista(), livro);
        System.out.println("Quantidade de vezes que o Livro com ID " + livro.getId() + " apareceu: " + x);
    }
}
