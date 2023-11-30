package P2_2022_2.Ninja;

public class Ninja implements Treinamento, Comparable<Ninja> {
    String cpf;
    String nome;
    int idade;

    public Ninja (String cpf, String nome, int idade) {
        this.cpf = cpf;
        this.nome = nome;
        this.idade = idade;
    }

    public Ninja (String cpf) {
        this.cpf = cpf;
    }

    public void treinar() {
        System.out.println("Ninja treinando...");
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public boolean equals (Object o) {
        if (o instanceof Ninja n) {
            return this.getCpf().equals(n.getCpf());
        }
        return false;
    }

    public String toString() {
        return cpf + " / " + nome + " / " + idade;
    }

    public int compareTo (Ninja n) {
        return Integer.compare(idade, n.idade);
    }

}
