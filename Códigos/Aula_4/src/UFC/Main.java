package UFC;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Lutador[] lutadores = new Lutador[3];
        for (int i = 0; i < lutadores.length; i++) {
            System.out.println("Insira os dados para o Lutador " + (i + 1));
            System.out.print("Nome: ");
            String nome = scanner.nextLine();
            System.out.print("Idade: ");
            int idade = scanner.nextInt();
            System.out.print("Peso: ");
            double peso = scanner.nextDouble();
            scanner.nextLine();
            lutadores[i] = Lutador.criarLutador(nome, idade, peso);
        }

        for (Lutador lutador : lutadores) {
            System.out.println(lutador);
            lutador.possiveisLutas(lutadores);
        }
    }
}
