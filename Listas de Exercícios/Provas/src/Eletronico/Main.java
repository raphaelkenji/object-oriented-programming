package Eletronico;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        Produto produto = new Produto(scanner.nextLine());
        boolean procura = Utils.existe(Utils2.getLista(), produto);
        if (procura) {
            System.out.println(produto);
        }
        Produto[] arrayProdutos = transformaListEmArray(Utils2.getLista());
        somaPrecos(arrayProdutos);
    }
    public static Produto[] transformaListEmArray (List k) {
        int contaProduto = 0;
        for (int i = 0; i < k.size(); i++) {
            if (k.get(i) instanceof Produto) {
                contaProduto++;
            }
        }
        Produto[] produto = new Produto[contaProduto];
        int indiceProduto = 0;
        for (int i = 0; i < k.size(); i++) {
            if (k.get(i) instanceof Produto) {
                produto[indiceProduto++] = (Produto) k.get(i);
            }
        }
        return produto;
    }
    public static void somaPrecos (Produto[] produto) {
        double soma = 0;
        for (int i = 0; i < produto.length; i++) {
            soma += produto[i].getPreco();
        }
        System.out.println("Soma dos preços: " + soma);
    }
}
