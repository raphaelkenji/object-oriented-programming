package P2_2022_2.Ninja;

public class Genin extends Ninja {
    public Genin (String cpf, String nome, int idade) {
        super(cpf, nome, idade);
    }

    public Genin (String cpf) {
        super(cpf);
    }

    public void treinar() {
        System.out.println("Genin " + nome + " iniciando treinamento simples.");
    }

}
