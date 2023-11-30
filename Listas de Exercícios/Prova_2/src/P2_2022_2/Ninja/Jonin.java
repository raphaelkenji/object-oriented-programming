package P2_2022_2.Ninja;

public class Jonin extends Ninja {
    public Jonin (String cpf, String nome, int idade) {
        super(cpf, nome, idade);
    }

    public Jonin (String cpf) {
        super(cpf);
    }

    public void treinar() {
        System.out.println("Jonin " + nome + " iniciando treinamento de meditação.");
    }

}
