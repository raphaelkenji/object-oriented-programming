package P2_2022_2.Ninja;

public class Chunin extends Ninja {
    public Chunin (String cpf, String nome, int idade) {
        super(cpf, nome, idade);
    }

    public Chunin (String cpf) {
        super(cpf);
    }

    public void treinar() {
        System.out.println("Chunin " + nome + " iniciando treinamento avançado.");
    }

}
