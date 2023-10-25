package UFC;
import java.sql.Array;
import java.util.ArrayList;

public class Lutador {
    private String nome;
    private int idade;
    private double peso;

    public Lutador (String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getPeso() {
        return peso;
    }

    public void possiveisLutas(Lutador[] lutadores) {
        String categoria = categoriaLutador();
        System.out.println("Possíveis lutas para " + nome + " na categoria " + categoriaLutador());
        for (Lutador lutador : lutadores) {
            if (lutador != this && lutador.categoriaLutador().equals(categoria)) {
                System.out.println(lutador);
            }
        }
    }

    public Lutador sorteioLuta(Lutador[] lutadores) {
        String categoria = categoriaLutador();
        ArrayList<Lutador> possiveisLutas = new ArrayList<>();
        for (Lutador lutador : lutadores) {
            if (lutador != this && lutador.categoriaLutador().equals(categoria)) {
                possiveisLutas.add(lutador);
            }
        }
        if (possiveisLutas.isEmpty()) {
            return null;
        } else {
            return possiveisLutas.get((int) (Math.random() * possiveisLutas.size()));
        }
    }

    public static Lutador criarLutador(String nome, int idade, double peso) {
        if (peso <= 65.0) {
            return new PesoPena(nome, idade, peso);
        }
        if (peso <= 83.9) {
            return new PesoMedio(nome, idade, peso);
        }
        if (peso <= 93.0) {
            return new MeioPesado(nome, idade, peso);
        } else {
            return new PesoPesado(nome, idade, peso);
        }
    }

    public String categoriaLutador() {
        return "Lutador";
    }

    @Override
    public String toString() {
        return this.nome + "/" + this.idade + "/" + this.peso;
    }
}
