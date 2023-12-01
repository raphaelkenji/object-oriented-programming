package P2_2022_1.CorposCelestes;

import java.util.Scanner;
import java.util.Map;
import java.util.Set;

public class SistemaPrincipal {
    public static void main(String[] args) {
        Set<String> dados = LerArquivo.retornaStrings();
        Scanner scan = new Scanner(System.in);
        System.out.println("Insira o ID: ");
        String id = scan.nextLine();
        CorpoCeleste corpo = new CorpoCeleste(id);
        try {
            Map <String, CorpoCeleste> mapa = Utils.retornaDados(dados);
            if (Utils.existe(mapa.values(), corpo)) {
                System.out.println(mapa.get(id));
            } else {
                System.out.println("A estrela com o ID " + id + " não existe.");
            }
        } catch (FormatoIncorretoException e) {
            System.out.println("Há um erro no seu arquivo: " + e.getMessage());
        }
    }
}

