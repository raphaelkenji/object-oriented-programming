package Biscoito;
import java.util.Scanner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira o ID do biscoito: ");
        Biscoito biscoito = new Biscoito(scanner.nextLine());
        boolean x = Utils.existe(Utils2.getLista(), biscoito);
        if (x) {
            System.out.println("Biscoito encontrado! ID: " + biscoito.getId() + " / Cor: " + biscoito.getCor() + " / Preço: " + biscoito.getPreco());
        } else {
            System.out.println("Biscoito não encontrado!");
        }

        Biscoito[] array = transformaListaEmArray(Utils2.getLista());
        calculaBiscoito(array);
        scanner.close();
    }
    public static Biscoito[] transformaListaEmArray(List k) {
        int contadorBiscoito = 0;
        for (int i = 0; i < k.size(); i++) {
            if (k.get(i) instanceof Biscoito) {
                contadorBiscoito++;
            }
        }
        int indice = 0;
        Biscoito[] biscoito = new Biscoito[contadorBiscoito];
        for (int i = 0; i < k.size(); i++) {
            if (k.get(i) instanceof Biscoito) {
                biscoito[indice++] = (Biscoito) k.get(i);
            }
        }
        return biscoito;
    }
    public static void calculaBiscoito(Biscoito[] biscoito) {
        int soma = 0;
        for (int i = 0; i < biscoito.length; i++) {
            soma += biscoito[i].getPreco();
        }
        System.out.println("Valor dos biscoitos: " + soma);
    }
}
