package P2_2023_1.Pais;

import java.util.ArrayList;

public class Pais {
    String codigo;
    String nome;
    double populacao;
    double dimensao;
    ArrayList<Pais> fazFronteira = new ArrayList<>();

    public Pais (String codigo) {
        this.codigo = codigo.toUpperCase();
    }

    public Pais (String codigo, String nome, double dimensao) {
        this(codigo);
        this.nome = nome;
        this.dimensao = dimensao;
    }

    public void setDimensao (double dimensao) {
        this.dimensao = dimensao;
    }

    public void setPopulacao (double populacao) {
        this.populacao = populacao;
    }

    public double getDimensao() {
        return dimensao;
    }

    public double getPopulacao() {
        return populacao;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getDensidade() {
        return populacao/dimensao;
    }

    public String getNome() {
        return nome;
    }

    public boolean fazFronteira(Pais pais) {
        return fazFronteira.contains(pais);
    }

    public ArrayList<Pais> getFronteira() {
        return fazFronteira;
    }

    public void addFronteira (Pais pais) {
        fazFronteira.add(pais);
    }

    @Override
    public boolean equals(Object o) {
        if (o instanceof Pais u) {
            return this.getCodigo().equals(u.getCodigo());
        }
        return false;
    }

    public static boolean exists (ArrayList x, Object y) {
        return x.contains(y);
    }

}
